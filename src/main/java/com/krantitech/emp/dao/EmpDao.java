package com.krantitech.emp.dao;

import java.util.List;


import com.krantitech.emp.model.EmployeDetails;

public interface EmpDao {
	/*Add And Update Employe Details*/
	public void addEmpDeatils (EmployeDetails employeDetails);
	public void UpdateEmpDeatils (EmployeDetails employeDetails);
	
	/*Delate EmpDetailsById*/
	public void DelateEmpDeatils (int id);
	
	/*Retrive Details by Id And All Employe Details
	public EmployeDetails GetEmpDeatilsById(int id);*/
    public List<EmployeDetails> GetAllEmpDeatils();
	

}
