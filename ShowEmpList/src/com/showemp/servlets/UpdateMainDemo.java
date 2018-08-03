package com.showemp.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement st=null; 
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			connection=Util.getMYSQLConnection();
			String qry=null;
			qry="UPDATE EMPLOYEE SET ENAME='Avinash K' WHERE EID='2'";
			st=connection.createStatement();
			ps=connection.prepareStatement(qry);
			boolean b1=ps.execute(qry);
			System.out.println("===================  "+b1);
			if(b1){
				rs=st.getResultSet();
				if(rs.next()){
					do{
						int eid=rs.getInt(1);
						String ename=rs.getString(2);
						String location=rs.getString(3);
						String designation=rs.getString(4);
						System.out.println(eid+ "\t" + ename + "\t" + location + "\t" + designation);
								
					}while(rs.next());
					
				}
			}else{
				int x=st.getUpdateCount();
				System.out.println("Result:" + x);
			}
			
			}catch (Exception e){
				e.printStackTrace();
				
		}finally{
			Util.cleanup(rs, ps, connection);
			
		}
	}

}
