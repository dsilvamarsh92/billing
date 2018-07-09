package com.dsilva.billing.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dsilva.billing.web.dao.CustomerDAO;
import com.dsilva.billing.web.model.Customer;

public class CustomerService  extends BaseService {
	
	
	public CustomerService() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Autowired
	CustomerDAO<Customer> customerDao;
	
	
	public CustomerDAO<Customer> getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDAO<Customer> customerDao) {
		this.customerDao = customerDao;
	}

	public List findAllOrderByName() {
		return customerDao.findAllOrderByName();
		
	}

	public void save(Customer customerModel) {
		
		customerDao.save(customerModel);
		
	}

}
