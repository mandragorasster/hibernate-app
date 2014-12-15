package com.pristine.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pristine.service.IEmployeeService;
import com.pristine.vo.EmployeeVO;

public class EmployeeTest {
	private IEmployeeService emService = null;
	private ConfigurableApplicationContext context = null; 
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		emService = (IEmployeeService) context.getBean("employeeService");
		
	}

	@After
	public void tearDown() throws Exception {
		emService = null;
		context.close();
	}
	@Test
	public void createDoctorMaster() {
		EmployeeVO em = new EmployeeVO();
		//em.setId("123");
		em.setName("John");
		em.setAge(35);
		
		String empId= emService.persistEmployee(em);
		System.out.println("Updated age :" + emService.findEmployeeById(empId).getAge());		
		em.setAge(32);
		
		empId = emService.updateEmployee(em);
		System.out.println("Updated age :" + emService.findEmployeeById(empId).getAge());
		
		//emService.deleteEmployee(em);

	}

}
