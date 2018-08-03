package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import com.to.NewCustomerTO;
import com.util.DBUtil;

public class NewCustomerDAO {
	Connection connection = null;

	public NewCustomerDAO() throws ClassNotFoundException, SQLException {
		connection = DBUtil.getConnection();
	}

	public int createUser(NewCustomerTO newCustomerTO) throws SQLException{
	//	String name = newCustomerTO.getName();
	//	String username = newCustomerTO.getUsername();
	//	String password = newCustomerTO.getPassword();
	//	int amount = newCustomerTO.getAmount();
	//	String email = newCustomerTO.getEmail();
		Date date = newCustomerTO.getDate();
		Timestamp currentdate = new Timestamp(date.getTime());
		connection.setAutoCommit(false);
		String query = "INSERT INTO BSJSP_BANK(ACCOUNT_NUMBER,NAME,USER_NAME,PASSWORD,AMOUNT,EMAIL_ID,CREATION_DATE) VALUES(ACCJSP_NUMBER_SEQ.NEXTVAL,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1,newCustomerTO.getName());
		preparedStatement.setString(2, newCustomerTO.getUsername());
		preparedStatement.setString(3, newCustomerTO.getPassword());
		preparedStatement.setInt(4, newCustomerTO.getAmount());
	//	preparedStatement.setString(4, newCustomerTO.getAmount()); it'll compile.if u put string it shows error
		preparedStatement.setString(5, newCustomerTO.getEmail());
		preparedStatement.setTimestamp(6, new Timestamp(date.getTime()));
		int executeUpdate = preparedStatement.executeUpdate();
		
		String query2 ="SELECT ACCOUNT_NUMBER FROM BSJSP_BANK WHERE USER_NAME = ?";
	//	String query2 ="SELECT ACCOUNT_NUMBER FROM BSJSP_BANK WHERE USER_NAME='"+newCustomerTO.getUsername()+"'";
	//	String query2 ="SELECT ACCOUNT_NUMBER FROM BSJSP_BANK";
		PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
		preparedStatement2.setString(1, newCustomerTO.getUsername());
		ResultSet resultSet = preparedStatement2.executeQuery();
		//careful wile writng preparedStatement2. 
		resultSet.next();
			
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println(resultSet.getInt("ACCOUNT_NUMBER"));
		int accno = resultSet.getInt("ACCOUNT_NUMBER");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+accno);
		newCustomerTO.setAccountnumber(accno);
		connection.commit();
		return executeUpdate;
	}
}
