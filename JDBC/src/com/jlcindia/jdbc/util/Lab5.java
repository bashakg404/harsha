package com.jlcindia.jdbc.util;
import java.sql.*;
import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab5 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null; 
		try{
			con=JDBCUtil.getMYSQLConnection();
			int sid=90;
			System.out.println("^^^^^^^^");
			String nm="nish";
			String em= "nish@jlc.com";
			long phn=67121212789L;
			String qry=String.format("insert into jlcstudents values (%d, '%s', '%s', %d)", sid, nm, em, phn);
			System.out.println(qry);
			st=con.createStatement();
			int x=st.executeUpdate(qry);
			if (x==1)
				System.out.println("record inserted successfully");
			else
				System.out.println("no record found");
		}catch (Exception  e){
			e.printStackTrace();
		}finally{
		JDBCUtil.cleanup(st,con);
		}
		
		
		}
		}
			