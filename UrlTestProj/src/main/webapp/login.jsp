<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.sql.*"%>
<%
String username=request.getParameter("username");
String password=request.getParameter("password");
Class.forName("com.mysql.jdbc.Driver");
Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
Statement statement=connection.createStatement();
ResultSet resultset;
resultset=statement.executeQuery("select * from members where username='" +username+"' and password='" +password+"'"); 
 System.out.println("--");
if(resultset.next()){
	session.setAttribute("username", username);
	session.setAttribute("password", password);
	 System.out.println("*********");
	//out.println("Welcome" + username);

	out.println("<a href='logout.jsp'>Log out</a>");
	//response.sendRedirect("success.jsp");
}else{
	out.println("Invalid Password <a href='index.jsp'> Try Again </a>");
}
 

%>