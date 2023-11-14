package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity 
public class AdminEntity {	
	
	int adminId;
	String name;
	String emailId;
	String password;
	
	@OneToMany(mappedBy = "admin", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<EmployeeEntity> employees = new ArrayList<>();

	
	@Version
    private Long version;
	
	public AdminEntity() {
		super();
	}
	public AdminEntity(String emailId,String name, String password) {
		super();
	
		this.name = name;
		this.emailId = emailId;
		this.password = password;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	
	@Override
	public String toString() {
		return "AdminEntity [adminId=" + adminId + ", name=" + name + ", emailId=" + emailId + ", password=" + password
				+ "]";
	}
	

}
