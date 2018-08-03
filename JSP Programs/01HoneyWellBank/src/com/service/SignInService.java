package com.service;

import java.sql.SQLException;

import com.dao.SignInDao;
import com.to.SigninTO;

public class SignInService {

	public boolean signin(SigninTO signinTO) throws ClassNotFoundException, SQLException {
		SignInDao signInDao = new SignInDao();
		return signInDao.signin(signinTO);
	}
}
