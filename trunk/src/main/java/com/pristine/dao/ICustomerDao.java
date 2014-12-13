package com.pristine.dao;

import com.pristine.domain.CustomerEntity;
import com.pristine.util.GenericDao;

public interface ICustomerDao extends GenericDao<CustomerEntity, Integer>{
	
	public void deletePhone(Integer id);
		  
}
