package com.pristine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pristine.dao.ICustomerDao;
import com.pristine.domain.CustomerEntity;
import com.pristine.util.EntityToVOConverter;
import com.pristine.util.VOToEntityConverter;
import com.pristine.vo.CustomerVO;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	ICustomerDao customerDao;

	@Override
	public CustomerVO findCustomerById(Integer id) {
		CustomerEntity entity= customerDao.find(id);
		CustomerVO customerVO = EntityToVOConverter.convert(entity);
		return customerVO;
	}

	@Override
	public Integer updateCustomer(CustomerVO customerVO) {
		CustomerEntity entity = VOToEntityConverter.convert(customerVO);
		customerDao.update(entity);;
		return entity.getId();
	}

	@Override
	public void deleteCustomer(CustomerVO customerVO) {
		CustomerEntity entity = VOToEntityConverter.convert(customerVO);
		customerDao.remove(entity);
	}

	@Override
	public Integer persistCustomer(CustomerVO customerVO) {
		CustomerEntity entity = VOToEntityConverter.convert(customerVO);
		customerDao.add(entity);
		return entity.getId();
	}

	@Override
	public void deletePhone(Integer id) {
		customerDao.deletePhone(id);
		
	}
	
	
}
