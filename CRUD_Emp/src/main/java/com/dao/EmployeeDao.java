package com.dao;

import java.util.List;

import com.entity.EmployeeEntity;

public interface EmployeeDao {
	public void saveEmp(EmployeeEntity employeeEntity);

	public EmployeeEntity authenticate(String email, String password);
	
	List<EmployeeEntity> getAllEmployees();

	public void deleteEmp(int employeeId);

	public void UpdateEmployee(EmployeeEntity employeeEntity);

	public EmployeeEntity fetchEmployee(int employeeId);

}
