package com.app.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Employee;
import com.app.repo.Repository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	public Repository repo;
	
	
	@Override
	public Employee addEmployeeDetails(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}


	@Override
	public Employee findbyidd(Long id) {
		// TODO Auto-generated method stub
	
		return repo.findById(id).get() ;
	}


	@Override
	public String deleteEmpDetails(Long id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
		return "DetailsDelete";
	}

	@Override
	public Employee updateEmpDetails(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);	
	}

}
