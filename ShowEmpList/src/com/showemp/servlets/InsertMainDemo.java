package com.showemp.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;



public class InsertMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Add one employee to database EMPLOYEE
		Connection connection=null;
		Statement st=null; 
		PreparedStatement preparedStatement=null;
		try{
			connection=Util.getMYSQLConnection();
			int eid=101;
			String ename="sand";
			String location= "PP";
			String designation="ASC";
			String qry="insert into employee values (?,?,?,?)";
			System.out.println(qry);
			preparedStatement=connection.prepareStatement(qry);
			
			preparedStatement.setInt(1, eid);
			preparedStatement.setString(2, ename);
			preparedStatement.setString(3, location);
			preparedStatement.setString(4, designation);

			int x=preparedStatement.executeUpdate();
			if (x==1)
				System.out.println("record inserted successfully");
			else
				System.out.println("no record found");
		}catch (Exception  e){
			e.printStackTrace();
		}finally{
		Util.cleanup(st,connection);
		}
		
		
		}
		
			
	}

