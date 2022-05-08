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
@Entity(name="apply_leave")


public class ApplyLeave {
    @Id
	@Column(name="id")
	private Integer id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="number_of_days")
    private String numberofdays;
	

	@Column(name="leave_from_date")
	private String leavefromdate;
	
	@Column(name="leave_to_date")
	private String leavetodate;
	
	@Column(name="reason")
	private String reason;

	
}	
