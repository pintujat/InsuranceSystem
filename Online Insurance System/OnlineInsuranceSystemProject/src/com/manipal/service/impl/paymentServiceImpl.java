package com.manipal.service.impl;

import java.util.Date;

import com.manipal.DAO.PaymentDAO;
import com.manipal.DAO.jdbc.jdbcPaymentDAOImpl;
import com.manipal.model.Payment;
import com.manipal.service.paymentService;

public class paymentServiceImpl implements paymentService{

	@Override
	public boolean updatepayment(Long policy_id,String payment_date,double amount,String payment_mode,String status) {
		PaymentDAO paydao=new jdbcPaymentDAOImpl();
		Payment pay=new Payment();
		
		//pay.setPaymentId(paymentId);
		pay.setPolicyId(policy_id);
		pay.setPaymentDate(payment_date);
		pay.setAmount(amount);
		pay.setPaymentMode(payment_mode);
		pay.setStatus(status);

		
		
	
		//pay.setCustomerId(Integer.parseInt(customerId));
		
		boolean flag=paydao.updatepayment(pay);
		
		if(flag)
		{
			return true;
		}
		else
		return false;
	}

	

	/*@Override
	public boolean updatepayment(String paymentId) {
		PaymentDAO paydao=new jdbcPaymentDAOImpl();
		Payment pay=new Payment();
		
		pay.setPaymentId(Integer.parseInt(paymentId));
		//pay.setCustomerId(Integer.parseInt(customerId));
		
		boolean flag=paydao.updateOrderDetails(pay);
		
		if(flag)
		{
			return true;
		}
		else
		return false;
	}*/

}
