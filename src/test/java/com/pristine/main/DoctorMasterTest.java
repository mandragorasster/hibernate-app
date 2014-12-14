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
import com.pristine.util.EntityToVOConverter;
import com.pristine.util.VOToEntityConverter;
import com.pristine.vo.DepartmentMasterVO;
import com.pristine.vo.DoctorMasterVO;

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
		
		DepartmentMasterVO departmentVO = new DepartmentMasterVO("Skin1");
		Integer id= depService.addDepartment(departmentVO);
		departmentVO.setDeptId(id);
		DoctorMasterVO doctorVO = new DoctorMasterVO();
		doctorVO.setActive(1);
		doctorVO.setContactNo("9883719918");
		doctorVO.setCreatedBy(1);
		doctorVO.setCreatedOn(new Date());
		doctorVO.setDegree("PH.d.");
		doctorVO.setDepartment((departmentVO));
		doctorVO.setFirstName("Shambhu");
		doctorVO.setLastName("Kumar");
		doctorVO.setMiddleName("");
		doctorVO.setModificationOn(new Date());
		doctorVO.setModifiedBy(1);
		doctorVO.setSpeciality("Itch");
		
		Integer id1 = emService.createDoctorMaster(doctorVO);
		
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

