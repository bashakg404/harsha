package com.showemp.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {

static {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	}catch(ClassNotFoundException ex) {
		System.out.println(ex);
		System.out.println("*****************");
	}}
public static Connection getMYSQLConnection() throws SQLException {
	String url = "jdbc:mysql://localhost:3306/MY_DB";
	Connection con = DriverManager.getConnection(url, "root", "root");
	return con;
	
}

public static void cleanup(Statement st, Connection con){
	try{
		if(st != null) st.close(); if(con !=null) con.close();
		}catch (Exception e){
			System.out.println(e);
		}}

public static void cleanup(ResultSet rs, Statement st, Connection con){
	try{
		if(rs !=null)
			rs.close();
		if(st !=null)
			st.close();
		if(con !=null)
			con.close();
		System.out.println("------------");
	}catch (Exception e){
		System.out.println(e);
}
	
}}


