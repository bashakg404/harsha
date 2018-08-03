package com.jlcindia.jdbc.util;
import java.sql.*;
import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab10 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try{
			con=JDBCUtil.getMYSQLConnection();
			String qry=null;
	qry="insert into jlcstudents values(91, 'mani','mani@jlc', 234545412)";

	qry="update jlcstudents set phone=9845731438";
	System.out.println("+++++++++");
	qry="select * from jlcstudents";
	System.out.println("=======");
			System.out.println(qry);
			
			ps=con.prepareStatement(qry);
			boolean b1=ps.execute(qry);
			if (b1){
				rs=ps.getResultSet();
				if(rs.next()){
					do{
						int sid=rs.getInt(1);
						String nm=rs.getString(2);
						String eml=rs.getString(3);
						long phn=rs.getLong(4);
						System.out.println(sid +"\t" + nm + "\t" + eml + "\t" + phn);
					}while(rs.next());
				}else{
				int x=ps.getUpdateCount();
				System.out.println("Result:" +x);
			}
		
			}}catch (Exception  e){
			e.printStackTrace();
		}finally{
		JDBCUtil.cleanup(rs,ps,con);
		}
		
		
	}
		}
			