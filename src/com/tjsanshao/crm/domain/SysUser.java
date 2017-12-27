package com.tjsanshao.crm.domain;

import java.util.HashSet;
import java.util.Set;

public class SysUser {
	private Long userId;
	private String userCode;
	private String userName;
	private String userPassword;
	private String userState;
	private Set saleVisits = new HashSet(0);
	private Set sysRoles = new HashSet(0);
	private Set cstCustomersForCustUserId = new HashSet(0);
	private Set cstCustomersForCustCreateId = new HashSet(0);

	public SysUser() {
	}

	public SysUser(String userCode, String userName, String userPassword, String userState) {
		this.userCode = userCode;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userState = userState;
	}

	public SysUser(String userCode, String userName, String userPassword, String userState, Set saleVisits,
			Set sysRoles, Set cstCustomersForCustUserId, Set cstCustomersForCustCreateId) {
		this.userCode = userCode;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userState = userState;
		this.saleVisits = saleVisits;
		this.sysRoles = sysRoles;
		this.cstCustomersForCustUserId = cstCustomersForCustUserId;
		this.cstCustomersForCustCreateId = cstCustomersForCustCreateId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserState() {
		return this.userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public Set getSaleVisits() {
		return this.saleVisits;
	}

	public void setSaleVisits(Set saleVisits) {
		this.saleVisits = saleVisits;
	}

	public Set getSysRoles() {
		return this.sysRoles;
	}

	public void setSysRoles(Set sysRoles) {
		this.sysRoles = sysRoles;
	}

	public Set getCstCustomersForCustUserId() {
		return this.cstCustomersForCustUserId;
	}

	public void setCstCustomersForCustUserId(Set cstCustomersForCustUserId) {
		this.cstCustomersForCustUserId = cstCustomersForCustUserId;
	}

	public Set getCstCustomersForCustCreateId() {
		return this.cstCustomersForCustCreateId;
	}

	public void setCstCustomersForCustCreateId(Set cstCustomersForCustCreateId) {
		this.cstCustomersForCustCreateId = cstCustomersForCustCreateId;
	}
}
