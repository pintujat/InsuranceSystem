package com.manipal.service;
import java.util.List;

import com.manipal.model.*;

public interface UserService {
	
	public int AddUser( String name, String DOB, String gender,
			String panNo, Double salary, Long mobNo, String nationality,
			String password) throws Exception;
	

	public List<UserModel> findAllUsers();	
	
	void UpdateUser(long userId, String name,String dob,
			String gender,String pan_no,double salary, long mob_no,String nat,String candidate_password) throws Exception;


	List<UserModel> getUserById(long userId);
	
}
