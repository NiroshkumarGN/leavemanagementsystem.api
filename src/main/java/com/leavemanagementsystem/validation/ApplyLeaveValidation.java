package com.leavemanagementsystem.validation;

import com.leavemanagementsystem.model.ApplyLeave;
public class ApplyLeaveValidation {
	public static void validateApplyLeave(ApplyLeave applyLeave) throws Exception {
		
		if (applyLeave.getId() != null) {
		} else {
			throw new Exception("The id cannot be empty");
		}
		
		if (applyLeave.getName() != null && !applyLeave.getName().trim().equals("")) {
		} else {
			throw new Exception("The name cannot be empty");
		}
		if (applyLeave.getReason() != null) {
		} else {
			throw new Exception("The reason cannot be empty");
		}
		
		
		System.out.println("You have applied leave successfully");
	}
}
