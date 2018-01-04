package com.krantitech.emp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeDetails")
public class EmployeDetails {
	
	
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="EmpName")
	private String EmpName;
	
	@Column(name="EmpMail")
	private String EmpMail;
	
	@Column(name="EmpSalary")
	private double EmpSalary;

	public EmployeDetails() {
		super();
		
	}

	public EmployeDetails(int id, String empName, String empMail, double empSalary) {
		super();
		this.id = id;
		EmpName = empName;
		EmpMail = empMail;
		EmpSalary = empSalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpMail() {
		return EmpMail;
	}

	public void setEmpMail(String empMail) {
		EmpMail = empMail;
	}

	public double getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(double empSalary) {
		EmpSalary = empSalary;
	}
	 /*@Override
	 public String toString() {
	  return "EmployeDetails [EmpName=" + EmpName + ",EmpMail=" + EmpMail + "]";
	 }*/

}
