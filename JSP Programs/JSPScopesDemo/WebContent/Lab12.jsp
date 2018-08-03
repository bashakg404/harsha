<html>
<body>
<h1>
<br/>1)Storing Attribute in Context Scope
<br/>A)Using PageContext Object
<%
pageContext.setAttribute("MSG1", "ServletContext---->Message 1", PageContext.APPLICATION_SCOPE);
%>
<br/>B)Using ServletContext object
<%
application.setAttribute("MSG2", "ServletContext--->Message2");
%>
<br/>2)Storing Attribute in Session Scope
<br/>A)Using PageContext Object
<%
pageContext.setAttribute("MSG3", "HttpSession-->Message3", PageContext.SESSION_SCOPE);
%>
<br/>B)Using HttpSession object
<%
session.setAttribute("MSG4", "HttpSession-->Message4");
%>


br/>1)Storing Attribute in Request Scope
<br/>A)Using PageContext Object
<%
pageContext.setAttribute("MSG5", "ServletContext---->Message 5", PageContext.REQUEST_SCOPE);
%>
<br/>B)Using HttpSession object
<%
request.setAttribute("MSG6", "ServletContext--->Message 6");
%>


br/>1)Storing Attribute in Page Scope
<br/>A)Using PageContext Object
<%
pageContext.setAttribute("MSG7", "ServletContext---->Message 7", PageContext.PAGE_SCOPE);

pageContext.setAttribute("MSG8", "ServletContext--->Message 8");
%>

<hr/>
<br/><%=pageContext.getAttribute("MSG1", PageContext.APPLICATION_SCOPE) %>
<br/><%=pageContext.getAttribute("MSG2", PageContext.APPLICATION_SCOPE) %>
<br/><%=pageContext.getAttribute("MSG3", PageContext.SESSION_SCOPE) %>
<br/><%=pageContext.getAttribute("MSG4", PageContext.SESSION_SCOPE) %>
<br/><%=pageContext.getAttribute("MSG5", PageContext.REQUEST_SCOPE) %>
<br/><%=pageContext.getAttribute("MSG6", PageContext.REQUEST_SCOPE) %>
<br/><%=pageContext.getAttribute("MSG7", PageContext.PAGE_SCOPE) %>
<br/><%=pageContext.getAttribute("MSG8") %>


</h1>
</body>
</html>