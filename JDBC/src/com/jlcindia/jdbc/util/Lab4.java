package com.jlcindia.jdbc.util;
import java.sql.*;
import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab4 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null; 
		ResultSet rs=null;
		
		try{
			con=JDBCUtil.getMYSQLConnection();
			System.out.println("========");
			String qry="select * from jlcstudents";
			
			st=con.createStatement();
			rs=st.executeQuery(qry);
			if (rs.next()){
				do{
					int sid=rs.getInt(1);
					String nm=rs.getString(2);
					String eml=rs.getString(3);
					long phn=rs.getLong(4);
					System.out.println(sid +"\t" + nm + "\t" + eml + "\t" + phn);
				}while(rs.next());
			}else
				System.out.println("No Record found");
		}catch(Exception e){
			e.printStackTrace();
	}finally{
		JDBCUtil.cleanup(st, con);
	}

}}

