package com.controller;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.BalanceService;
import com.service.DepositService;
import com.service.MinistatementService;
import com.service.NewCustomerService;
import com.service.SignInService;
import com.service.TransferService;
import com.service.WithdrawService;
import com.to.BalanceTO;
import com.to.DepositResultTO;
import com.to.MinistatementTO;
import com.to.NewCustomerTO;
import com.to.SigninTO;
import com.to.TransferResultTO;
import com.to.WithdrawTO;
import com.util.DBUtil;

/**
 * @author ANILKUMAR
 *
 */
public class trial extends HttpServlet {
	
	private static final Object MinistatementTO = null;

	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String servletPath = req.getServletPath();
		HttpSession httpSession = null;
//		String name = null; if u use like this u ll get acc no. as Zero in TO
//		int intAccNumb = 0;
		
	//1.SIGNUP.DO
		if("/signup.do".equalsIgnoreCase(servletPath))
		{
			System.out.println("inside signup.do: "+ servletPath);
			RequestDispatcher rd = req.getRequestDispatcher("./jsp/signup.jsp");
			rd.forward(req, res);
		}
	//2.SIGNIN.DO	
		else if("/signin.do".equalsIgnoreCase(servletPath)){
			System.out.println("inside signin.do: "+ servletPath);
			RequestDispatcher rd = req.getRequestDispatcher("./jsp/signin.jsp");
			rd.forward(req, res);
		}
	//3.NEWCUST.DO
		else if("/newcust.do".equalsIgnoreCase(servletPath)){
			System.out.println("inside newcust.do: "+ servletPath);
			String strname = req.getParameter("name");
			String strusername = req.getParameter("username");
			String strpassword = req.getParameter("password");
			String stramount = req.getParameter("amount");
			int intAmount = Integer.parseInt(stramount);
			String stremail = req.getParameter("emailid");
			java.util.Date date = new java.util.Date();
		//	Timestamp currentdate = new Timestamp(date.getTime());USED THIS IN DAO SERVICE LAYER
			NewCustomerTO newCustomerTO = new NewCustomerTO();
			newCustomerTO.setName(strname);
			newCustomerTO.setUsername(strusername);
			newCustomerTO.setPassword(strpassword);
			newCustomerTO.setAmount(intAmount);
			newCustomerTO.setEmail(stremail);
     		newCustomerTO.setDate(date);
			
     		NewCustomerService newCustomerService = new NewCustomerService();
     		try {
     			int createUser = newCustomerService.createUser(newCustomerTO);
     			if(createUser == 1)
     			{	
     				req.setAttribute("NAME", newCustomerTO.getName());
     				req.setAttribute("ACCOUNTNUMBER", newCustomerTO.getAccountnumber());
     				RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/newcust.jsp");
     				requestDispatcher.forward(req, res);
     			}
     			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	//4.FINALSIGNIN.DO	RRRRRRRR &&&&&&&&&&&&& DDDDDDDDDDDDDDDDDDDDDDD
		else if("/finalsignin.do".equalsIgnoreCase(servletPath)){
			System.out.println("inside finalsignin.do"+ servletPath);
			
			String userName = req.getParameter("username");
			String password = req.getParameter("password");
			
			String strHttpSessionLogoutid = req.getParameter("JSESSIONID");
			String strHttpSessionSigninid = httpSession.getId();
			SigninTO signinTO = new SigninTO();
		//	boolean sesid = false;
			boolean flag = false;
			try {
			if(strHttpSessionSigninid.equalsIgnoreCase(strHttpSessionLogoutid))
			{
			//	sesid = true;
				flag = true;
			}
			
			else
			{
	//		SigninTO signinTO = new SigninTO();
			signinTO.setUsername(userName);
			signinTO.setPassword(password);
			SignInService signInService = new SignInService();
		//	boolean flag = false;
		//	flag = false;
			flag = signInService.signin(signinTO);
			System.out.println("value of flag... : "+flag);
					if(flag == true){
				//	req.setAttribute("NAME", signinTO.getName());
				//putting these things in session, bcs u need these things for further steps like deposit n all	
					//DONT follow above line its HOGE.. bcs in  TO u get default values
				//	req.setAttribute("ACCOUNTNUMBER", signinTO.getAccountnumber());
			/*		httpSession = req.getSession();
					httpSession.setAttribute("NAME", signinTO.getName());
					Object attribute = httpSession.getAttribute("NAME");
					httpSession.setAttribute("ACCOUNTNUMBER", signinTO.getAccountnumber());
					
					String name = httpSession.getAttribute("NAME").toString();
					String accnumb = httpSession.getAttribute("ACCOUNTNUMBER").toString();
					int intAccNumb = Integer.parseInt(accnumb);
					
					System.out.println("forwarding from controller to signinsuccess.jsp");
					RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/signinsuccess.jsp");
					requestDispatcher.forward(req, res);
			*/		flag = true;
					}
					/*else
					{
					System.out.println("forwarding from controller to signinfailure.jsp");
					RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/signinfailure.jsp");
					requestDispatcher.forward(req, res);
					}*/
		}
	//	if(sesid == true){
		if(flag == true){
			//user sign in page
//			req.setAttribute("NAME", signinTO.getName());
			//putting these things in session, bcs u need these things for further steps like deposit n all	
				//DONT follow above line its HOGE.. bcs in  TO u get default values
			//	req.setAttribute("ACCOUNTNUMBER", signinTO.getAccountnumber());
				httpSession = req.getSession();
				httpSession.setAttribute("NAME", signinTO.getName());
				Object attribute = httpSession.getAttribute("NAME");
				httpSession.setAttribute("ACCOUNTNUMBER", signinTO.getAccountnumber());
				
				String name = httpSession.getAttribute("NAME").toString();
				String accnumb = httpSession.getAttribute("ACCOUNTNUMBER").toString();
				int intAccNumb = Integer.parseInt(accnumb);
				
				System.out.println("forwarding from controller to signinsuccess.jsp");
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/signinsuccess.jsp");
				requestDispatcher.forward(req, res);
		}
		else{
			//enter valid credentials page
			System.out.println("forwarding from controller to signinfailure.jsp");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/signinfailure.jsp");
			requestDispatcher.forward(req, res);
			
		}
	} 
	catch (ClassNotFoundException e) 
	{
				e.printStackTrace();
	}
	catch (SQLException e)
	{
				e.printStackTrace();
	}
}
	//5.DEPOSIT.DO	
		else if ("/deposit.do".equalsIgnoreCase(servletPath)) {
			System.out.println("inside deposit.do ");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/deposit.jsp");
			requestDispatcher.forward(req, res);
		}
		
	//6.DEPOSITRESULT.DO 
		else if ("/depositresult.do".equalsIgnoreCase(servletPath)) {
			System.out.println("inside depositresult.do ");
			String strDepositeamount = req.getParameter("depositeamount");
			int intDepositeamount = Integer.parseInt(strDepositeamount);
			System.out.println("intDepositeamount = "+intDepositeamount);
			
			DepositResultTO depositResultTO = new DepositResultTO();
			depositResultTO.setDepositeamount(intDepositeamount);
			httpSession = req.getSession();
			//session and httpsession nothing matters,concentrates mainly on attribute "NAME"
		//	Object name = httpSession.getAttribute("NAME");convrt toString() els not able to convrt
		//	These were not needed after declaring these variables as locl varbls
		    String name = httpSession.getAttribute("NAME").toString();
			String accnumb = httpSession.getAttribute("ACCOUNTNUMBER").toString();
			int intAccNumb = Integer.parseInt(accnumb);
			depositResultTO.setName(name);
			depositResultTO.setAccnumber(intAccNumb);
			
			DepositService depositService = new DepositService();
			try {
				int deposit = depositService.deposit(depositResultTO);
				if(deposit==1){
					httpSession.setAttribute("OLDBALANCE", depositResultTO.getOldbalance());
					httpSession.setAttribute("UPDATEDBALANCE", depositResultTO.getUpdatedbalance());
					RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/depositsuccess.jsp");
					requestDispatcher.forward(req, res);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		//7.TRANSFER.DO
		else if(servletPath.equalsIgnoreCase("/transfer.do")){
			System.out.println("inside transfer.do :"+servletPath);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/transfer.jsp");
			requestDispatcher.forward(req, res);
		}
		
		//8.TRANSFERRESULT.DO
		else if(servletPath.equalsIgnoreCase("/transferresult.do")){
			System.out.println("inside transferresult.do@@@@@@@@@@@@@@ :"+servletPath);
			String strDestinationaccountnumber = req.getParameter("destinationaccountnumber");
			int intDestinationaccountnumber = Integer.valueOf(strDestinationaccountnumber);
			String strTrasferAmount = req.getParameter("transferamount");
			int intTrasferAmount = Integer.valueOf(strTrasferAmount);
			
			System.out.println(intDestinationaccountnumber);
			System.out.println(intTrasferAmount);
			
			TransferResultTO transferResultTO = new TransferResultTO();
			transferResultTO.setDestinationaccountnumber(intDestinationaccountnumber);
			transferResultTO.setTransferamount(intTrasferAmount);
			httpSession = req.getSession();//VVVVVVVV imp imP imp U misd to writ this
			System.out.println("BLUNDER BLUNDER BLUNDER>>>>>>>>>>>>>>>>>");
			String name = httpSession.getAttribute("NAME").toString();
			System.out.println(httpSession.getAttribute("NAME").toString());
			String accnumb = httpSession.getAttribute("ACCOUNTNUMBER").toString();
			int intAccNumb = Integer.parseInt(accnumb);
			transferResultTO.setName(name);
			transferResultTO.setAccnumber(intAccNumb);
			
			TransferService transferService = new TransferService();
			try {
				int isTransferSucceed = transferService.transfer(transferResultTO);
				System.out.println(isTransferSucceed);
				System.out.println("AMOUNT transferrd succcssfly in contrlr lyr@@@@$$$$$%%%%%%%%%");
				if(isTransferSucceed==1){
					RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/error.jsp");
					requestDispatcher.forward(req, res);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e){
				System.out.println("**********************");
				String message = e.getMessage();
				System.out.println(e.getMessage());
				req.setAttribute("MSG", message);
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/error.jsp");
				requestDispatcher.forward(req, res);
			}
		}
		
		//09.WITHDRAW.DO	
		else if(servletPath.equalsIgnoreCase("/withdraw.do")){
			System.out.println("inside withdraw.do "+servletPath);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/withdraw.jsp");
			requestDispatcher.forward(req, res);
		}
		
		//10.WITHDRAWRESULT.DO	
		else if(servletPath.equalsIgnoreCase("/withdrawresult.do")){
			String strWithdrawamount = req.getParameter("withdrawamount");
			int intWithdrawamount = Integer.parseInt(strWithdrawamount);
			System.out.println("intDepositeamount = "+intWithdrawamount);
			httpSession = req.getSession();//VVVVVVVV imp imP imp U misd to writ this
			String name = httpSession.getAttribute("NAME").toString();
			System.out.println(httpSession.getAttribute("NAME").toString());
			String accnumb = httpSession.getAttribute("ACCOUNTNUMBER").toString();
			int intAccNumb = Integer.parseInt(accnumb);
			
			WithdrawTO withdrawTO = new WithdrawTO();
			withdrawTO.setName(name);
			withdrawTO.setAccnumber(intAccNumb);
			withdrawTO.setWithdrawamount(intWithdrawamount);
			
			WithdrawService withdrawService = new WithdrawService();
			try {
				int withdraw = withdrawService.withdraw(withdrawTO);
				System.out.println(withdraw);
				if(withdraw==1){
					RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/withdrawsuccess.jsp");
					requestDispatcher.forward(req, res);
				}
			}
			catch (Exception e) {
			
				String mes = e.getMessage();
				System.out.println("msg  :"+mes);
				req.setAttribute("MSG", mes);
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/error.jsp");
				requestDispatcher.forward(req, res);
			}
		}
		
		//11.BALANCERESULT.DO	
		else if(servletPath.equalsIgnoreCase("/balanceresult.do")){
		System.out.println("inside /balanceresult.do "+servletPath);
		httpSession = req.getSession();
		String name = httpSession.getAttribute("NAME").toString();
		System.out.println(httpSession.getAttribute("NAME").toString());
		String accnumb = httpSession.getAttribute("ACCOUNTNUMBER").toString();
		int intAccNumb = Integer.parseInt(accnumb);
		
		BalanceTO balanceTO = new BalanceTO();
		balanceTO.setName(name);
		balanceTO.setAccnumb(intAccNumb);
		
		BalanceService balanceService = new BalanceService();
		try {
			int balance = balanceService.balance(balanceTO);
			req.setAttribute("BALANCE", balance);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/checkbalance.jsp");
			requestDispatcher.forward(req, res);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
		
		//12.MINISTATEMENT.DO
		else if(servletPath.equalsIgnoreCase("/ministatement.do")){
			System.out.println("inside /ministatement.do: "+servletPath);
			httpSession = req.getSession();
			String name = httpSession.getAttribute("NAME").toString();
			System.out.println(httpSession.getAttribute("NAME").toString());
			String accnumb = httpSession.getAttribute("ACCOUNTNUMBER").toString();
			int intAccNumb = Integer.parseInt(accnumb);
			
			MinistatementTO ministatementTO = new MinistatementTO();
			ministatementTO.setName(name);
			ministatementTO.setAccnumb(intAccNumb);
			
			MinistatementService ministatementService = new MinistatementService();
			try {
				ArrayList ministvalues = ministatementService.statement(ministatementTO);
				System.out.println("aaa"+ministvalues);
				
				Object object = ministvalues.get(1);
				MinistatementTO min=(MinistatementTO)object;
				System.out.println(""+min.getTransactionId());
				System.out.println("values got needed for mini statement...");
			  /*req.setAttribute("TRID", ministatementTO.getTransactionId() );
				req.setAttribute("AMOUNT",ministatementTO.getAmount());
				req.setAttribute("UTILDATE", ministatementTO.getDate());
				req.setAttribute("TRTYPE", ministatementTO.getTransactiontype());
				req.setAttribute("DESC", ministatementTO.getDesc());*/
				req.setAttribute("LIST", ministvalues);
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/ministatement.jsp");
				requestDispatcher.forward(req, res);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		//13.LOGOUT.DO	
		else if(servletPath.equalsIgnoreCase("/logout.do")){
				System.out.println("inside logout.do");	
				httpSession = req.getSession();
				httpSession.invalidate();
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("./jsp/signin.jsp");
				requestDispatcher.forward(req, res);
		}
	}
}

