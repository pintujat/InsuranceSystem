package com.manipal.model;

public class ClaimsModel {
	
	long claimid;
	long policyid;
	String claimdate;
	String status="true";
	
	
	
	public ClaimsModel() {
		super();
	}
	public ClaimsModel(long claimid, long policyid, String claimdate,
			String status) {
		super();
		this.claimid = claimid;
		this.policyid = policyid;
		this.claimdate = claimdate;
		this.status = status;
	}
	public long getClaimid() {
		return claimid;
	}
	public void setClaimid(long claimid) {
		this.claimid = claimid;
	}
	public long getPolicyid() {
		return policyid;
	}
	public void setPolicyid(long policyid) {
		this.policyid = policyid;
	}
	public String getClaimdate() {
		return claimdate;
	}
	public void setClaimdate(String claimdate) {
		this.claimdate = claimdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
