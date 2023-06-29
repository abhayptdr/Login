package com.LoginDemo.Dao;

import com.LoginDemo.Pojo.User;

public interface UserDao {

	boolean checkUserCredentials(User user);
	boolean addNewUser(User user);
}
