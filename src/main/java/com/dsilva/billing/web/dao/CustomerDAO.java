package com.dsilva.billing.web.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dsilva.billing.web.model.Customer;

@Repository
@Transactional
public class CustomerDAO<T> extends BaseEntityDao<T> {

	public CustomerDAO() {
		// TODO Auto-generated constructor stub
	}
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public boolean save(T obj) {
	
		System.out.println(" entitymanager object ::" +entityManager);
		boolean status=false;
		try {
		
			entityManager.persist(obj);
			System.out.println("customer persisted");
			status=true;
		} catch (Exception e) {
			status=false;
			e.printStackTrace();
			
		}
		
		return status;
	}

	public List<Customer> findAllOrderByName() {
		
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Customer> criteria = cb.createQuery(Customer.class);
		Root<Customer> customer= criteria.from(Customer.class);
		
		criteria.select(customer);
		return entityManager.createQuery(criteria).getResultList();
		
		
	}
	
	
	
	
}
