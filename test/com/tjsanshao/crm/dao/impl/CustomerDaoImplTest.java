package com.tjsanshao.crm.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tjsanshao.crm.dao.BaseDictDao;
import com.tjsanshao.crm.dao.CustomerDao;
import com.tjsanshao.crm.dao.CustomerDetailDao;
import com.tjsanshao.crm.domain.CstCustomer;
import com.tjsanshao.crm.domain.CstCustomerDetail;
import com.tjsanshao.crm.pojo.BaseDictVO;
import com.tjsanshao.crm.service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring/applicationContext.xml", "classpath:spring/applicationContext-*.xml"})
public class CustomerDaoImplTest {
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private BaseDictDao baseDictDao;
	
	@Autowired
	private CustomerDetailDao customerDetailDao;

	@Test
	public void testFindCustomerById() {
		CstCustomer cstCustomer = customerDao.findCustomerById(29L);
		System.out.println(cstCustomer.getCustName());
	}
	
	@Test
	public void testFindBaseDict() {
		BaseDictVO baseDictVO = new BaseDictVO();
		baseDictVO.setDictTypeCode("004");
		System.out.println(baseDictDao.findBaseDictList(baseDictVO).size());
	}
	
	@Test
	public void testInsertCustomerDetail() {
		//没有事务控制，这个测试做不了
		CstCustomerDetail cstCustomerDetail = new CstCustomerDetail();
		cstCustomerDetail.setCustId(111L);
		cstCustomerDetail.setCustAddress("6666666666");
		customerDetailDao.insert(cstCustomerDetail);
	}

}
