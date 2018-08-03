package com.jlcindia.jdbc.util;
import java.sql.*;
import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab7 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null; 
		ResultSet rs=null;
		
		try{
			con=JDBCUtil.getMYSQLConnection();
			String qry=null;
	qry="insert into jlcstudents values(96, 'gudimani','gudimani@jlc', 234562312)";
			qry="select * from jlcstudents";
			System.out.println("+++++++++");
	qry="update jlcstudents set phone=222222222222";
	System.out.println("+++++++++");
			System.out.println(qry);
			st=con.createStatement();
			boolean b1=st.execute(qry);
			if (b1){
				rs=st.getResultSet();
				if(rs.next()){
					do{
						int sid=rs.getInt(1);
						String nm=rs.getString(2);
						String eml=rs.getString(3);
						long phn=rs.getLong(4);
						System.out.println(sid +"\t" + nm + "\t" + eml + "\t" + phn);
					}while(rs.next());
				}else{
				int x=st.getUpdateCount();
				System.out.println("Result:" +x);
			}
		
			}}catch (Exception  e){
			e.printStackTrace();
		}finally{
		JDBCUtil.cleanup(st,con);
		}
		
		
	}
		}
			