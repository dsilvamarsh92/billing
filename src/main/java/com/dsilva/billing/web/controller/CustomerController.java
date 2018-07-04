/*******************************************************************************
 * Copyright (C) 2018, Dsilva Software Solutions
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
package com.dsilva.billing.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dsilva.billing.web.dao.CustomerDAO;
import com.dsilva.billing.web.model.Customer;

@Controller
@RequestMapping(value="/billing")
public class CustomerController {

	@Autowired
	CustomerDAO<Customer> customerDao;
	
	
	public CustomerDAO<Customer> getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDAO<Customer> customerDao) {
		this.customerDao = customerDao;
	}

	public CustomerController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping(value="/addCustomer")
	public ModelAndView addCustomer(ModelAndView model) {
		
		
		
		model.addObject("customerModel", new Customer());
		model.setViewName("addCustomer");
		return model;
	}
	
	@PostMapping(value="/saveCustomer")
	public ModelAndView saveCustomer(@ModelAttribute(value="customerModel") Customer customerModel,ModelAndView model){
		
		try {
		
			this.customerDao.save(customerModel);
		
			model.addObject("customerModel",customerModel);
			model.addObject("customerModelList",this.customerDao.findAllOrderByName());
			model.setViewName("addCustomer");
			
			//return model;
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
			
		}finally {
			
			
			
		}
		return model;
	}
	
}
