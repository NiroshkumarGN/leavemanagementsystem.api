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
@Entity(name="apply_leave")


public class ApplyLeave {
    @Id
	@Column(name="employee_id")
	private String employee_id;
	

	@Column(name="leave_from_date")
	private String leave_from_date;
	
	@Column(name="leave_to_date")
	private String leave_to_date;
	
	@Column(name="reason")
	private String reason;
	
	
}	
