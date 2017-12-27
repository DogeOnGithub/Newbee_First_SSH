package com.tjsanshao.crm.util;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class FastJsonUtil {
	
	public static String toJSONString(Object object) {
		return JSON.toJSONString(object, SerializerFeature.DisableCircularReferenceDetect);
	}
	
	public static void write_json(HttpServletResponse response, String jsonString) {
		response.setContentType("application/json;utf-8");
		response.setCharacterEncoding("UTF-8");
		try {
			response.getWriter().print(jsonString);
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static String ajaxResult(boolean success, String message) {
		java.util.Map map = new HashMap();
		map.put("success", success);
		map.put("message", message);
		String json = JSON.toJSONString(map);
		return json;
	}
	
	public static String JsonFormatterAddPrefix(String json, String prefix, Map<String, Object> newMap) {
		if(newMap == null) {
			newMap = new HashMap<>();
		}
		
		Map<String, Object> map = (Map<String, Object>) JSON.parse(json);
		
		for(String key : map.keySet()) {
			Object object = map.get(key);
			if(isEntity(object)) {
				String jsonString = JSON.toJSONString(object);
				JsonFormatterAddPrefix(jsonString, prefix + key + ".", newMap);
			}else {
				newMap.put(prefix + key, object);
			}
		}
		
		return JSON.toJSONString(newMap);
		
	}
	
	private static boolean isEntity(Object object) {
		if(object instanceof String) {
			return false;
		}
		if(object instanceof Integer) {
			return false;
		}
		if(object instanceof Long) {
			return false;
		}
		if(object instanceof java.math.BigDecimal) {
			return false;
		}
		if(object instanceof Date) {
			return false;
		}
		if(object instanceof java.util.Collection) {
			return false;
		}
		return true;
	}
}
