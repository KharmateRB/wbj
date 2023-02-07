package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="emps")
public class Employee extends BaseEntity {
	public Employee() {
		
	}
	@Column(length=30)
	private String firstname;
	@Column(length=30)
	private String lastname;
	@Column(length=30,unique=true)
	private String email;
	
	@Column(length=30,nullable=false)
	private String password;
	@Column(length=30)
	private String deptno;
	@Column(length=56)
	private Double salary;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", deptno=" + deptno
				+ ", salary=" + salary + "]";
	}
	public Employee(String firstname, String lastname, String email, String password, String deptno, Double salary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.deptno = deptno;
		this.salary = salary;
	}
	

}
