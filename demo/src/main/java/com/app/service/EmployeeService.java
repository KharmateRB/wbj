package com.app.service;

import com.app.pojos.Employee;

public interface EmployeeService {
	public Employee addEmployeeDetails(Employee emp);
	public Employee findbyidd(Long id);
	public String deleteEmpDetails(Long id);
	public Employee updateEmpDetails(Employee emp);


}
