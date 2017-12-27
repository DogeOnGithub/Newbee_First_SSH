package com.tjsanshao.crm.domain;

import java.util.Date;

public class SaleVisit {
	private String visitId;
	private CstCustomer cstCustomer;
	private SysUser sysUser;
	private String visitInterviewee;
	private Date visitTime;
	private String visitAddr;
	private String visitDetail;
	private Date visitNexttime;

	public SaleVisit() {
	}

	public SaleVisit(String visitId) {
		this.visitId = visitId;
	}

	public SaleVisit(String visitId, CstCustomer cstCustomer, SysUser sysUser, String visitInterviewee, Date visitTime,
			String visitAddr, String visitDetail, Date visitNexttime) {
		this.visitId = visitId;
		this.cstCustomer = cstCustomer;
		this.sysUser = sysUser;
		this.visitInterviewee = visitInterviewee;
		this.visitTime = visitTime;
		this.visitAddr = visitAddr;
		this.visitDetail = visitDetail;
		this.visitNexttime = visitNexttime;
	}

	public String getVisitId() {
		return this.visitId;
	}

	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}

	public CstCustomer getCstCustomer() {
		return this.cstCustomer;
	}

	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}

	public SysUser getSysUser() {
		return this.sysUser;
	}

	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}

	public String getVisitInterviewee() {
		return this.visitInterviewee;
	}

	public void setVisitInterviewee(String visitInterviewee) {
		this.visitInterviewee = visitInterviewee;
	}

	public Date getVisitTime() {
		return this.visitTime;
	}

	public void setVisitTime(Date visitTime) {
		this.visitTime = visitTime;
	}

	public String getVisitAddr() {
		return this.visitAddr;
	}

	public void setVisitAddr(String visitAddr) {
		this.visitAddr = visitAddr;
	}

	public String getVisitDetail() {
		return this.visitDetail;
	}

	public void setVisitDetail(String visitDetail) {
		this.visitDetail = visitDetail;
	}

	public Date getVisitNexttime() {
		return this.visitNexttime;
	}

	public void setVisitNexttime(Date visitNexttime) {
		this.visitNexttime = visitNexttime;
	}
}
