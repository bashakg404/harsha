package com.cgiindia.util;

import java.sql.*;

public class JDBCUtil {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}

	public static Connection getMySQLConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/BASHA";
		Connection connection = DriverManager.getConnection(url, "root", "harsha404");
		return connection;
	}

public static void cleanup(Statement statement, Connection connection){
	try{
		if(statement !=null) statement.close();
		if(connection!=null) connection.close();
		
	}catch(Exception e){System.out.println(e);
}
}

public static void cleanup(ResultSet resultset, Statement statement, Connection connection){
	try{

		if(resultset !=null)resultset.close();
		if(statement !=null) statement.close();
		if(connection!=null) connection.close();
		
	}catch(Exception e){System.out.println(e);
}}}