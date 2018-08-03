package com.jlcindia.jdbc.util;
import java.sql.*;
import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab9 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try{
			con=JDBCUtil.getMYSQLConnection();
			int sid=103;
			
			String qry="select * from jlcstudents where sid=?";
			System.out.println(qry);
			ps=con.prepareStatement(qry);
			ps.setInt(1, sid);
			rs=ps.executeQuery();
		
			if (rs.next()){
				int id =rs.getInt(1);
				String nm=rs.getString(2);
				String eml=rs.getString(3);
				long phn=rs.getLong(4);
				System.out.println(id +"\t" + nm + "\t" + eml + "\t" + phn);
			
				System.out.println("record selected successfully");
			}
			else
				System.out.println("no record found");
		}catch (Exception  e){
			e.printStackTrace();
		}finally{
		JDBCUtil.cleanup(rs, ps, con);
		}
		
		
		}
		}
			