package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.AdminEntity;
import com.entity.EmployeeEntity;

@Repository
public class AdminDaoImpl implements AdminDao{
	
	@Autowired
	SessionFactory sessionFactory; //get a session: to do a task

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	

	@Override
	public AdminEntity authenticate(String email, String password) {
		
		String hql = " from AdminEntity a where a.emailId =:emailId and a.password =:password ";
		
		//Query query = getSession().createQuery(hql); //Hibernate Query....in place of Query you can also use TypedQuery
		
		TypedQuery<AdminEntity> query = getSession().createQuery(hql);
		query.setParameter("emailId", email);
		query.setParameter("password", password);
		AdminEntity adminEntity =null;
		
		
		try{ 
		
			
		 adminEntity =  query.getSingleResult();//(if u use TypedQuery then casting will not be required
		}
		catch(Exception e){
			e.printStackTrace();
		}
	    return adminEntity;
	}
	
	
	@Override
	public AdminEntity fetchAdmin(int adminId) {
		String hql="from AdminEntity a where a.adminId=:x";
		 TypedQuery<AdminEntity> query = getSession().createQuery(hql);
		 query.setParameter("x", adminId);
		 AdminEntity adminEntity =null;
		 try{ 
			
			 adminEntity =  query.getSingleResult();//(if u use TypedQuery then casting will not be required
			}
			catch(Exception e){
				e.printStackTrace();
			}
		    return adminEntity;
	}

	@Override
	public void saveAdmin(AdminEntity adminEntity) {
		Session session=getSession();		
		session.save(adminEntity);
		
	}

	@Override
	public void UpdateAdmin(AdminEntity adminEntity) {
		Session session=getSession();		
		session.update(adminEntity);	
		
	}

	@Override
	public void deleteAdmin(int adminId) {
		 String hql = "delete from AdminEntity where adminId = :x"; // in jdbc we use ? and in hql we use :
		    TypedQuery<AdminEntity> query = getSession().createQuery(hql);
		    query.setParameter("x", adminId);
		    query.executeUpdate();
		
	}


}
