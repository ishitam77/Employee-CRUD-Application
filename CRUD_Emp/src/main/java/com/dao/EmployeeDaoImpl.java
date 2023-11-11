package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.EmployeeEntity;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	SessionFactory sessionFactory; //get a session: to do a task

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void saveEmp(EmployeeEntity employeeEntity) {
		
		Session session=getSession();		
		session.save(employeeEntity);		
	}



	@Override
	public EmployeeEntity authenticate(String email, String password) {
		
		String hql = " from EmployeeEntity e where e.emailId =:emailId and e.password =:password ";
		
		//Query query = getSession().createQuery(hql); //Hibernate Query....in place of Query you can also use TypedQuery
		
		TypedQuery<EmployeeEntity> query = getSession().createQuery(hql);
		query.setParameter("emailId", email);
		query.setParameter("password", password);
		EmployeeEntity employeeEntity =null;
		
		
		try{ 
		 //employeeEntity = (EmployeeEntity) query.getSingleResult();
			
		 employeeEntity =  query.getSingleResult();//(if u use TypedQuery then casting will not be required
		}
		catch(Exception e){
			e.printStackTrace();
		}
	    return employeeEntity;
	}
	
	@Override
	public List<EmployeeEntity> getAllEmployees() {
	    String hql = "FROM EmployeeEntity";
	    TypedQuery<EmployeeEntity> query = getSession().createQuery(hql, EmployeeEntity.class);
	    return query.getResultList();
	}

	@Override
	public void deleteEmp(int employeeId) {
	    String hql = "delete from EmployeeEntity where employeeId = :x"; // in jdbc we use ? and in hql we use :
	    TypedQuery<EmployeeEntity> query = getSession().createQuery(hql);
	    query.setParameter("x", employeeId);
	    query.executeUpdate();
	}
	
	@Override
	public EmployeeEntity fetchEmployee(int employeeId) {
		String hql="from EmployeeEntity e where e.employeeId=:x";
		 TypedQuery<EmployeeEntity> query = getSession().createQuery(hql);
		 query.setParameter("x", employeeId);
		 EmployeeEntity employeeEntity =null;
		 try{ 
			
			 employeeEntity =  query.getSingleResult();//(if u use TypedQuery then casting will not be required
			}
			catch(Exception e){
				e.printStackTrace();
			}
		    return employeeEntity;
	}

	@Override
	public void UpdateEmployee(EmployeeEntity employeeEntity) {
		Session session=getSession();		
		session.update(employeeEntity);	
		
	}


}
