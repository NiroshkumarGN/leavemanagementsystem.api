package com.leavemanagementsystem.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.leavemanagementsystem.dao.UserRepository;
import com.leavemanagementsystem.model.User;
import com.leavemanagementsystem.validation.UserValidation;
@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public void save( User user) throws Exception {
		try {
			UserValidation.validateUser(user);
			userRepository.save(user);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public String login(@RequestBody User user) {
		Optional<User> userObj=userRepository.findByEmailidAndPassword(user.getEmailid(),user.getPassword());
		if(userObj.isPresent()) {
			return "success";
		}else {
		return "unsuccess";
		}
}
	public List<User> findAll() throws Exception {
		List<User> listUser=null;
		try {
			listUser=userRepository.findAll();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return listUser;
	}
	public void update(@PathVariable("id") Integer id, @RequestBody User user)throws Exception{
		try {
			user.setId(id);
			UserValidation.validateUser(user);
			userRepository.save(user);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}