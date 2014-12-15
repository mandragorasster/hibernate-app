package com.pristine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pristine.dao.EmployeeDAO;
import com.pristine.domain.EmployeeEntity;
import com.pristine.util.EntityToVOConverter;
import com.pristine.util.VOToEntityConverter;
import com.pristine.vo.EmployeeVO;

@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	EmployeeDAO employeeDAO;
	
	@Override
	@Transactional
	public String persistEmployee(EmployeeVO employeeVO) {
		EmployeeEntity employee = VOToEntityConverter.convert(employeeVO); 
		employeeDAO.add(employee);
		return employee.getId();
		
	}

	@Override
	@Transactional
	public String updateEmployee(EmployeeVO employeeVO) {
		EmployeeEntity employee = VOToEntityConverter.convert(employeeVO); 
		employeeDAO.update(employee);
		return employee.getId();
		
	}
	@Override
	@Transactional
	public EmployeeVO findEmployeeById(String id) {
		EmployeeEntity employee =  employeeDAO.find(id);
		return EntityToVOConverter.convert(employee);
	}

	@Override
	@Transactional
	public void deleteEmployee(EmployeeVO employeeVO) {
		EmployeeEntity employee = VOToEntityConverter.convert(employeeVO); 
		employeeDAO.remove(employee);
		
	}

}
