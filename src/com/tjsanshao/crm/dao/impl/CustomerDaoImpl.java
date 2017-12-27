package com.tjsanshao.crm.dao.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.tjsanshao.crm.dao.CustomerDao;
import com.tjsanshao.crm.domain.CstCustomer;
import com.tjsanshao.crm.pojo.CustomerVO;

@Repository("customerDao")
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Autowired
	public void setHT(HibernateTemplate hibernateTemplate) {
		this.setHibernateTemplate(hibernateTemplate);
	}
	@Override
	public void insert(CstCustomer cstCustomer) {
		this.getHibernateTemplate().save(cstCustomer);
	}

	@Override
	public CstCustomer findCustomerById(Long custId) {
		return this.getHibernateTemplate().get(CstCustomer.class, custId);
	}

	@Override
	public void delete(Long custId) {
		CstCustomer cstCustomer = this.getHibernateTemplate().get(CstCustomer.class, custId);
		if(cstCustomer != null) {
			this.getHibernateTemplate().delete(cstCustomer);
		}
	}

	@Override
	public Long findCustomerCount(CustomerVO customerVO) {
		DetachedCriteria detachedCriteria = createDetachedCriteria();
		findCustomerCondition(customerVO, detachedCriteria);
		detachedCriteria.setProjection(Projections.rowCount());
		List list = this.getHibernateTemplate().findByCriteria(detachedCriteria);
		Long total = (Long) list.get(0);
		return total;
	}

	@Override
	public List<CstCustomer> findCustomerList(CustomerVO customerVO, int firstResult, int maxResult) {
		DetachedCriteria detachedCriteria = createDetachedCriteria();
		findCustomerCondition(customerVO, detachedCriteria);
		return (List<CstCustomer>) this.getHibernateTemplate().findByCriteria(detachedCriteria, firstResult, maxResult);
	}

	@Override
	public DetachedCriteria createDetachedCriteria() {
		return DetachedCriteria.forClass(CstCustomer.class);
	}
	
	private void findCustomerCondition(CustomerVO customerVO, DetachedCriteria detachedCriteria) {
		if(customerVO != null) {
			if(StringUtils.isNotEmpty(customerVO.getCstCustomer().getCustName())) {
				detachedCriteria.add(Restrictions.like("custName", customerVO.getCstCustomer().getCustName(), MatchMode.ANYWHERE));
			}
			if(customerVO.getCstCustomer().getBaseDictByCustSource() != null) {
				if(StringUtils.isNotEmpty(customerVO.getCstCustomer().getBaseDictByCustSource().getDictId())) {
					detachedCriteria.add(Restrictions.eq("baseDictByCustSource.dictId", customerVO.getCstCustomer().getBaseDictByCustSource().getDictId()));
				}
			}
			if(customerVO.getCstCustomer().getBaseDictByCustLevel() != null) {
				if(StringUtils.isNotEmpty(customerVO.getCstCustomer().getBaseDictByCustLevel().getDictId())) {
					detachedCriteria.add(Restrictions.eq("baseDictByCustLevel.dictId", customerVO.getCstCustomer().getBaseDictByCustLevel().getDictId()));
				}
			}
		}
	}

}
