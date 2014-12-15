package com.pristine.main;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pristine.service.ICustomerService;
import com.pristine.vo.CustomerVO;
import com.pristine.vo.PhoneNumberVO;

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
		
		CustomerVO vo = new CustomerVO("Shambhu");
		vo.getPhones().add(new PhoneNumberVO("(8837199181"));
		vo.getPhones().add(new PhoneNumberVO("(8981518899"));
		Integer id = emService.persistCustomer(vo);
		
		CustomerVO customerVo=emService.findCustomerById(id);
		
		List<PhoneNumberVO> phones= customerVo.getPhones();
		
		for(PhoneNumberVO entity2:phones){
			System.out.println("Deleting phone id :"+entity2.getId());
			emService.deletePhone(entity2.getId());
			break;
		}
	}

}
