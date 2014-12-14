package com.pristine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pristine.dao.EmployeeDAO;
import com.pristine.domain.EmployeeEntity;

@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	EmployeeDAO employeeDAO;
	
	@Override
	@Transactional
	public String persistEmployee(EmployeeEntity employee) {
		employeeDAO.add(employee);
		return employee.getId();
		
	}

	@Override
	@Transactional
	public String updateEmployee(EmployeeEntity employee) {
		employeeDAO.update(employee);
		return employee.getId();
		
	}
	@Override
	@Transactional
	public EmployeeEntity findEmployeeById(String id) {
		return employeeDAO.find(id);
	}

	@Override
	@Transactional
	public void deleteEmployee(EmployeeEntity employee) {
		employeeDAO.remove(employee);
		
	}

}
