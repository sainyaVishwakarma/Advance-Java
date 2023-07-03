package com.java.service;

import com.java.beans.MyUser;
import com.java.beans.RegisterUser;
import com.java.dao.LoginDao;
import com.java.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
private LoginDao ldao;


	public LoginServiceImpl() {
	super();
	this.ldao = new LoginDaoImpl();
}


	@Override
	public MyUser validateUser(String uname, String pass) {
		// TODO Auto-generated method stub
		return ldao.authenticateUser(uname,pass);
	}


	@Override
	public int addRegisterUser(RegisterUser r, MyUser user) {
		// TODO Auto-generated method stub
		return ldao.registerUser(r,user);
	}

}
