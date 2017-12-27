package com.tjsanshao.crm.domain;

import java.util.HashSet;
import java.util.Set;

public class SysPermission {
	private Long permId;
	private String permName;
	private Long permParentid;
	private String permLevel;
	private String permUrl;
	private Long permOrder;
	private String permIsmenu;
	private String permIsused;
	private Set sysRoles = new HashSet(0);

	public SysPermission() {
	}

	public SysPermission(String permName) {
		this.permName = permName;
	}

	public SysPermission(String permName, Long permParentid, String permLevel, String permUrl, Long permOrder,
			String permIsmenu, String permIsused, Set sysRoles) {
		this.permName = permName;
		this.permParentid = permParentid;
		this.permLevel = permLevel;
		this.permUrl = permUrl;
		this.permOrder = permOrder;
		this.permIsmenu = permIsmenu;
		this.permIsused = permIsused;
		this.sysRoles = sysRoles;
	}

	public Long getPermId() {
		return this.permId;
	}

	public void setPermId(Long permId) {
		this.permId = permId;
	}

	public String getPermName() {
		return this.permName;
	}

	public void setPermName(String permName) {
		this.permName = permName;
	}

	public Long getPermParentid() {
		return this.permParentid;
	}

	public void setPermParentid(Long permParentid) {
		this.permParentid = permParentid;
	}

	public String getPermLevel() {
		return this.permLevel;
	}

	public void setPermLevel(String permLevel) {
		this.permLevel = permLevel;
	}

	public String getPermUrl() {
		return this.permUrl;
	}

	public void setPermUrl(String permUrl) {
		this.permUrl = permUrl;
	}

	public Long getPermOrder() {
		return this.permOrder;
	}

	public void setPermOrder(Long permOrder) {
		this.permOrder = permOrder;
	}

	public String getPermIsmenu() {
		return this.permIsmenu;
	}

	public void setPermIsmenu(String permIsmenu) {
		this.permIsmenu = permIsmenu;
	}

	public String getPermIsused() {
		return this.permIsused;
	}

	public void setPermIsused(String permIsused) {
		this.permIsused = permIsused;
	}

	public Set getSysRoles() {
		return this.sysRoles;
	}

	public void setSysRoles(Set sysRoles) {
		this.sysRoles = sysRoles;
	}
}
