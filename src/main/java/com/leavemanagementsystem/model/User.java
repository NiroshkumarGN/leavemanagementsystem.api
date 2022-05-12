package com.leavemanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="leave_management_app_user")


public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="password")
	private String password;
	

	@Column(name="branch_name")
	private String branchName;
	
	
	@Column(name="mobile_number")
	private String mobileNumber;
	
	@Column(name="date_of_birth")
	private String dateOfBirth;
	
	@Column(name="gender")
	private String gender;

	private String role;
	

}
