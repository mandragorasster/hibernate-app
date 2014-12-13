package com.pristine.dao;

import com.pristine.domain.EmployeeEntity;
import com.pristine.util.GenericDao;

public interface EmployeeDAO extends GenericDao<EmployeeEntity, String>{
	
		  void persistEmployee(EmployeeEntity employee);
		  
		  EmployeeEntity findEmployeeById(String id);
		  
		  void updateEmployee(EmployeeEntity employee);
		  
		  void deleteEmployee(EmployeeEntity employee);
		  
}
