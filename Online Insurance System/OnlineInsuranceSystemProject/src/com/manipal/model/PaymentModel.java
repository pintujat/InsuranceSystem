package com.manipal.model;

public class PaymentModel {
	private long paymentId;
	private long policyId;
	private String paymentDate;
	private double amount;
	private String paymentMode;
	private String Status;
	



	public PaymentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PaymentModel(long paymentId, long policyId, String paymentDate,
			double amount, String paymentMode, String Status) {
		super();
		this.paymentId = paymentId;
		this.policyId = policyId;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.paymentMode = paymentMode;
		this.Status = Status;
	}
	
	
	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	public long getPaymentId() {
		return paymentId;
	}
	
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	
	public long getPolicyId() {
		return policyId;
	}
	
	
	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}
	
	public String getPaymentDate() {
		return paymentDate;
	}
	
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getPaymentMode() {
		return paymentMode;
	}
	
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
}