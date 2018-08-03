package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.servlet.http.HttpSession;

import com.to.DepositResultTO;
import com.util.DBUtil;

public class DepositDAO {
	Connection connection = null;

	public DepositDAO() throws ClassNotFoundException, SQLException {
		connection = DBUtil.getConnection();
	}

	public int deposit(DepositResultTO depositResultTO) {
		System.out.println("iinside depositDAO method...");
		// depositResultTO.getDepositeamount();
		PreparedStatement preparedStatement1 = null;
		ResultSet resultSet1 = null;
		PreparedStatement preparedStatement2 = null;
		int UpdatedBalance = 0;
		int isAmountDeposited = 0;
		try {
			connection.setAutoCommit(false);
			String query1 = "SELECT AMOUNT,ACCOUNT_NUMBER FROM BSJSP_BANK WHERE ACCOUNT_NUMBER=?";
			preparedStatement1 = connection.prepareStatement(query1);
			preparedStatement1.setInt(1, depositResultTO.getAccnumber());
			System.out.println(depositResultTO.getAccnumber());
			resultSet1 = preparedStatement1.executeQuery();
			System.out.println("before rs.next()");
			resultSet1.next();
			int oldBalance = resultSet1.getInt("AMOUNT");
			System.out.println("old balance: " + oldBalance);
			UpdatedBalance = oldBalance + depositResultTO.getDepositeamount();
			
			System.out.println(depositResultTO.getAccnumber());
		//	String query2 = "UPDATE BSJSP_BANK SET AMOUNT="+UpdatedBalance+" WHERE ACCOUNT_NUMBER=?";
			String query2 = "UPDATE BSJSP_BANK SET AMOUNT=? WHERE ACCOUNT_NUMBER=?";
			preparedStatement2 = connection.prepareStatement(query2);
			preparedStatement2.setInt(1, UpdatedBalance);
			preparedStatement2.setInt(2, depositResultTO.getAccnumber());
			isAmountDeposited = preparedStatement2.executeUpdate();
			depositResultTO.setOldbalance(oldBalance);
			depositResultTO.setUpdatedbalance(UpdatedBalance);
			
			//DEPOSIT RES FOR MINISTATEMENT
			String q1 = "INSERT INTO BSJSP_TRANSACTIONS(TRANS_ID,ACCOUNT_NUMBER,TRANSACTION,TRANSACTION_DATE,AMOUNT,DESCRIPTION) VALUES (TRANS_ID_SEQ.NEXTVAL,?,?,?,?,?)";
			PreparedStatement ps1 = null;
			ps1 = connection.prepareStatement(q1);
	//		ps1.setInt(1, 1);
			ps1.setInt(1, depositResultTO.getAccnumber());
			ps1.setString(2, "DEPOSIT");
			java.util.Date date = new java.util.Date();
			Timestamp currentdate = new Timestamp(date.getTime());
			ps1.setTimestamp(3,currentdate);
			ps1.setInt(4, depositResultTO.getDepositeamount());
			ps1.setString(5, "Amount has been deposited");
			int updateTrTbl = ps1.executeUpdate();
			System.out.println("values added to TrTable of deposit");
			
			connection.commit();
			// return isAmountUpdated; return this at the end of this method..els errr...
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				preparedStatement1.close();
				preparedStatement2.close();
				resultSet1.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isAmountDeposited;
	}
}