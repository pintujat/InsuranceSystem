package com.manipal.DAO;

import java.util.List;

import com.manipal.model.UserModel;

public interface UserDao {

	public int insertUser(UserModel user);								// insert into user-agent
	public List<UserModel> findAll();									// select * from user-admin
	public void update1(UserModel user);
	public List<UserModel> getUserById(long userId);
}
