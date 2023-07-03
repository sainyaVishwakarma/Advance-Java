package com.java.service;

import com.java.beans.MyUser;
import com.java.beans.RegisterUser;

public interface LoginService {

	MyUser validateUser(String uname, String pass);

	int addRegisterUser(RegisterUser r, MyUser user);

}
