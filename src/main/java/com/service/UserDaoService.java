package com.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.Entity.User;

@Repository
@Transactional
public class UserDaoService {
	
	@PersistenceContext
	private EntityManager entitymanager;
	
	public long insert(User user)
	{
	entitymanager.persist(user);
	
	 System.out.println(user.getId()+"    ----");
	return user.getId();
	}
	
	
	
	
	

}
