package com.tjsanshao.crm.dao;

import com.tjsanshao.crm.domain.CstCustomerDetail;

public interface CustomerDetailDao {

	public void insert(CstCustomerDetail cstCustomerDetail);
	
	public void delete(Long custId);
	
}
