package com.tjsanshao.crm.dao.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.tjsanshao.crm.dao.BaseDictDao;
import com.tjsanshao.crm.domain.BaseDict;
import com.tjsanshao.crm.pojo.BaseDictVO;

@Repository("baseDictDao")
public class BaseDictDaoImpl extends HibernateDaoSupport implements BaseDictDao {
	
	@Autowired
	public void setHT(HibernateTemplate hibernateTemplate) {
		this.setHibernateTemplate(hibernateTemplate);
	}

	@Override
	public DetachedCriteria createDetachedCriteria() {
		return DetachedCriteria.forClass(BaseDict.class);
	}

	@Override
	public List<BaseDict> findBaseDictList(BaseDictVO baseDictVO) {
		
		DetachedCriteria detachedCriteria = createDetachedCriteria();
		if(baseDictVO != null) {
			if(StringUtils.isNotEmpty(baseDictVO.getDictTypeCode())) {
				detachedCriteria.add(Restrictions.eq("dictTypeCode", baseDictVO.getDictTypeCode()));
			}
		}
		
		return (List<BaseDict>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
	}

}
