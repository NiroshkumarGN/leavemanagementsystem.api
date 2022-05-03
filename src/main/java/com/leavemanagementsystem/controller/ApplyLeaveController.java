package com.leavemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leavemanagementsystem.dao.ApplyLeaveRepository;
import com.leavemanagementsystem.model.ApplyLeave;



@RestController
	public class ApplyLeaveController {
		
 	    @Autowired
		ApplyLeaveRepository applyleaveRepository;	
	

	@PostMapping("user/leave")//leave details will be insert
	public ApplyLeave save(@RequestBody ApplyLeave user) {
		applyleaveRepository.save(user);
		return user;
	}
		
	@GetMapping("/leavelist")//list all employees
  public List<ApplyLeave>findAll(){
 		List<ApplyLeave> applyleavelist=applyleaveRepository.findAll();
	return applyleavelist;
}
		@DeleteMapping("leave/delete/{employee_id}")
	public void delete(@PathVariable("employee_id") String employeeId)
	{
		applyleaveRepository.deleteById(employeeId);
	}
////		@PutMapping("register/{userId}")
////		public void update(@PathVariable("userId") String userId, @RequestBody User user)
////		{
////	     user.setUsername(userId);
////		userRepository.save(user);
////		}
//		
//	
}