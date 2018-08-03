package com.jlcindia.jdbc.util;
import java.sql.*;
import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab3 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null; 
		try{
			con=JDBCUtil.getMYSQLConnection();
			System.out.println("========");
			
			//String sql="insert into jlcstudents values(100,'Srikumar','Sri@jlc',77867565879)";
			String sql="insert into jlcstudents values(107,'avinash','avinash@jlc',77454657676779)";
			//String sql1= "update jlcstudents set email='bas@jlc' where sid=100";
			st=con.createStatement();
			int x=st.executeUpdate(sql);
			if (x==1){
				System.out.println("record inserted");
			}else{
				System.out.println("record not inserted");
				
			}
		}catch(Exception e){
			e.printStackTrace();
	}finally{
		JDBCUtil.cleanup(st, con);
	}

}}

