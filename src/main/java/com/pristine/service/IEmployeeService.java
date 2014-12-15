package com.pristine.service;

import com.pristine.vo.EmployeeVO;

public interface IEmployeeService {

	String persistEmployee(EmployeeVO employee);

	EmployeeVO findEmployeeById(String id);

	String updateEmployee(EmployeeVO employee);

	void deleteEmployee(EmployeeVO employee);
}
