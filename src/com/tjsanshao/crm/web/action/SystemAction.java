package com.tjsanshao.crm.web.action;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tjsanshao.crm.domain.BaseDict;
import com.tjsanshao.crm.pojo.BaseDictVO;
import com.tjsanshao.crm.service.SystemService;
import com.tjsanshao.crm.util.FastJsonUtil;

@Controller("systemAction")
@Scope("prototype")
public class SystemAction extends ActionSupport implements ModelDriven<BaseDictVO> {

	@Autowired
	private SystemService systemService;
	
	private BaseDictVO baseDictVO = new BaseDictVO();
	
	@Override
	public BaseDictVO getModel() {
		// TODO Auto-generated method stub
		return baseDictVO;
	}
	
	public void findBaseDictByTypeCode() {
		String dictTypeCode = baseDictVO.getDictTypeCode();
		List<BaseDict> list = systemService.findBaseDictByTypeCode(dictTypeCode);
		String jsonString = FastJsonUtil.toJSONString(list);
		HttpServletResponse response = ServletActionContext.getResponse();
		FastJsonUtil.write_json(response, jsonString);
	}
	
}
