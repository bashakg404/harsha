package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.to.WithdrawTO;
import com.util.DBUtil;

public class WithdrawDAO {
	Connection connection = null;
		 
	public int withdraw(WithdrawTO withdrawTO) throws Exception 
	{
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int UpdatedBalanceAftWithdrawl = 0;
		int isWithdrawSucced = 0;
		PreparedStatement preparedStatement1 = null;
		try 
		{
		connection = DBUtil.getConnection();
		String query = "SELECT AMOUNT FROM BSJSP_BANK WHERE ACCOUNT_NUMBER=?";
		
		
		
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, withdrawTO.getAccnumber());
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			int oldBalance = resultSet.getInt("AMOUNT");
			System.out.println("old balance: "+oldBalance);
			
			if(oldBalance>=withdrawTO.getWithdrawamount())
			{
			UpdatedBalanceAftWithdrawl = oldBalance-withdrawTO.getWithdrawamount();
			
			String query1 = "UPDATE BSJSP_BANK SET AMOUNT=? WHERE ACCOUNT_NUMBER=?";
			preparedStatement1 = connection.prepareStatement(query1);
			preparedStatement1.setInt(1, UpdatedBalanceAftWithdrawl);
			preparedStatement1.setInt(2, withdrawTO.getAccnumber());
			isWithdrawSucced = preparedStatement1.executeUpdate();
			
			//WITHDRAW RES FOR MINISTATEMENT
			String q1 = "INSERT INTO BSJSP_TRANSACTIONS(TRANS_ID,ACCOUNT_NUMBER,TRANSACTION,TRANSACTION_DATE,AMOUNT,DESCRIPTION) VALUES (TRANS_ID_SEQ.NEXTVAL,?,?,?,?,?)";
			PreparedStatement ps1 = null;
			ps1 = connection.prepareStatement(q1);
			//ps1.setInt(1, 10);
			ps1.setInt(1,withdrawTO.getAccnumber());
			ps1.setString(2, "WITHDRAW");
			java.util.Date date = new java.util.Date();
			Timestamp currentdate = new Timestamp(date.getTime());
			ps1.setTimestamp(3,currentdate);
			ps1.setInt(4, withdrawTO.getWithdrawamount());
			ps1.setString(5, "Amount has been withdrawn");
			int updateTrTbl = ps1.executeUpdate();
			System.out.println("values added to TrTable of deposit");
			
			connection.commit();
			System.out.println("control is going back fron DAO to controller");
			}
			else
			{
				System.out.println("Shortage of money");
				throw new Exception("There is shortage of money to withdraw form your account");
			}
		} 
		catch(ClassNotFoundException e)
		{}
		catch (SQLException e) {
		}
		 /*finally{
				preparedStatement1.close();
				 preparedStatement.close();
				 resultSet.close();
		 }*/
		return isWithdrawSucced;
	}
}
