package com.pristine.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pristine.domain.DepartmentMasterEntity;
import com.pristine.domain.EmployeeEntity;
import com.pristine.service.IEmployeeService;
import com.pristine.service.IDepartmentMasterService;

public class DepartmentTest {
	private IDepartmentMasterService emService = null;
	private ConfigurableApplicationContext context = null; 
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		emService = (IDepartmentMasterService) context.getBean("departmentMasterService");
		
	}

	@After
	public void tearDown() throws Exception {
		emService = null;
		context.close();
	}
	@Test
	public void createDoctorMaster() {
		DepartmentMasterEntity em = new DepartmentMasterEntity("qweIT");
		Integer id = emService.addDepartment(em);
		
		DepartmentMasterEntity entity = emService.findDepartment(id);
		entity.setDeptName("India");
		
		
		emService.updateDepartment(entity);
		
		
		emService.removeDepartment(entity);
		
		
		
	}

}
