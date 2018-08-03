package com.showemp.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class DatabaseAccess extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// JDBC driver name and database URL
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost:3306";

		System.out.println("++++++++++++++++++");
		
		Statement stmt = null;
		Connection conn = null;
		

		// Database credentials
		final String USER = "root";
		final String PASS = "root";

		System.out.println("===============");

		// Set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Database Result";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n"
				+ "<body bgcolor=\"#f0f0f0\">\n" + "<h1 align=\"center\">" + title + "</h1>\n");

		System.out.println("--------------");

		try {
			// Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Open a connection
			 conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// Execute SQL query
			stmt = conn.createStatement();
			System.out.println("[]]]]]]]][]][");
			String sql;
			sql = "SELECT EID, ENAME, LOCATION, DESIGNATION FROM Employee";
			ResultSet rs = stmt.executeQuery(sql);

			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int empid = rs.getInt("eid");
				String empname = rs.getString("ename");
				String location = rs.getString("location");
				String designation = rs.getString("designation");

				// Display values
				out.println("EID: " + designation + "<br>");
				out.println(", ENAME: " + empname + "<br>");
				out.println(", LOCATION: " + location + "<br>");
				out.println(", DESIGNATION: " + designation + "<br>");
			}
			out.println("</body></html>");

			// Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
	}
}