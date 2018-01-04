package com.krantitech.emp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.krantitech.emp.model.EmployeDetails;
import com.krantitech.emp.service.EmpServiceImp;

@RestController
public class EmpController {
	
	
	@Autowired
	EmpServiceImp empServiceImp;
	
	@RequestMapping(value = "/GetAllEmpDeatils", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<EmployeDetails> GetAllEmpDeatils() {
		
		List<EmployeDetails> listOfEmpDetails = empServiceImp.GetAllEmpDeatils();
		return listOfEmpDetails;
	}

/*	@RequestMapping(value = "/GetEmpDeatils/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public EmployeDetails GetEmpDeatilsById(@PathVariable("id") int id) {
		
		return empServiceImp.GetEmpDeatilsById(id);
	}*/

	@RequestMapping(value = "/addEmpDeatils", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addEmpDeatils(@RequestBody EmployeDetails employeDetails ) {	
		empServiceImp.addEmpDeatils(employeDetails);
		
	}

	@RequestMapping(value = "/UpdateEmpDeatils", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateEmpDeatils(@RequestBody EmployeDetails employeDetails) {
		empServiceImp.UpdateEmpDeatils(employeDetails);
	}

	@RequestMapping(value = "/DelateEmpDeatils/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void DelateEmpDeatils(@PathVariable("id") int id) {
		empServiceImp.DelateEmpDeatils(id);		
	}	
	
	

}
