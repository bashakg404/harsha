package com.service;

import java.sql.SQLException;

import com.dao.WithdrawDAO;
import com.to.WithdrawTO;

public class WithdrawService {

	public int withdraw(WithdrawTO withdrawTO) throws Exception {
		WithdrawDAO withdrawDAO = new WithdrawDAO();
		return withdrawDAO.withdraw(withdrawTO);
	}
}
