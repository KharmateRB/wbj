package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Employee;

public interface Repository extends JpaRepository<Employee, Long> {

	
	
	

}
