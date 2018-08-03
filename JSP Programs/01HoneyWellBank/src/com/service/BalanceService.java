package com.service;

import java.sql.SQLException;

import com.dao.BalanceDAO;
import com.to.BalanceTO;

public class BalanceService {

	public int balance(BalanceTO balanceTO) throws ClassNotFoundException, SQLException{
		BalanceDAO balanceDAO = new BalanceDAO();
		return balanceDAO.balance(balanceTO);
	}
}
