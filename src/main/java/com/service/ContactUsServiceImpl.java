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
public class ContactUsServiceImpl implements ContactUsService {
	
	@Autowired
	ContactUsDao contactusDao;
	
	@Override
	public void saveContactUs(ContactUsEntity contactusEntity) {
		contactusDao.saveContactUs(contactusEntity);	//save():inbulit
		
	}
	

	@Override
	public List<ContactUsEntity> findAllComments() {
	    List<ContactUsEntity> listOfContactUsEntity = contactusDao.findAllComments(); // Use correct instance variable
	    return listOfContactUsEntity;
	}
}
