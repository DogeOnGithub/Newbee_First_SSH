package com.tjsanshao.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjsanshao.crm.dao.CustomerDao;
import com.tjsanshao.crm.dao.CustomerDetailDao;
import com.tjsanshao.crm.domain.CstCustomer;
import com.tjsanshao.crm.pojo.CustomerVO;
import com.tjsanshao.crm.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private CustomerDetailDao customerDetailDao;
	
	@Override
	public CstCustomer findCustomerById(Long custId) {
		return customerDao.findCustomerById(custId);
	}

	@Override
	public Long findCustomerCount(CustomerVO customerVO) {
		return customerDao.findCustomerCount(customerVO);
	}

	@Override
	public List<CstCustomer> findCustomerList(CustomerVO customerVO, int firstResult, int maxResult) {
		return customerDao.findCustomerList(customerVO, firstResult, maxResult);
	}

	@Override
	public void deleteCustomer(long custId) {
		customerDao.delete(custId);
		customerDetailDao.delete(custId);
	}

}
