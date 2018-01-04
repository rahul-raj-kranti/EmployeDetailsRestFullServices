package com.krantitech.emp.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.krantitech.emp.model.EmployeDetails;


@Repository("EmpDao")
public class EmpDaoImp implements EmpDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf)
	{
		this.sessionFactory=sf;
	}
	
	/*SessionFactory for AddEmpDetails */
	@Override
	public void addEmpDeatils(EmployeDetails employeDetails) {
		Session session=this.sessionFactory.getCurrentSession();
		session.save(employeDetails);

	}
	/*SessionFactory for Update EmpDetails */
	
	@Override
	public void UpdateEmpDeatils(EmployeDetails employeDetails) {
		Session session=this.sessionFactory.getCurrentSession();
		session.update(employeDetails);


	}
	/*SessionFactory for Delate EmpDetails By Id */
	@Override
	public void DelateEmpDeatils(int id) {
		Session session=this.sessionFactory.getCurrentSession();
		EmployeDetails emp= (EmployeDetails ) session.load(EmployeDetails.class, new Integer(id) );
		if (null !=emp) {
			session.delete(emp);
		}

	}
	/*SessionFactory for GetEmpDeatilsById */
	
	/*@Override
	public EmployeDetails GetEmpDeatilsById(int id) {
		Session session=this.sessionFactory.getCurrentSession();
		EmployeDetails employeDetails1 = (EmployeDetails) session.load(EmployeDetails.class, new Integer(id));
		employeDetails1.getId();
		employeDetails1.getEmpName();
		return employeDetails1;
	}*/
	/*SessionFactory for GetAllEmpDeatils*/
	@Override
	public List<EmployeDetails> GetAllEmpDeatils() {
		Session session=this.sessionFactory.getCurrentSession();
		List<EmployeDetails>emplist=session.createQuery("from EmployeDetails").list();
		return emplist;
		
	}

}
