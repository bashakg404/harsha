package com.cgi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cgi.dao.MemberDAO;
import com.cgi.dao.MemberDAOImplementation;
import com.cgi.model.Member;

@WebServlet("/MemberController")
public class MemberController extends HttpServlet {

	private MemberDAO dao;
	private static final long serialVersionUID = 1L;
	public static final String lIST_MEMBER = "/listMember.jsp";
	public static final String INSERT_OR_EDIT = "/Member.jsp";

	public MemberController() {
		dao = new MemberDAOImplementation();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = "";
		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("delete")) {
			forward = lIST_MEMBER;
			int memberId = Integer.parseInt(request.getParameter("memberId"));
			dao.deleteMember(memberId);
			request.setAttribute("members", dao.getAllMembers());
		} else if (action.equalsIgnoreCase("edit")) {
			forward = INSERT_OR_EDIT;
			int memberId = Integer.parseInt(request.getParameter("memberId"));
			Member member = dao.getMemberById(memberId);
			request.setAttribute("member", member);
		} else if (action.equalsIgnoreCase("insert")) {
			forward = INSERT_OR_EDIT;
		} else {
			forward = lIST_MEMBER;
			request.setAttribute("members", dao.getAllMembers());
		}
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Member member = new Member();
		member.setMemberName(request.getParameter("memberName"));
		member.setLocation(request.getParameter("location"));
		member.setExpr(Integer.parseInt(request.getParameter("expr")));
		String memberId = request.getParameter("memberId");

		if (memberId == null || memberId.isEmpty())
			dao.addMember(member);
		else {
			member.setMemberId(Integer.parseInt(memberId));
			dao.addMember(member);
		}
		RequestDispatcher view = request.getRequestDispatcher(lIST_MEMBER);
		request.setAttribute("members", dao.getAllMembers());
		view.forward(request, response);
	}
}
