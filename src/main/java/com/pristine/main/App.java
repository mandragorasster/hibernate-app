package com.pristine.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pristine.domain.EmployeeEntity;

public class App {

	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeEntity em = new EmployeeEntity();
		em.setId("123");
		em.setName("John");
		em.setAge(35);
		
		/*IEmployeeService emService = (IEmployeeService) context.getBean("employeeService");
		emService.persistEmployee(em);
		System.out.println("Updated age :" + emService.findEmployeeById("123").getAge());		
		em.setAge(32);
		
		emService.updateEmployee(em);
		System.out.println("Updated age :" + emService.findEmployeeById("123").getAge());
		
		emService.deleteEmployee(em);*/
		context.close();
	}

}
