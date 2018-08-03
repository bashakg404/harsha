package com.jlcindia.jdbc;
import java.sql.*;


public class Lab2 {
	public static void main(String as[]){
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("========");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BASHA","root","harsha404");
			System.out.println("*******");
			//String sql="insert into jlcstudents values(100,'Srikumar','Sri@jlc',77867565879)";
			String sql="insert into jlcstudents values(100,'Srikumar','Sri@jlc',77867565879)";
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
			try{
				if(st !=null) st.close();
				if(con !=null)con.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}

}
