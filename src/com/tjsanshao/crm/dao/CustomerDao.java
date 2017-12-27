package com.tjsanshao.crm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.tjsanshao.crm.domain.CstCustomer;
import com.tjsanshao.crm.pojo.CustomerVO;

public interface CustomerDao {
	
	public void insert(CstCustomer cstCustomer);
	
	public CstCustomer findCustomerById(Long custId);
	
	public void delete(Long custId);
	
	public Long findCustomerCount(CustomerVO customerVO);
	
	public List<CstCustomer> findCustomerList(CustomerVO customerVO, int firstResult, int maxResult);
	
	DetachedCriteria createDetachedCriteria();
	
}
