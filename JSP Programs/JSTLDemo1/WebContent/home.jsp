<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html><body><h1>Hello Guys No Gaurantee</h1>
<c:set var="DOMNAME" value="${param.domainName }" scope="session"/>
<c:choose>
<c:when test="${DOMNAME eq 'java' }">
<c:redirect url="java.jsp">
<c:param name="EMNM" value="${param.employeeName }"/>
<c:param name="DMNM" value="${param.domainName }"/>
</c:redirect>
</c:when>

<c:when test="${DOMNAME eq 'jdbc' }">
<c:redirect url="jdbc.jsp">
<c:param name="EMNM" value="${param.employeeName }"/>
<c:param name="DMNM" value="${param.domainName }"/>
</c:redirect>
</c:when>

<c:otherwise>
<c:redirect url="other.jsp">
<c:param name="EMNM" value="${param.employeeName }"/>
<c:param name="DMNM" value="${param.domainName }"/>
</c:redirect>
</c:otherwise>
</c:choose>
</body></html>