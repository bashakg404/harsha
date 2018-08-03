package com.jlcindia.jdbc.util;
import java.sql.*;
import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab8 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null; 
		PreparedStatement ps=null;
		try{
			con=JDBCUtil.getMYSQLConnection();
			int sid=95;
			String nm="anish";
			String em= "anish@jlc.com";
			long phn=667759842789L;
			String qry="insert into jlcstudents values (?,?,?,?)";
			System.out.println(qry);
			ps=con.prepareStatement(qry);
			
			ps.setInt(1, sid);
			ps.setString(2, nm);
			ps.setString(3, em);
			ps.setLong(4, phn);

			int x=ps.executeUpdate();
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
			