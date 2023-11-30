package com.dao;

import com.entity.ContactUsEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactUsDao {

	void saveContactUs(ContactUsEntity contactusEntity);

	List<ContactUsEntity> findAllComments();
	

}