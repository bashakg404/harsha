
package com.cgiindia.jdbc;
import java.sql.*;
import com.cgiindia.to.UserTO;
import com.cgiindia.util.JDBCUtil;
public class UserService {
public int verifyUser(String username, String password){
	int x=0; Connection connection=null;
	PreparedStatement preparedstatement=null; ResultSet resultset=null;
	try{
		connection=JDBCUtil.getMySQLConnection();
		String sql="SELECT * FROM CGIUSERS WHERE USERNAME=? AND PASSWORD=?";
		preparedstatement=connection.prepareStatement(sql);
		preparedstatement.setString(1, username);
		preparedstatement.setString(2, password);
		resultset=preparedstatement.executeQuery();
		if (resultset.next())
			x=1;
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{
		JDBCUtil.cleanup(resultset, preparedstatement, connection);
	}
	return x;
}

public int RegisterUser(UserTO userto){
	int x=0; Connection connection =null;
	PreparedStatement preparedstatement=null;
	try{
		connection=JDBCUtil.getMySQLConnection();
	String sql="INSERT INTO CGIUSERS VALUES(?,?,?,?,?,?)";
	preparedstatement=connection.prepareStatement(sql);
	preparedstatement.setInt(1, userto.getUserId());
	preparedstatement.setString(2, userto.getFname());
	preparedstatement.setString(3, userto.getEmail());
	preparedstatement.setLong(4, userto.getPhone());
	preparedstatement.setString(5, userto.getUsername());
	preparedstatement.setString(6, userto.getPassword());
	x=preparedstatement.executeUpdate();
}catch(Exception e){
	e.printStackTrace();}
	finally{
		JDBCUtil.cleanup(preparedstatement, connection);
}
	return x;
}
public String getPasswordByEmail(String email){
	
	String password=null;
	Connection connection=null;
	PreparedStatement preparedstatement=null;
	ResultSet resultset=null;
	try{
		connection=JDBCUtil.getMySQLConnection();
		String sql="SELECT PASSWORD FROMCGIUESRS WHERE EMAIL=?";
		preparedstatement=connection.prepareStatement(sql);
		preparedstatement.setString(1, email);
		resultset=preparedstatement.executeQuery();
		if(resultset.next())
			password=resultset.getString(1);
		
	}catch(Exception e){
		e.printStackTrace();
		
	}finally{
		JDBCUtil.cleanup(resultset, preparedstatement, connection);}
	return password;
}
public int getNextUserId(){
	int x=0; Connection connection=null;
	PreparedStatement preparedstatement=null; ResultSet resultset=null;
	try{
		connection=JDBCUtil.getMySQLConnection();
		String sql="SELECT MAX(userID) FROM CGIUSERS";
				preparedstatement=connection.prepareStatement(sql);
		resultset=preparedstatement.executeQuery();
		if(resultset.next()){
			x=resultset.getInt(1);
			x=x+1;
			
		}
}catch(Exception e){
	e.printStackTrace();
}finally{
	JDBCUtil.cleanup(resultset, preparedstatement, connection);
}
	return x;
	}
}

