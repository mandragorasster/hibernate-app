package com.pristine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pristine.dao.ICustomerDao;
import com.pristine.domain.CustomerEntity;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	ICustomerDao customerDao;

	@Override
	public CustomerEntity findCustomerById(Integer id) {
		CustomerEntity ce= customerDao.find(id);
		System.out.println(ce.getPhones());
		return ce;
	}

	@Override
	public Integer updateCustomer(CustomerEntity customer) {
		customerDao.update(customer);;
		return customer.getId();
	}

	@Override
	public void deleteCustomer(CustomerEntity customer) {
		
		
	}

	@Override
	public Integer persistCustomer(CustomerEntity customer) {
		customerDao.add(customer);
		System.out.println(customer.getId());
		return customer.getId();
	}

	@Override
	public void deletePhone(Integer id) {
		customerDao.deletePhone(id);
		
	}
	
	
}
