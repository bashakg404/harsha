package com.cgi.dao;

import java.util.List;

import com.cgi.model.Member;

public interface MemberDAO {
	public void addMember(Member members);

	public void deleteMember(int memberId);

	public void updateMember(Member member);

	public List<Member> getAllMembers();

	public Member getMemberById(int memberId);
}
