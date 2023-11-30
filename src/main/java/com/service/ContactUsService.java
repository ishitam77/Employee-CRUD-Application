package com.service;

import java.util.List;

import com.entity.ContactUsEntity;

public interface ContactUsService {

	void saveContactUs(ContactUsEntity contactusEntity);

	List<ContactUsEntity> findAllComments();
	
}
