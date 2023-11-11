package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ContactUsDao;
import com.dao.EmployeeDao;
import com.entity.ContactUsEntity;
import com.entity.EmployeeEntity;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao; //creating object to pass data

	@Override
	public void saveEmployee(EmployeeEntity employeeEntity) {
		employeeDao.saveEmp(employeeEntity); //save and pass
	}
	
	@Override
	public List<EmployeeEntity> getAllEmployees() {
	    return employeeDao.getAllEmployees(); // Delegate the call to the DAO layer
	}
	
		@Override
		public void deleteEmp(int employeeId) {
		
			 employeeDao.deleteEmp(employeeId);
		}
		
		@Override
		public EmployeeEntity fetchEmployee(int employeeId) {
			EmployeeEntity employeeEntity=employeeDao.fetchEmployee(employeeId);
			return employeeEntity;
		}

		@Override
		public void UpdateEmployee(EmployeeEntity employeeEntity) {
			 employeeDao.UpdateEmployee(employeeEntity);
			
		}


}
