package com.krantitech.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.krantitech.emp.dao.EmpDaoImp;
import com.krantitech.emp.model.EmployeDetails;

@Service("EmpServiceImp")
public class EmpServiceImp  {
	
	@Autowired
	EmpDaoImp empDaoImp;
	
	
	@Transactional
	
	public void addEmpDeatils(EmployeDetails employeDetails) {
		empDaoImp.addEmpDeatils(employeDetails);

	}
	@Transactional
	
	public void UpdateEmpDeatils(EmployeDetails employeDetails) {
		empDaoImp.UpdateEmpDeatils(employeDetails);

	}
	@Transactional
	
	public void DelateEmpDeatils(int id) {
		empDaoImp.DelateEmpDeatils(id);
	}
	/*@Transactional
	
	public EmployeDetails GetEmpDeatilsById(int id) {
		
		return empDaoImp.GetEmpDeatilsById(id);
	}*/
	@Transactional
	
	public List<EmployeDetails> GetAllEmpDeatils() {
		
		return empDaoImp.GetAllEmpDeatils();
	}

}
