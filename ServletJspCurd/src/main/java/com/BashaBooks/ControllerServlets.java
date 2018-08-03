//http://www.codejava.net/coding/jsp-servlet-jdbc-mysql-create-read-update-delete-crud-example
package com.BashaBooks;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 */

public class ControllerServlets extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BookDAO bookDAO;
 
    public void init() {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
 
        bookDAO = new BookDAO(jdbcURL, jdbcUsername, jdbcPassword);
        System.out.println("Init method");
 
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
 
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        //String action =request.getContextPath()+request.getServletPath();
   System.out.println("Entering Controllerservlet");
        try {
        	/*if(action.equals("/ServletJspCurd/new")) {
        		showNewForm(request, response);
        	
        		}else {
        		listBook(request, response);
        		}
        	
        	if(action.equals("/ServletJspCurd/edit")) {
        		showEditForm(request, response);
        	
        		}else {
        		listBook(request, response);
        		}
        	if(action.equals("/ServletJspCurd/insert")) {
        		insertBook(request, response);
        	
        		}else {
        		listBook(request, response);
        		}
        	if(action.equals("/ServletJspCurd/update")) {
        		updateBook(request, response);
        	
        		}else {
        		listBook(request, response);
        		}
        	if(action.equals("/ServletJspCurd/delete")) {
        		deleteBook(request, response);
        	
        		}else {
        		listBook(request, response);
        		}
        		}catch(SQLException ex){
        			  throw new ServletException(ex);
        		}}
        		*/
        		
        	switch (action) {
            case "/new":
            	showNewForm(request, response);
                System.out.println("new data entered");
               break;
            case "/insert":
                insertBook(request, response);
                System.out.println("new data inserted");
                break;
            case "/delete":
                deleteBook(request, response);
                System.out.println("data deleted");
                break;
            case "/edit":
                showEditForm(request, response);
                System.out.println("date edited");
                break;
            case "/update":
                updateBook(request, response);
                System.out.println("data updated");
                break;
            default:
                listBook(request, response);
                break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
 
    private void listBook(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Book> listBook = bookDAO.listAllBooks();
        request.setAttribute("listBook", listBook);
        RequestDispatcher dispatcher = request.getRequestDispatcher("BookList.jsp");
        dispatcher.forward(request, response);
    }
 
    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	System.out.println("Start adding new");
        RequestDispatcher dispatcher = request.getRequestDispatcher("BookForm.jsp");
        System.out.println("Data added");
        dispatcher.forward(request, response);
    }
 
    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
    	System.out.println("start editing");
        int id = Integer.parseInt(request.getParameter("id"));
        Book existingBook = bookDAO.getBook(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("BookForm.jsp");
        request.setAttribute("book", existingBook);
        dispatcher.forward(request, response);
 
    }
 
    private void insertBook(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
    	System.out.println("start inserting data");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        float price = Float.parseFloat(request.getParameter("price"));
 
        Book newBook = new Book(title, author, price);
        bookDAO.insertBook(newBook);
        response.sendRedirect("list");
    }
 
    private void updateBook(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
    	System.out.println("start updating");
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        float price = Float.parseFloat(request.getParameter("price"));
 
        Book book = new Book(id, title, author, price);
        bookDAO.updateBook(book);
        response.sendRedirect("list");
    }
 
    private void deleteBook(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
    	System.out.println("start deleting");
        int id = Integer.parseInt(request.getParameter("id"));
 
        Book book = new Book(id);
        bookDAO.deleteBook(book);
        response.sendRedirect("list");
 
    }
}