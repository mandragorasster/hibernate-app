package com.pristine.service;

import com.pristine.vo.CustomerVO;

public interface ICustomerService {

	CustomerVO findCustomerById(Integer id);

	Integer updateCustomer(CustomerVO customer);

	void deleteCustomer(CustomerVO customer);

	Integer persistCustomer(CustomerVO customer);
	
	public void deletePhone(Integer id);
}
