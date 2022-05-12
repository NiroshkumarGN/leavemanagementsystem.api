package com.leavemanagementsystem.dao;

import com.leavemanagementsystem.model.ApplyPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ApplyPermissionRepository extends JpaRepository<ApplyPermission,Integer> {

	
//	@Modifying
//	@Query("delete from com.leavemanagementsystem.model.User u where u.Id=:id")
//	void deleteById(@Param("id") String id);
	
}


