package com.dao;

import java.util.List;

import com.entity.AdminEntity;
import com.entity.EmployeeEntity;

public interface AdminDao {

	public AdminEntity authenticate(String email, String password);
	

	public void saveAdmin(AdminEntity adminEntity);


	public AdminEntity fetchAdmin(int adminId);


	public void UpdateAdmin(AdminEntity adminEntity);


	public void deleteAdmin(int adminId);



}
