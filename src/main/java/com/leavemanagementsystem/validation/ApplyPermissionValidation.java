package com.leavemanagementsystem.validation;

import com.leavemanagementsystem.model.ApplyPermission;

public class ApplyPermissionValidation {
public static void validateApplyPermission(ApplyPermission applyPermission) throws Exception {
		
		if (applyPermission.getId() != null) {
		} else {
			throw new Exception("The id cannot be empty");
		}
		
		if (applyPermission.getName() != null && !applyPermission.getName().trim().equals("")) {
		} else {
			throw new Exception("The name cannot be empty");
		}
		if (applyPermission.getReason() != null) {
		} else {
			throw new Exception("The reason cannot be empty");
		}
		
		

}
}