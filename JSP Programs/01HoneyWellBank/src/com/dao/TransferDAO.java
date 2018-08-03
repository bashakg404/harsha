package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.to.TransferResultTO;
import com.util.DBUtil;

public class TransferDAO {
	Connection connection = null;

	public TransferDAO() throws ClassNotFoundException, SQLException 
	{
		connection = DBUtil.getConnection();
	}

	public int transfer(TransferResultTO transferResultTO) throws Exception
	{
		System.out.println(" inside  TransferDAO transfer method..");
		int transferamount = 0;
		int sourceAmount = 0;
		int isTranferSucceed = 0;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement1 = null;
		ResultSet resultSet1 = null;
		PreparedStatement preparedStatement2 = null;
		PreparedStatement preparedStatement3 = null;
		ResultSet resultSet2 = null;
		PreparedStatement preparedStatement4 = null;
		try 
		{
			// GETTING SOURCE AMOUNT
			connection.setAutoCommit(false);
			String query = "SELECT AMOUNT FROM BSJSP_BANK WHERE ACCOUNT_NUMBER=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, transferResultTO.getAccnumber());
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			transferamount = transferResultTO.getTransferamount();
			sourceAmount = resultSet.getInt("AMOUNT");

			if (sourceAmount >= transferamount)
			{
				System.out.println("********************");
				String query1 = "SELECT ACCOUNT_NUMBER FROM BSJSP_BANK";
				System.out.println(" inside sourceAmount >= transferamount");

				preparedStatement1 = connection.prepareStatement(query1);
				resultSet1 = preparedStatement1.executeQuery();
				int checkaccountNumber = 0;
				boolean status = false;
				while (resultSet1.next())
				{
					System.out.println("entri RS");
					checkaccountNumber = resultSet1.getInt("ACCOUNT_NUMBER");
					if (transferResultTO.getDestinationaccountnumber() == checkaccountNumber) 
					{
						System.out.println(checkaccountNumber);
						System.out.println("chkig");
						System.out.println(transferResultTO
								.getDestinationaccountnumber());
						System.out.println(checkaccountNumber);
						status = true;
						break;
					}
				}
				// if (status==true) {
				if (status) 
				{
					System.out.println("entering status ttrue");
					int newsourceAmount = sourceAmount - transferamount;
					String query6 = "UPDATE BSJSP_BANK SET AMOUNT=? WHERE ACCOUNT_NUMBER=?";
					// String query6 =
					// "UPDATE BSJSP_BANK SET AMOUNT="+newsourceAmount+" WHERE ACCOUNT_NUMBER="+transferResultTO.getAccnumber()+"";
					System.out.println(newsourceAmount);
					System.out.println(transferResultTO.getAccnumber());
					preparedStatement2 = connection.prepareStatement(query6);
					preparedStatement2.setInt(1, newsourceAmount);
					preparedStatement2.setInt(2,
							transferResultTO.getAccnumber());
					int isSourceAmountUpdated = preparedStatement2
							.executeUpdate();

					String query7 = "SELECT AMOUNT FROM BSJSP_BANK WHERE ACCOUNT_NUMBER=?";
					preparedStatement3 = connection.prepareStatement(query7);
					preparedStatement3.setInt(1,
							transferResultTO.getDestinationaccountnumber());
					resultSet2 = preparedStatement3.executeQuery();
					resultSet2.next();
					int oldDestinationAmount = resultSet2.getInt("AMOUNT");
					int newDestinationAmount = oldDestinationAmount
							+ transferamount;

					String query8 = "UPDATE BSJSP_BANK SET AMOUNT=? WHERE ACCOUNT_NUMBER=?";
					preparedStatement4 = connection.prepareStatement(query8);
					preparedStatement4.setInt(1, newDestinationAmount);
					preparedStatement4.setInt(2,
							transferResultTO.getDestinationaccountnumber());
					isTranferSucceed = preparedStatement4.executeUpdate();
					System.out
							.println(" before connection.commit()333333333333333333338888888888877777");

					// TRANSFER RES FOR MINISTATEMENT
					String q1 = "INSERT INTO BSJSP_TRANSACTIONS(TRANS_ID,ACCOUNT_NUMBER,TRANSACTION,TRANSACTION_DATE,AMOUNT,DESCRIPTION) VALUES (TRANS_ID_SEQ.NEXTVAL,?,?,?,?,?)";
					PreparedStatement ps1 = null;
					ps1 = connection.prepareStatement(q1);
					// ps1.setInt(1, 6);
					ps1.setInt(1, transferResultTO.getAccnumber());
					ps1.setString(2, "TRANSFER");
					java.util.Date date = new java.util.Date();
					Timestamp currentdate = new Timestamp(date.getTime());
					ps1.setTimestamp(3, currentdate);
					ps1.setInt(4, transferResultTO.getTransferamount());
					ps1.setString(5, "" + transferResultTO.getTransferamount()
							+ "Rs has been transfered to AccNo."
							+ transferResultTO.getDestinationaccountnumber()
							+ "");
					int updateTrTbl = ps1.executeUpdate();
					System.out.println("values added to TrTable of transfer");

					connection.commit();
					// return isDestinationAmountUpdated;
				} 
				else 
				{
					// NO ACCOUNT NUMBER
					System.out.println("else block...no acc numb exist");
					throw new Exception("There is no account number exist..");
				}
			}
			else {
				
				System.out.println("amount shortage");
				throw new Exception("There is shortage of amount");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}/* finally{
			 preparedStatement.close();
			 resultSet.close();
			 preparedStatement1.close(); 
			 resultSet1.close();
			 preparedStatement2.close();
			 preparedStatement3.close();
			 resultSet2.close();
			 preparedStatement4.close();
		}*/
		return isTranferSucceed;
	}

}