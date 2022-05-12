package com.leavemanagementsystem.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.leavemanagementsystem.dao.ApplyPermissionRepository;
import com.leavemanagementsystem.model.ApplyPermission;
import com.leavemanagementsystem.validation.ApplyPermissionValidation;

@Service
public class ApplyPermissionService{
	@Autowired
ApplyPermissionRepository applypermissionRepository;

public void save( ApplyPermission applyPermission) throws Exception {
	try {
		ApplyPermissionValidation.validateApplyPermission(applyPermission);
		applypermissionRepository.save(applyPermission);
	} catch (Exception e) {
		throw new Exception(e.getMessage());
	}
}


public List<ApplyPermission> findAll() throws Exception {
	List<ApplyPermission> listApplyPermission=null;
	try {
		listApplyPermission= applypermissionRepository.findAll();
	}catch(Exception e) {
		throw new Exception(e.getMessage());
	}
	return listApplyPermission;
}	public void update(@PathVariable("id") Integer id, @RequestBody ApplyPermission applyLeave)throws Exception{
	try {
		applyPermission.setId(id);
		ApplyPermissionValidation.validateApplyPermission(applyPermission);
		applypermissionRepository.save(applyPermission);
	}catch (Exception e) {
		throw new Exception(e.getMessage());
		}
	}
}