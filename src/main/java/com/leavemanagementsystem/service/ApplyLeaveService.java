package com.leavemanagementsystem.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.leavemanagementsystem.dao.ApplyLeaveRepository;
import com.leavemanagementsystem.model.ApplyLeave;
import com.leavemanagementsystem.validation.ApplyLeaveValidation;
@Service
public class ApplyLeaveService {
	@Autowired
	ApplyLeaveRepository applyleaveRepository;
	
	public void save( ApplyLeave applyLeave) throws Exception {
		try {
			ApplyLeaveValidation.validateApplyLeave(applyLeave);
			applyleaveRepository.save(applyLeave);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	

	public List<ApplyLeave> findAll() throws Exception {
		List<ApplyLeave> listApplyLeave=null;
		try {
			listApplyLeave=applyleaveRepository.findAll();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return listApplyLeave;
	}	public void update(@PathVariable("id") Integer id, @RequestBody ApplyLeave applyLeave)throws Exception{
		try {
			applyLeave.setId(id);
			ApplyLeaveValidation.validateApplyLeave(applyLeave);
			applyleaveRepository.save(applyLeave);
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}


	

	
	

	
	
}