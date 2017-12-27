package com.tjsanshao.crm.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.tjsanshao.crm.dao.CustomerDetailDao;
import com.tjsanshao.crm.domain.CstCustomerDetail;

@Repository("customerDetailDao")
public class CustomerDetailDaoImpl extends HibernateDaoSupport implements CustomerDetailDao {

	@Autowired
	public void setHT(HibernateTemplate hibernateTemplate) {
		this.setHibernateTemplate(hibernateTemplate);
	}
	
	@Override
	public void insert(CstCustomerDetail cstCustomerDetail) {
		this.getHibernateTemplate().save(cstCustomerDetail);
	}

	@Override
	public void delete(Long custId) {
		CstCustomerDetail cstCustomerDetail = this.getHibernateTemplate().get(CstCustomerDetail.class, custId);
		if(cstCustomerDetail != null) {
			this.getHibernateTemplate().delete(cstCustomerDetail);
		}
	}

}
