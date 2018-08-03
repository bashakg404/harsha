package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.to.BalanceTO;
import com.util.DBUtil;

public class BalanceDAO {
	Connection connection;

	public BalanceDAO() throws ClassNotFoundException, SQLException {
		connection = DBUtil.getConnection();
	}

	public int balance(BalanceTO balanceTO) {
		System.out.println("inside BalanceDAO method");
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int intBalanceGot = 0;
		try {
			String query = "SELECT AMOUNT FROM BSJSP_BANK WHERE ACCOUNT_NUMBER=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, balanceTO.getAccnumb());
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			intBalanceGot = resultSet.getInt("AMOUNT");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				preparedStatement.close();
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return intBalanceGot;
	}

}
