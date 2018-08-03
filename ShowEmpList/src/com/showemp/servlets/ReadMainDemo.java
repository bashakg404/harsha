package com.showemp.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;

		Statement st = null;
		ResultSet rs = null;
		try {
			connection = Util.getMYSQLConnection();
			String qry = null;
			Statement st1 = connection.createStatement();
			qry = "SELECT * FROM EMPLOYEE";
			ResultSet rs1 = st1.executeQuery(qry);
			while (rs1.next()) {
				System.out.println(
						rs1.getInt(1) + ", " + rs1.getString(2) + ", " + rs1.getString(3) + "," + rs1.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			Util.cleanup(rs, st, connection);

		}
	}

}
