package com.tjsanshao.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tjsanshao.crm.service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring/applicationContext.xml", "classpath:spring/applicationContext-*.xml"})
public class CustomerServiceImplTest {
	
	@Autowired
	private CustomerService customerService;

	@Test
	public void testFindCustomerCount() {
		System.out.println(customerService.findCustomerCount(null));
	}

}
