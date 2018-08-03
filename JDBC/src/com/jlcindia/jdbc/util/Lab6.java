package com.jlcindia.jdbc.util;
import java.sql.*;
import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab6 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null; 
		ResultSet rs=null;
		
		try{
			con=JDBCUtil.getMYSQLConnection();
			int sid=102;
			
			String qry=String.format("select * from jlcstudents where sid=%d", sid);
			System.out.println(qry);
			st=con.createStatement();
			rs=st.executeQuery(qry);
		System.out.println("%%%%%%%%");
			if (rs.next()){
				int id =rs.getInt(1);
				String nm=rs.getString(2);
				String eml=rs.getString(3);
				long phn=rs.getLong(4);
				System.out.println("########");
				System.out.println(id +"\t" + nm + "\t" + eml + "\t" + phn);
			
				System.out.println("record selected successfully");
			}
			else
				System.out.println("no record found");
		}catch (Exception  e){
			e.printStackTrace();
		}finally{
		JDBCUtil.cleanup(st,con);
		}
		
		
		}
		}
			