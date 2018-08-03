package com.service;

import java.sql.SQLException;

import com.dao.DepositDAO;
import com.to.DepositResultTO;

public class DepositService {

	public int deposit(DepositResultTO depositResultTO) throws ClassNotFoundException, SQLException{
		DepositDAO depositDAO = new DepositDAO();
		return depositDAO.deposit(depositResultTO);
	}
}
