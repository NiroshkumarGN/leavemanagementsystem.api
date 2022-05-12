package com.leavemanagementsystem.validation;

import com.leavemanagementsystem.model.User;
public class UserValidation {
	public static void validateUser(User user) throws Exception {
		
		
		if (user.getName() != null && !user.getName().trim().equals("")) {
		} else {
			throw new Exception("The name cannot be empty");
		}
		if (user.getEmailId().contains("@") && user.getEmailId().contains(".com")) {
		} else {
			throw new Exception("Enter a valid email ID");
		}
		if (user.getPassword().length() > 8) {
		} else {
			throw new Exception("Enter a strong password");
		}
		if (user.getBranchName() != null) {
		} else {
			throw new Exception("The branchname cannot be empty");
		}
		if (user.getMobileNumber().length() == 10) {
		} else {
			throw new Exception("The mobile number should contain 10 digits");
		}
		if (user.getDateOfBirth() != null ) {
		} else {
			throw new Exception("The dob cannot be empty");
		}
		if (user.getGender() != null) {
		} else {
			throw new Exception("The gender cannot be empty");
		}if (user.getRole() != null) {
		} else {
			throw new Exception("The role cannot be empty");
		}
		System.out.println("You have registerd successfully");
	}
}
