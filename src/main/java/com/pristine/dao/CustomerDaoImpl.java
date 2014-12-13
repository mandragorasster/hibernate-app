package com.pristine.dao;

import org.springframework.stereotype.Repository;

import com.pristine.domain.CustomerEntity;
import com.pristine.domain.PhoneNumberEntity;
import com.pristine.util.GenericDaoImpl;

@Repository("customerDao")
public class CustomerDaoImpl extends GenericDaoImpl<CustomerEntity, Integer> implements ICustomerDao {

	@Override
	public void deletePhone(Integer id) {
		PhoneNumberEntity ph= new PhoneNumberEntity(id);
		sessionFactory.getCurrentSession().delete(ph);
		
	}

	//@Autowired
	//private SessionFactory sessionFactory;

}