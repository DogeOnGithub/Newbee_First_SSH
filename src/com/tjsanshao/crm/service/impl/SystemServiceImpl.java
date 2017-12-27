package com.tjsanshao.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjsanshao.crm.dao.BaseDictDao;
import com.tjsanshao.crm.domain.BaseDict;
import com.tjsanshao.crm.pojo.BaseDictVO;
import com.tjsanshao.crm.service.SystemService;

@Service("systemService")
public class SystemServiceImpl implements SystemService {

	@Autowired
	private BaseDictDao baseDictDao;
	
	@Override
	public List<BaseDict> findBaseDictByTypeCode(String typeCode) {
		BaseDictVO baseDictVO = new BaseDictVO();
		baseDictVO.setDictTypeCode(typeCode);
		return baseDictDao.findBaseDictList(baseDictVO);
	}

}
