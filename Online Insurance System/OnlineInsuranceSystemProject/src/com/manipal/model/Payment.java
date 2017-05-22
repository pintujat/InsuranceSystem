package com.manipal.model;

import java.util.Date;

public class Payment {
	//private long paymentId;
	private long policyId;
	private String paymentDate;
	private double amount;
	private String paymentMode;
	private String Status;
	private String cardNo;
	private String cvv;
	

	



	@Override
	public String toString() {
		return "Payment [paymentId=" +  " policyId=" + policyId
				+ ", paymentDate=" + paymentDate + ", amount=" + amount
				+ ", paymentMode=" + paymentMode + ", Status=" + Status
				+ ", cardNo=" + cardNo + ", cvv=" + cvv + "]";
	}


	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Payment( long policyId, String paymentDate,
			double amount, int userid ,String paymentMode, String Status, String cardNo,String cvv) {
		super();
		//this.paymentId = paymentId;
		this.policyId = policyId;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.paymentMode = paymentMode;
		this.Status = Status;
		this.cardNo = cardNo;
		this.cvv = cvv;
		
	}
	
	


	public String getCardNo() {
		return cardNo;
	}


	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}


	public String getCvv() {
		return cvv;
	}


	public void setCvv(String cvv) {
		this.cvv = cvv;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
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
	
	public void setPaymentDate(String payment_date) {
		this.paymentDate = payment_date;
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