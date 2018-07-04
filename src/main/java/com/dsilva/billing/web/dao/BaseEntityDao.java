package com.dsilva.billing.web.dao;

public abstract class BaseEntityDao<T> {
	
	
	public BaseEntityDao() {
		// TODO Auto-generated constructor stub
	}
	
	
	public abstract boolean save(T obj) ;

}
