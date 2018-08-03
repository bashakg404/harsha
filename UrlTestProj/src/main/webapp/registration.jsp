<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.sql.*" %>
<%
   String username=request.getParameter("username");
   String password=request.getParameter("password");
   String email=request.getParameter("email");
   Class.forName("com.mysql.jdbc.Driver");
   Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
   Statement statement=connection.createStatement();
   ResultSet resultset;
   int i=statement.executeUpdate("insert into members(username, password, email) values ('" + username + "', '" + password + " ', '" + email + " ')");
   if(i>0){
	 //session.setAttribute("username", username);
	   response.sendRedirect("welcome.jsp");
	  //out.print("Registration Successfull!!" + "<a href='index.jsp'>Go to Login </a>");
   }else {
	   response.sendRedirect("index.jsp");
   }
   %>
   