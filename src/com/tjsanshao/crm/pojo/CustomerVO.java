package com.tjsanshao.crm.pojo;

import com.tjsanshao.crm.domain.CstCustomer;

public class CustomerVO {
	
	private int page;
	private int rows;
	
	private CstCustomer cstCustomer;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public CstCustomer getCstCustomer() {
		return cstCustomer;
	}

	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}
	
}
