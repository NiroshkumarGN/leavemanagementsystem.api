package com.leavemanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="leave_management_app_user")


public class User {

	@Column(name="name")
	private String name;
	
	@Id
	@Column(name="email_id")
	private String email_id;
	
	@Column(name="password")
	private String password;
	
	@Column(name="role")
	private String role;
	
	@Column(name="employee_id")
	private String employee_id;
	
	@Column(name="branch_name")
	private String branch_name;
	
	
	@Column(name="mobile_number")
	private String mobile_number;
	
	@Column(name="date_of_birth")
	private String date_of_birth;
	
	@Column(name="gender")
	private String gender;

	

}
