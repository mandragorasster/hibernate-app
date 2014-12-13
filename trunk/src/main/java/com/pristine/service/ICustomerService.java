package com.pristine.service;

import com.pristine.domain.CustomerEntity;

public interface ICustomerService {

	CustomerEntity findCustomerById(Integer id);

	Integer updateCustomer(CustomerEntity customer);

	void deleteCustomer(CustomerEntity customer);

	Integer persistCustomer(CustomerEntity customer);
	
	public void deletePhone(Integer id);
}
