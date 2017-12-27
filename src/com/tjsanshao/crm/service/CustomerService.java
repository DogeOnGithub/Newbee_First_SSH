package com.tjsanshao.crm.service;

import java.util.List;

import com.tjsanshao.crm.domain.CstCustomer;
import com.tjsanshao.crm.pojo.CustomerVO;

public interface CustomerService {

	public CstCustomer findCustomerById(Long custId);
	
	public Long findCustomerCount(CustomerVO customerVO);
	
	public List<CstCustomer> findCustomerList(CustomerVO customerVO, int firstResult, int maxResult);
	
	public void deleteCustomer(long custId);
	
}
