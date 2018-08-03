<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
<title>Add New Member</title>
</head>
<body>
    <form action="MemberController.do" method="post">
        <fieldset>
            <div>
                <label for="memberId">Member ID</label> <input type="text"
                    name="memberId" value="<c:out value="${member.memberId}" />"
                    readonly="readonly" placeholder="Member ID" />
            </div>
            <div>
                <label for="Name">Name</label> <input type="text"
                    name="memberName" value="<c:out value="${member.memberName}" />"
                    placeholder="Name" />
            </div>
           
            <div>
                <label for="location">Location</label> <input type="text" name="location"
                    value="<c:out value="${member.location}" />" placeholder="Location" />
            </div>
            <div>
                <label for="year">Year</label> <input type="text" name="expr"
                    value="<c:out value="${member.expr}" />" placeholder="expr" />
            </div>
            <div>
                <input type="submit" value="Submit" />
            </div>
        </fieldset>
    </form>
</body>
</html>