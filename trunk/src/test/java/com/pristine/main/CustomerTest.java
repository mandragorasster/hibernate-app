package com.pristine.main;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pristine.domain.CustomerEntity;
import com.pristine.domain.PhoneNumberEntity;
import com.pristine.service.ICustomerService;

public class CustomerTest {
	private ICustomerService emService = null;
	private ConfigurableApplicationContext context = null; 
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		emService = (ICustomerService) context.getBean("customerService");
		
	}

	@After
	public void tearDown() throws Exception {
		emService = null;
		context.close();
	}
	@Test
	public void createCustomer() {
		
		CustomerEntity entity = new CustomerEntity("Shambhu");
		entity.getPhones().add(new PhoneNumberEntity("(8837199181"));
		entity.getPhones().add(new PhoneNumberEntity("(8981518899"));
		Integer id = emService.persistCustomer(entity);
		
		CustomerEntity customerEntity=emService.findCustomerById(id);
		
		List<PhoneNumberEntity> phones= customerEntity.getPhones();
		
		for(PhoneNumberEntity entity2:phones){
			System.out.println("Deleting phone id :"+entity2.getId());
			emService.deletePhone(entity2.getId());
			break;
		}
	}

}
