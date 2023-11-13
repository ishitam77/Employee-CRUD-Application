package com.service;

import java.util.List;

import com.entity.AdminEntity;


public interface AdminService {

	void saveAdmin(AdminEntity adminEntity);

	AdminEntity authenticate(String email, String password);

	AdminEntity fetchAdmin(int adminId);

	void UpdateAdmin(AdminEntity adminEntity);

	void deleteAdmin(int adminId);
}
