package com.manipal.model;

import java.util.Date;

public class Policy {
	private long policyId;
	private long insuranceId;
	private String policyHolderName;
	private double coverage;
	private double amount;
	private String policyDate;
	private long agentId;
	private long userId;
	private boolean status;
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Policy(long policyId, long insuranceId, String policyHolderName,
			double coverage, double amount, String policyDate, long agentId,
			long userId,boolean status) {
		super();
		this.policyId = policyId;
		this.insuranceId = insuranceId;
		this.policyHolderName = policyHolderName;
		this.coverage = coverage;
		this.amount = amount;
		this.policyDate = policyDate;
		this.agentId = agentId;
		this.userId = userId;
		this.status=status;
	}
	
	public Policy(long policyId, long insuranceId, String policyHolderName,
			double coverage, double amount, String policyDate, long agentId,
			long userId) {
		super();
		this.policyId = policyId;
		this.insuranceId = insuranceId;
		this.policyHolderName = policyHolderName;
		this.coverage = coverage;
		this.amount = amount;
		this.policyDate = policyDate;
		this.agentId = agentId;
		this.userId = userId;
		
	}
	public long getPolicyId() {
		return policyId;
	}
	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}
	public long getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(long insuranceId) {
		this.insuranceId = insuranceId;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public double getCoverage() {
		return coverage;
	}
	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPolicyDate() {
		return policyDate;
	}
	public void setPolicyDate(String policyDate) {
		this.policyDate = policyDate;
	}
	public long getAgentId() {
		return agentId;
	}
	public void setAgentId(long agentId) {
		this.agentId = agentId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	
}