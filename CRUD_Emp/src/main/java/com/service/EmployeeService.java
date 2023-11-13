package com.service;

import java.util.List;

import com.entity.ContactUsEntity;
import com.entity.EmployeeEntity;

public interface EmployeeService {

	void saveEmployee(EmployeeEntity employeeEntity);

	List<EmployeeEntity> getAllEmployees();

	void deleteEmp(int employeeId);

	EmployeeEntity fetchEmployee(int employeeId);

	void UpdateEmployee(EmployeeEntity employeeEntity);
	
	 List<EmployeeEntity> getEmployeesByAdminId(int adminId);
}
