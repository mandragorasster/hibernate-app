package com.pristine.main;

import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pristine.domain.CategoryTypeMasterEntity;
import com.pristine.service.ICatTypeMasterService;

public class CatTypeMasterTest {
	private ICatTypeMasterService emService = null;
	private ConfigurableApplicationContext context = null; 
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		emService = (ICatTypeMasterService) context.getBean("catTypeMasterService");
		
	}

	@After
	public void tearDown() throws Exception {
		emService = null;
		context.close();
	}
	@Test
	public void createCategoryType(){
		CategoryTypeMasterEntity entity = new CategoryTypeMasterEntity();
		entity.setCatTypeName("Medicine");
		entity.setCreatedBy(1);
		entity.setCreatedOn(new Date());
		entity.setModifiedBy(1);
		entity.setModifiedOn(new Date());
		entity.setStatus(1);
		
		Integer id = emService.createCategoryType(entity);
		
		Assert.assertTrue(id>=0);
	}
	
	@Test
	public void updateCategoryType(){
		CategoryTypeMasterEntity entity = new CategoryTypeMasterEntity();
		entity.setCatTypeName("Medicine");
		entity.setCreatedBy(1);
		entity.setCreatedOn(new Date());
		entity.setModifiedBy(1);
		entity.setModifiedOn(new Date());
		entity.setStatus(1);
		
		emService.createCategoryType(entity);
		
		entity.setCatTypeName("Doctor");
		
		emService.updateCategoryType(entity);
		
		Assert.assertEquals(entity.getCatTypeName(), "Doctor");
		
		
	}
	
	@Test
	public void deleteCategoryType(){
		CategoryTypeMasterEntity entity = new CategoryTypeMasterEntity();
		entity.setCatTypeName("Medicine");
		entity.setCreatedBy(1);
		entity.setCreatedOn(new Date());
		entity.setModifiedBy(1);
		entity.setModifiedOn(new Date());
		entity.setStatus(1);
		
		Integer id = emService.createCategoryType(entity);
		
		CategoryTypeMasterEntity masterEntity = emService.getCategoryTypeById(id);
		
		emService.deleteCategoryType(masterEntity);
		
		CategoryTypeMasterEntity masterEntity1 = emService.getCategoryTypeById(id);
		
		Assert.assertTrue(masterEntity1 == null);
		
		
	}
}
