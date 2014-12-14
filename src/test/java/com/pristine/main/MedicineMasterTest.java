package com.pristine.main;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pristine.domain.MedicineMasterEntity;
import com.pristine.service.IMedicineMasterService;

public class MedicineMasterTest {

	private IMedicineMasterService emService = null;
	private ConfigurableApplicationContext context = null; 
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		emService = (IMedicineMasterService) context.getBean("medicineMasterService");
		
	}

	@After
	public void tearDown() throws Exception {
		emService = null;
		context.close();
	}
	@Test
	public void createMedicineMaster(){
		MedicineMasterEntity entity = new MedicineMasterEntity();
		
		
		Integer id = emService.createMedicineMaster(entity);
		
		Assert.assertTrue(id>=0);
	}
	
	@Test
	public void updateMedicineMaster(){
		MedicineMasterEntity entity = new MedicineMasterEntity();
		
		
		emService.createMedicineMaster(entity);
		
		
		
		emService.updateMedicineMaster(entity);
		
		//Assert.assertEquals(entity.getCatTypeName(), "Doctor");
		
		
	}
	
	@Test
	public void deleteMedicineMaster(){
		MedicineMasterEntity entity = new MedicineMasterEntity();
		
		
		Integer id = emService.createMedicineMaster(entity);
		
		MedicineMasterEntity masterEntity = emService.getMedicineMasterById(id);
		
		emService.deleteMedicineMaster(masterEntity);
		
		MedicineMasterEntity masterEntity1 = emService.getMedicineMasterById(id);
		
		Assert.assertTrue(masterEntity1 == null);
		
		
	}
	
	
	private MedicineMasterEntity createMedicineMasterEntity(){
		
		return null;
		
	}
}

