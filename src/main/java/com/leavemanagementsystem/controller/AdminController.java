package com.leavemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.leavemanagementsystem.dao.AdminRepository;
import com.leavemanagementsystem.dto.MessageDTO;
import com.leavemanagementsystem.model.Admin;
import com.leavemanagementsystem.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminRepository adminRepository;
	@Autowired
	AdminService adminService;

	@PostMapping("admin/register") // register details will be insert
	public ResponseEntity<?> save(@RequestBody Admin admin) {
		try {
			adminService.save(admin);
			return new ResponseEntity<>( HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST
					);
		}
	}
	@PostMapping("admin/login")
	public ResponseEntity<?> login(@RequestBody Admin admin) {
		try {
			Admin admin1 = adminService.login(admin);
			return new ResponseEntity<>(admin1, HttpStatus.OK);
		} catch (Exception e) {
			MessageDTO dto = new MessageDTO(e.getMessage());
			return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
	
	}
	}
}
