<jsp:useBean id="ob" class="com.phoenix.web.models.LoginBean" scope="request"></jsp:useBean>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
</head>
<body bgcolor="yellow">
	<%@ include file="header.html" %>
	<%@ include file="footer.html" %>
	
	<h3>Dear ,<b style="color:green;"> <jsp:getProperty property="username" name="ob"/></b> this is Welcome page</h3>		
<%
	//retrievimg the username from request
	String username=request.getParameter("username");
	//storing the username in the session
	session.setAttribute("user", username);
	//setting the session timeout period
	session.setMaxInactiveInterval(10);
	//encoding the product URl
	String encode=response.encodeURL("products.jsp");
%>
	<p>Session timeout: <%=session.getMaxInactiveInterval() %></p>
	<p>To enjoy shopping <a href=<%= encode %>>Click here</a></p>

</body>
</html>