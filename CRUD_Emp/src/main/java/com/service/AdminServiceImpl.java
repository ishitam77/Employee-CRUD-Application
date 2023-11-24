package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDao;
import com.dao.EmployeeDao;
import com.entity.AdminEntity;
import com.entity.EmployeeEntity;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminDao adminDao; //creating object to pass data
	
	@Autowired
    private EmployeeDao employeeDao;

	@Override
	public void saveAdmin(AdminEntity adminEntity) {
		adminDao.saveAdmin(adminEntity); //save and pass
	}

	@Override
	public AdminEntity authenticate(String email, String password) {
		AdminEntity adminEntity=adminDao.authenticate(email,password);
		return adminEntity;
	}
	
		
		@Override
		public AdminEntity fetchAdmin(int adminId) {
			AdminEntity adminEntity=adminDao.fetchAdmin(adminId);
			return adminEntity;
		}


		@Override
		public void UpdateAdmin(AdminEntity adminEntity) {
			adminDao.UpdateAdmin(adminEntity);
			
		}


	    @Override
	    public void deleteAdmin(int adminId) {
	        List<EmployeeEntity> employees = employeeDao.getEmployeesByAdminId(adminId);
	        for (EmployeeEntity employee : employees) {
	            employeeDao.deleteEmp(employee.getEmployeeId());
	        }
	        adminDao.deleteAdmin(adminId);
	    }


}
