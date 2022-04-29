package com.leavemanagementsystem.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leavemanagementsystem.dao.UserRepository;
import com.leavemanagementsystem.model.User;


@RestController
	public class UserController {
		
 	    @Autowired
		UserRepository userRepository;	
	

	@PostMapping("user/register")//register details will be insert
	public User save(@RequestBody User user) {
		userRepository.save(user);
		return user;
	}
		
	@GetMapping("/list")//list all employees
    public List<User>findAll(){
   		List<User>userlist=userRepository.findAll();
		return userlist;
	}
		@DeleteMapping("user/{useremail_id}")
		public void delete(@PathVariable("useremail_id") String useremail_id)
		{
			userRepository.deleteById(useremail_id);
		}
//		@PutMapping("register/{userId}")
//		public void update(@PathVariable("userId") String userId, @RequestBody User user)
//		{
//	     user.setUsername(userId);
//		userRepository.save(user);
//		}
		
	
}