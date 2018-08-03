package com.service;

import java.sql.SQLException;

import com.dao.TransferDAO;
import com.to.TransferResultTO;

public class TransferService {
	public int transfer(TransferResultTO transferResultTO) throws Exception{
		TransferDAO transferDAO = new TransferDAO();
		return transferDAO.transfer(transferResultTO);
	}
}
