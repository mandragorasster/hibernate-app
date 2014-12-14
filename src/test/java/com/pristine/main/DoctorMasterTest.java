package com.pristine.main;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pristine.domain.DepartmentMasterEntity;
import com.pristine.domain.DoctorMasterEntity;
import com.pristine.service.IDepartmentMasterService;
import com.pristine.service.IDoctorMasterService;

public class DoctorMasterTest {

	private IDoctorMasterService emService = null;
	private IDepartmentMasterService depService = null;
	private ConfigurableApplicationContext context = null; 
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		emService = (IDoctorMasterService) context.getBean("doctorMasterService");
		depService = (IDepartmentMasterService) context.getBean("departmentMasterService");
		
	}

	@After
	public void tearDown() throws Exception {
		emService = null;
		depService = null;
		context.close();
	}
	@Test
	public void createDoctorMaster(){
		
		DepartmentMasterEntity departmentMasterEntity = new DepartmentMasterEntity("Skin1");
		Integer id= depService.addDepartment(departmentMasterEntity);
		departmentMasterEntity.setDeptId(id);
		DoctorMasterEntity entity = new DoctorMasterEntity();
		entity.setActive(1);
		entity.setContactNo("9883719918");
		entity.setCreatedBy(1);
		entity.setCreatedOn(new Date());
		entity.setDegree("PH.d.");
		entity.setDepartment(departmentMasterEntity);
		entity.setFirstName("Shambhu");
		entity.setLastName("Kumar");
		entity.setMiddleName("");
		entity.setModificationOn(new Date());
		entity.setModifiedBy(1);
		entity.setSpeciality("Itch");
		
		Integer id1 = emService.createDoctorMaster(entity);
		
		//Assert.assertTrue(id>=0);
	}
	
	@Test
	public void updateCategoryType(){/*
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
		
		
	*/}
	
	@Test
	public void deleteCategoryType(){/*
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
		
		
	*/}
}

