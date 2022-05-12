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
import org.springframework.web.bind.annotation.RestController;
import com.leavemanagementsystem.dao.ApplyLeaveRepository;
import com.leavemanagementsystem.model.ApplyLeave;
import com.leavemanagementsystem.service.ApplyLeaveService;
@RestController
public class ApplyLeaveController {
	@Autowired
	ApplyLeaveRepository applyLeaveRepository;
	
	@Autowired
	ApplyLeaveService applyLeaveService;
	@PostMapping("applyleave/leave") // register details will be insert
	public ResponseEntity  <String> save(@RequestBody ApplyLeave applyLeave){
		try {
			applyLeaveService.save(applyLeave);
			return new ResponseEntity<String> (HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String> (e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@GetMapping("applyLeave/list") // list all users
	public List<ApplyLeave> findAll() {
		List<ApplyLeave> applyLeavelist = null;
		try {
			applyLeavelist=applyLeaveService.findAll();
			}catch(Exception e) {
				e.getMessage();
			}
		return applyLeavelist;
	}
	@DeleteMapping("applyleave/{id}")
	public void delete(@PathVariable("id") Integer id) {
		applyLeaveRepository.deleteById(id);
		
	}
	@PutMapping("applyleave/{id}")
	public ResponseEntity<String> update (@PathVariable("id") Integer id, @RequestBody ApplyLeave applyLeave){
		try {
			applyLeaveService.save(applyLeave);
			return new ResponseEntity<String> ("success",HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String> (e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		}
	}