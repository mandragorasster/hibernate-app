package com.pristine.main;


import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pristine.domain.MedicineMasterEntity;
import com.pristine.service.IMedicineMasterService;
import com.pristine.vo.MedicineMasterVO;

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
		MedicineMasterVO vo = new MedicineMasterVO();
		
		Integer id = emService.createMedicineMaster(vo);
		
		Assert.assertTrue(id>=0);
	}
	
	@Test
	public void updateMedicineMaster(){
		MedicineMasterVO vo = new MedicineMasterVO();
		
		
		Integer id = emService.createMedicineMaster(vo);
		vo.setId(id);
		
		vo.setPower(13);
		emService.updateMedicineMaster(vo);
		
		Assert.assertEquals(vo.getPower(),13);
		
		
	}
	
	@Test
	public void deleteMedicineMaster(){
		MedicineMasterVO vo = new MedicineMasterVO();
		
		
		Integer id = emService.createMedicineMaster(vo);
		
		MedicineMasterVO newVO = emService.getMedicineMasterById(id);
		newVO.setId(id);
		emService.deleteMedicineMaster(newVO);
		
		newVO = emService.getMedicineMasterById(id);
		
		Assert.assertTrue(newVO == null);
		
		
	}
	
	
	private MedicineMasterVO createMedicineMasterEntity(){
		
		MedicineMasterVO vo =new MedicineMasterVO();
		vo.setBatchNo("batchNo");
		vo.setCreatedBy(1);
		vo.setCreatedOn(new Date());
		vo.setMedicineName("medicineName");
		vo.setModificationOn(new Date());
		vo.setModifiedBy(1);
		vo.setPower(12);
		vo.setRate(123.33f);
		vo.setStatus(1);
		return vo;
		
	}
}

