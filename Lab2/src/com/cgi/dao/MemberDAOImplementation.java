package com.cgi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cgi.model.Member;
import com.cgi.util.DBUtil;

public class MemberDAOImplementation implements MemberDAO {

	private Connection conn;

	public MemberDAOImplementation() {
		conn = DBUtil.getConnection();
	}

	@Override
	public void addMember(Member members) {
		try {
			String query = "INSERT INTO MEMBER (member name, location, exp) VALUES (?,?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, members.getMemberName());
			preparedStatement.setString(2, members.getLocation());
			preparedStatement.setInt(3, members.getExpr());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteMember(int memberId) {
		try {
			String query = "DELETE FROM MEMBER WHERE MEMBERID=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, memberId);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateMember(Member members) {
		try {
			String query = "UPDATE MEMBER SET NAME=?, LOCATION=?, EXPR=? WHERE MEMBERID=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, members.getMemberName());
			preparedStatement.setString(2, members.getLocation());
			preparedStatement.setInt(3, members.getExpr());
			preparedStatement.setInt(4, members.getMemberId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Member> getAllMembers() {
		List<Member> members = new ArrayList<Member>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM MEMBER");
			while (resultSet.next()) {
				Member member = new Member();
				member.setMemberId(resultSet.getInt("MEMBERID"));
				member.setMemberName(resultSet.getString("NAME"));
				member.setLocation(resultSet.getString("LOCATION"));
				member.setExpr(resultSet.getInt("EXPR"));
				members.add(member);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return members;
	}

	public Member getMemberById(int memberId) {
		Member member = new Member();
		try {
			String query = "SELECT * FROM MEMBER WHERE MEMBERID=?";
			System.out.println("Member DAO implementation");
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, memberId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				member.setMemberId(resultSet.getInt("MEMBERID"));
				member.setMemberName(resultSet.getString("NAME"));
				member.setLocation(resultSet.getString("LOCATION"));
				member.setExpr(resultSet.getInt("EXPR"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return member;
	}

}
