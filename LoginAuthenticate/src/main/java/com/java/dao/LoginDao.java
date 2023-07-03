package com.java.dao;

import com.java.beans.MyUser;
import com.java.beans.RegisterUser;

public interface LoginDao {
	
	MyUser authenticateUser(String uname, String pass);

	int registerUser(RegisterUser r, MyUser user);

}
