package com.manipal.service;

import java.sql.Date;

public interface paymentService {
	
	

	boolean updatepayment( Long policy_id,
			String paymentDate, double amount, String payment_mode,
			String status);

}
