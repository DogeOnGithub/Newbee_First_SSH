package com.tjsanshao.crm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.tjsanshao.crm.domain.BaseDict;
import com.tjsanshao.crm.pojo.BaseDictVO;

public interface BaseDictDao {
	
	public DetachedCriteria createDetachedCriteria();
	
	public List<BaseDict> findBaseDictList(BaseDictVO baseDictVO);
	
}
