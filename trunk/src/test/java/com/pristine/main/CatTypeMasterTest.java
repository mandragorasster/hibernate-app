package com.pristine.main;

import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pristine.service.ICatTypeMasterService;
import com.pristine.vo.CategoryTypeMasterVO;

public class CatTypeMasterTest {
	private ICatTypeMasterService emService = null;
	private ConfigurableApplicationContext context = null;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		emService = (ICatTypeMasterService) context
				.getBean("catTypeMasterService");

	}

	@After
	public void tearDown() throws Exception {
		emService = null;
		context.close();
	}

	@Test
	public void createCategoryType() {
		CategoryTypeMasterVO vo = createCategory();

		Integer id = emService.createCategoryType(vo);

		Assert.assertTrue(id >= 0);
	}

	@Test
	public void updateCategoryType() {
		CategoryTypeMasterVO vo = createCategory();

		Integer id = emService.createCategoryType(vo);

		vo.setCatTypeName("Doctor");
		vo.setCatTypeId(id);
		id = emService.updateCategoryType(vo);

		CategoryTypeMasterVO mastervo = emService.getCategoryTypeById(id);

		Assert.assertEquals(mastervo.getCatTypeName(), "Doctor");

	}

	@Test
	public void deleteCategoryType() {
		CategoryTypeMasterVO vo = createCategory();

		Integer id = emService.createCategoryType(vo);

		CategoryTypeMasterVO masterVO = emService.getCategoryTypeById(id);
		masterVO.setCatTypeId(id);
		emService.deleteCategoryType(masterVO);

		CategoryTypeMasterVO masterEntity1 = emService.getCategoryTypeById(id);

		Assert.assertTrue(masterEntity1 == null);

	}

	private CategoryTypeMasterVO createCategory() {
		CategoryTypeMasterVO vo = new CategoryTypeMasterVO();
		vo.setCatTypeName("Medicine");
		vo.setCreatedBy(1);
		vo.setCreatedOn(new Date());
		vo.setModifiedBy(1);
		vo.setModifiedOn(new Date());
		vo.setStatus(1);

		return vo;

	}
}
