package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.AdminEntity;
import com.entity.ContactUsEntity;
import com.entity.EmployeeEntity;

@Repository
public class ContactUsDaoImpl implements ContactUsDao{
	
	@Autowired
	SessionFactory sessionFactory; //get a session: to do a task

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	

	@Override
	public void saveContactUs(ContactUsEntity contactusEntity) {
		Session session=getSession();		
		session.save(contactusEntity);	
		
	}

	@Override
	public List<ContactUsEntity> findAllComments() {
		 String hql = "FROM ContactUsEntity";
		    TypedQuery<ContactUsEntity> query = getSession().createQuery(hql, ContactUsEntity.class);
		    return query.getResultList();
	}


}
