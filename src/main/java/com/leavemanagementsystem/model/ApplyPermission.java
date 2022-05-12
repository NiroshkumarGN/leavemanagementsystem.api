package com.leavemanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Entity(name="apply_permission")


public class ApplyPermission {
	@Id
	@Column(name="id")
	private Integer id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="date_of_permission")
    private String dateOfPermission;
	

	@Column(name="permission_time")
	private String permissionTime;
	
	@Column(name="reason")
	private String reason;

	
}	


