package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContactUsEntity {
	int contactId;
	String contactName;
	String contactEmailId;
	String message;
	
	public ContactUsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactUsEntity( String contactName, String contactEmailId,String message) {
		super();
	
		this.contactName = contactName;
		this.contactEmailId = contactEmailId;
		this.message=message;
	}
	
	@Id
	@GeneratedValue
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactEmailId() {
		return contactEmailId;
	}
	public void setContactEmailId(String contactEmailId) {
		this.contactEmailId = contactEmailId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ContactUsEntity [contactId=" + contactId + ", contactName=" + contactName + ", contactEmailId="
				+ contactEmailId + ", message=" + message + "]";
	}
	
}
