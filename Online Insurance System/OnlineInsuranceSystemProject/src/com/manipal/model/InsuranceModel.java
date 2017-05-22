package com.manipal.model;

public class InsuranceModel {
	long insuranceid;
	String insurancetype;
	String description;
	String status;
	public InsuranceModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InsuranceModel( long insuranceid, String insurancetype,
			String description) {
		super();
		this.insuranceid = insuranceid;
		this.insurancetype = insurancetype;
		this.description = description;
		//this.status = status;
	}
	

	public InsuranceModel(long insuranceid, String insurancetype,
			String description, String status) {
		super();
		this.insuranceid = insuranceid;
		this.insurancetype = insurancetype;
		this.description = description;
		this.status = status;
	}
	
	
	
	
	
	public InsuranceModel(String insurancetype, String description) {
		super();
		this.insurancetype = insurancetype;
		this.description = description;
	}
	
	
	public long getInsuranceid() {
		return insuranceid;
	}
	
	public void setInsuranceid(long insuranceid) {
		this.insuranceid = insuranceid;
	}
	
	public String getInsurancetype() {
		return insurancetype;
	}
	public void setInsurancetype(String insurancetype) {
		this.insurancetype = insurancetype;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
