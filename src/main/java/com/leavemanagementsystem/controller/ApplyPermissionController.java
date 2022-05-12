package com.leavemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.leavemanagementsystem.dao.ApplyPermissionRepository;
import com.leavemanagementsystem.model.ApplyPermission;
import com.leavemanagementsystem.service.ApplyPermissionService;

public class ApplyPermissionController {
	@Autowired
	ApplyPermissionRepository applyPermissionRepository;
	
	@Autowired
	ApplyPermissionService applyPermissionService;
	@PostMapping("applypermission/permission") // register details will be insert
	public ResponseEntity  <String> save(@RequestBody ApplyPermission applyPermission){
		try {
			applyPermissionService.save(applyPermission);
			return new ResponseEntity<String> (HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String> (e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@GetMapping("applyPermission/list") // list all users
	public List<ApplyPermission> findAll() {
		List<ApplyPermission> applyLeavelist = null;
		try {
			applyLeavelist=applyPermissionService.findAll();
			}catch(Exception e) {
				e.getMessage();
			}
		List<ApplyPermission> applyPermissionlist;
		return applyPermissionlist;
	}
	@DeleteMapping("applyPermission/{id}")
	public void delete(@PathVariable("id") Integer id) {
		applyPermissionRepository.deleteById(id);
		
	}
	@PutMapping("applyPermission/{id}")
	public ResponseEntity<String> update (@PathVariable("id") Integer id, @RequestBody ApplyPermission applyPermission){
		try {
			applyPermissionService.save(applyPermission);
			return new ResponseEntity<String> ("success",HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String> (e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		}
	}

}
