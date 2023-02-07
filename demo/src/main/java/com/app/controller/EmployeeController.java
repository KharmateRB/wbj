package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empser;
	
	@PostMapping("/add")
	public Employee addEmployeeDetails(@RequestBody Employee emp) {
		return empser.addEmployeeDetails(emp);
	}
	
	@GetMapping("/getbyid/{id}")
	public Employee findBYId(@PathVariable Long id) {
		return empser.findbyidd(id);	
	}
	
	@DeleteMapping("/deletebyId/{id}")
	public String deleteEmployeeDetails(@PathVariable Long id) {
		return empser.deleteEmpDetails(id);
	}
	@PutMapping("/update")
	public Employee updateEmployeeDetails(@RequestBody Employee emp) {
		return empser.updateEmpDetails(emp);
	}

}
