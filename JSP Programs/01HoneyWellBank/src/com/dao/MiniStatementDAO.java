package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import com.to.MinistatementTO;
import com.util.DBUtil;

public class MiniStatementDAO {
	Connection connection = null;

	public MiniStatementDAO() throws ClassNotFoundException, SQLException {
		connection = DBUtil.getConnection();
	}
	public ArrayList statement(MinistatementTO ministatementTO) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		ArrayList arrayList = null;
		arrayList = new ArrayList();
			try {
				String q1 = "SELECT TRANS_ID,ACCOUNT_NUMBER,TRANSACTION,TRANSACTION_DATE,AMOUNT,DESCRIPTION FROM BSJSP_TRANSACTIONS WHERE ACCOUNT_NUMBER=?" ;
				preparedStatement = connection.prepareStatement(q1);
				preparedStatement.setInt(1, ministatementTO.getAccnumb());
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()){
				int trid = resultSet.getInt("TRANS_ID");
				int accnu = resultSet.getInt("ACCOUNT_NUMBER");
				String trnsction = resultSet.getString("TRANSACTION");
				Timestamp timestampdate = resultSet.getTimestamp("TRANSACTION_DATE");
				java.util.Date date = new Date(timestampdate.getTime());
				int amt = resultSet.getInt("AMOUNT");
				String desc = resultSet.getString("DESCRIPTION");
				
				ministatementTO.setTransactionId(trid);
				ministatementTO.setTransactiontype(trnsction);
				ministatementTO.setDate(date);
				ministatementTO.setAmount(amt);
				ministatementTO.setDesc(desc);
				
				arrayList.add(ministatementTO);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally{
				try {
					resultSet.close();
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return arrayList;
	}
}
