package com.manipal.DAO.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import com.manipal.DAO.PaymentDAO;
import com.manipal.model.Payment;

public class jdbcPaymentDAOImpl implements PaymentDAO{

	@Override
	public boolean updatepayment(Payment pay) {
		// TODO Auto-generated method stub
		int row=0;
//		String temp;
		
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		Date dateobj = new Date();
		try{
		
			Connection con=ConnectionHelper.getMySqlConnection();
			PreparedStatement pst=null;
			
		/*	System.out.println(row);
			System.out.println(df.format(dateobj));
			System.out.println(pay.getPaymentId());*/
			pst=con.prepareStatement("insert into payment(paymentId,policyid,paymentdate,amount,paymentmode,status) values (PAYMENT_SEQ.NEXTVAL,?,SYSDATE,?,?,'Active')");
//PROVIDED CART_ID AND CUSTOMER_ID IS ALREADY CREATED

			pst.setLong(1, pay.getPolicyId());
	//		pst.setString(2, pay.getPaymentDate());
			pst.setDouble(2,pay.getAmount());
			pst.setString(3,pay.getPaymentMode());
			//pst.setString(5, pay.getStatus());
			row+=pst.executeUpdate();
		

			

	/*		
			pst=con.prepareStatement("insert into shipping_details(shipping_id, shipping_date, shipping_status, order_id, address_id) values(SHIPPING_SEQ.NEXTVAL,?,'active',ORDER_SEQ.CURRVAL,((SELECT last_number  FROM user_sequences WHERE sequence_name = 'ADDRESS_SEQ')-1))");
			pst.setString(1, df.format(dateobj));
			
			row+=pst.executeUpdate();
			System.out.println(row);*/
			
			
			
		/*	pst=con.prepareStatement("update payment set status='inactive' where paymentId=?");
			pst.setLong(1, pay.getPaymentId());
			
			
			row+=pst.executeUpdate();
			System.out.println(row);*/
			
			
			/*
			
			pst=con.prepareStatement("update cart set status='inactive' where cart_id=?");
			
			pst.setString(1, Integer.toString(pay.getCartId()));
			row+=pst.executeUpdate();
			System.out.println("row 1 "+row);
			
			System.out.println(pay.getCartId());
			System.out.println(df.format(dateobj));
			

			pst=con.prepareStatement("insert into order_details(order_id, cart_id, order_date, customer_id ) values(ORDER_SEQ.NEXTVAL,?,?,?)");
			pst.setInt(1, pay.getCartId());
			pst.setString(2, df.format(dateobj));
			pst.setInt(3, pay.getCustomerId());
			row+=pst.executeUpdate();
			System.out.println("row 2"+row);
			
			pst=con.prepareStatement("select order_id from order_details where cart_id=?");
			pst.setString(1, Integer.toString(pay.getCartId()));
			ResultSet rs=pst.executeQuery();
			String orderId=Integer.toString(rs.getInt(0));
			
			
			pst=con.prepareStatement("select address_id from customer_details where customer_id=?");
			pst.setString(1, Integer.toString(pay.getCustomerId()));
			rs=pst.executeQuery();
			String addressId=Integer.toString(rs.getInt(0));
			
			pst=con.prepareStatement("insert into shipping_details(shipping_id, address_id, shipping_date, shipment_status, order_id) values(SHIPPING_SEQ.NEXTVAL,?,?,'active',?)");
			pst.setString(1, addressId);
			pst.setString(2, df.format(dateobj));
			pst.setString(3, orderId);
			row+=pst.executeUpdate();
			System.out.println("row 3"+row);

					*/
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		if(row==3){
			return true;
		}
		else
		return false;
	}

	
	
}
