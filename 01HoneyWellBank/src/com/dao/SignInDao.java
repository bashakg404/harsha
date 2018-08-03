package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.to.SigninTO;
import com.util.DBUtil;

public class SignInDao {
	Connection connection;

	public SignInDao() throws ClassNotFoundException, SQLException {
		connection = DBUtil.getConnection();
	}

	public boolean signin(SigninTO signinTO) throws SQLException {
		// "SELECT USER_NAME,PASSWORD FROM BSJSP_BANK WHERE SELECT USER_NAME='"+signinTO.getUsername()+"' AND PASSWORD='"+signinTO.getPassword()+"'"
		//DOnt practise like ABOVE 'aa' value is goin to chk, so rs dont have value, so resltset is exhausted
		System.out.println("inside SignInDao signin()^^^^^^^^ ");
		boolean flag = false;
		// "SELECT USER_NAME,PASSWORD,NAME,ACCOUNT_NUMBER FROM BSJSP_BANK WHERE SELECT USER_NAME=? AND PASSWORD=?";
		String query1 = "SELECT USER_NAME,PASSWORD,NAME,ACCOUNT_NUMBER FROM BSJSP_BANK WHERE USER_NAME=? AND PASSWORD=?";
	//	String query1 = "SELECT USER_NAME,PASSWORD,NAME,ACCOUNT_NUMBER FROM BSJSP_BANK;"
		PreparedStatement prepareStatement = connection.prepareStatement(query1);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
		prepareStatement.setString(1, signinTO.getUsername());
		prepareStatement.setString(2, signinTO.getPassword());
		System.out.println("userName is :" + signinTO.getUsername());
		System.out.println("userName is :" + signinTO.getPassword());
		ResultSet resultSet = prepareStatement.executeQuery();
		while (resultSet.next()) {
			System.out.println("inside reslt set");
			// String username = resultSet.getString("USER_NAME");
			// String password = resultSet.getString("PASSWORD");
			if (resultSet.getString("USER_NAME").equalsIgnoreCase(
					signinTO.getUsername())
					&& resultSet.getString("PASSWORD").equalsIgnoreCase(
							signinTO.getPassword())) {
				flag = true;
				break;
				// return flag;
			}
		}
	//	if(flag==true) wrong approach.. if u write like this it'll tak as new one and execute..
		if (flag) {
			System.out.println("inside if just out reslt set flag=TRUE");
			signinTO.setName(resultSet.getString("NAME"));
			signinTO.setAccountnumber(resultSet.getInt("ACCOUNT_NUMBER"));
			return flag = true;
		} else {
			System.out.println("inside if just out reslt set flag=FALSE");
			return flag = false;
		}

	}
}
