package com.pristine.service;

import com.pristine.domain.EmployeeEntity;

public interface IEmployeeService {

	String persistEmployee(EmployeeEntity employee);

	EmployeeEntity findEmployeeById(String id);

	String updateEmployee(EmployeeEntity employee);

	void deleteEmployee(EmployeeEntity employee);
}
