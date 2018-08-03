package com.service;

import java.sql.SQLException;

import com.dao.NewCustomerDAO;
import com.to.NewCustomerTO;

public class NewCustomerService {

      public int createUser(NewCustomerTO newCustomerTO) throws ClassNotFoundException, SQLException{
    	  NewCustomerDAO newCustomerDAO = new NewCustomerDAO();
    	  return newCustomerDAO.createUser(newCustomerTO);
      }
      
}
