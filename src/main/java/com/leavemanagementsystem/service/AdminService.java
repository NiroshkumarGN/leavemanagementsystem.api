
package com.leavemanagementsystem.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

	public Admin login (Admin admin) throws Exception {
		Optional<Admin> adminObj = adminRepository.findByEmailAndPassword(admin.getEmail(), admin.getPassword());
		if (adminObj.isPresent()) {
			return adminObj.get();

		} else {
			throw new Exception("Invalid Login Credentials");
		}
	}
}