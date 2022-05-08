package com.leavemanagementsystem.dao;

import com.leavemanagementsystem.model.ApplyLeave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ApplyLeaveRepository extends JpaRepository<ApplyLeave,Integer> {

	
//	@Modifying
//	@Query("delete from com.leavemanagementsystem.model.User u where u.Id=:id")
//	void deleteById(@Param("id") String id);
	
}