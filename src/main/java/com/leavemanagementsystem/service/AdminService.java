package com.leavemanagementsystem.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.leavemanagementsystem.dao.AdminRepository;
import com.leavemanagementsystem.model.Admin;
import com.leavemanagementsystem.validation.AdminValidation;

@Service
public class AdminService {
	@Autowired
	AdminRepository adminRepository;

	public void save(Admin admin) throws Exception {
		try {
			AdminValidation.validate(admin);
			adminRepository.save(admin);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public String login(@RequestBody Admin admin) {
		Optional<Admin> userObj = adminRepository.findByEmailAndPassword(admin.getEmail(), admin.getPassword());
		if (userObj.isPresent()) {
			return "login is successful";
		} else {
			return "login is failed";
		}
	}
}