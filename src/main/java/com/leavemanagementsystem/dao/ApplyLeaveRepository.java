package com.leavemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.leavemanagementsystem.model.ApplyLeave;

@Repository
public interface ApplyLeaveRepository extends JpaRepository<ApplyLeave,String> {
	
	@Modifying
	@Query("delete from com.leavemanagementsystem.model.User u where u.employeeId=:id")
	void deleteById(@Param("id") String id);
	
}