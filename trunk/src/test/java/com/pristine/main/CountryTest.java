package com.pristine.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pristine.domain.CountryMasterEntity;
import com.pristine.domain.StateMasterEntity;
import com.pristine.service.ICountryMasterService;

public class CountryTest {
	private ICountryMasterService emService = null;
	private ConfigurableApplicationContext context = null; 
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		emService = (ICountryMasterService) context.getBean("countryMasterService");
		
	}

	@After
	public void tearDown() throws Exception {
		emService = null;
		context.close();
	}
	@Test
	public void createCountryMaster() {
		CountryMasterEntity entity = new CountryMasterEntity("India");
		entity.getStateMasters().add(new StateMasterEntity("Bihar"));
		entity.getStateMasters().add(new StateMasterEntity("WB"));
		
		System.out.println("Test");
		//Integer id = emService.createCountryMaster(entity);
		
		//System.out.println("Id: "+id);
		
		
		
	}

}
