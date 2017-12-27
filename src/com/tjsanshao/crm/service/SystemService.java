package com.tjsanshao.crm.service;

import java.util.List;

import com.tjsanshao.crm.domain.BaseDict;

public interface SystemService {
	
	public List<BaseDict> findBaseDictByTypeCode(String typeCode);
	
}
