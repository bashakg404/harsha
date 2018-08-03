package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.MiniStatementDAO;
import com.to.MinistatementTO;

public class MinistatementService {
	
	public ArrayList statement(MinistatementTO ministatementTO ) throws ClassNotFoundException, SQLException{
		MiniStatementDAO miniStatementDAO = new MiniStatementDAO();
		return miniStatementDAO.statement(ministatementTO);
	}
}
