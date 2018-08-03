package com.basha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl= "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user= "root";
		String Password= "root";
		try{
			System.out.println("Connecting to Database: " + jdbcUrl);
			Connection myConn= DriverManager.getConnection(jdbcUrl, user, Password); 
			System.out.println("Connection Successfull");
		}
		catch(Exception exc){
			exc.printStackTrace();
		}

	}

}
