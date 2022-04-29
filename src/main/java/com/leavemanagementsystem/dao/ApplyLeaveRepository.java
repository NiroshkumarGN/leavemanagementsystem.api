package com.leavemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leavemanagementsystem.model.ApplyLeave;

@Repository
public interface ApplyLeaveRepository extends JpaRepository<ApplyLeave,String> {
	
}