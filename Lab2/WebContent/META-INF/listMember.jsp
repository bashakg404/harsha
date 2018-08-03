<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show All Members</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>Member ID</th>
                <th>Name</th>
                <th>Location</th>
                <th>Year</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${members}" var="member">
                <tr>
                    <td><c:out value="${member.memberId}" /></td>
                    <td><c:out value="${member.memberName}" /></td>
                    <td><c:out value="${member.location}" /></td>
                    <td><c:out value="${member.expr}" /></td>
                    <td><a
                        href="MemberController.do?action=edit&memberId=<c:out value="${member.memberId}"/>">Update</a></td>
                    <td><a
                        href="MemberController.do?action=delete&memberId=<c:out value="${member.memberId}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p>
        <a href="MemberController.do?action=insert">Add Member</a>
    </p>
</body>
</html>