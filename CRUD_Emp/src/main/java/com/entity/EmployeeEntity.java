package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //this class is a entity class: so all the variables mapped in the table and EmployeeEntity table is a
public class EmployeeEntity {	
	
	int employeeId;
	String employeeName;
	String emailId;
	String phone;
	String designation;
	String address;
	int salary;
	
	public EmployeeEntity() {
		super();
	}
	public EmployeeEntity(String emailId,String employeeName,String phone,String designation,String address, int salary) {
		super();
	
		this.employeeName = employeeName;
		this.emailId = emailId;
		this.salary = salary;
		this.phone = phone;
		this.address = address;
		this.designation = designation;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getEmployeeId() {
	    return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emailId=" + emailId
				+ ", phone=" + phone + ", designation=" + designation + ", address=" + address + ", salary=" + salary
				+ "]";
	}
	

}
