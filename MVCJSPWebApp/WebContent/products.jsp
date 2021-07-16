
<jsp:useBean id="ob" class="com.phoenix.web.models.LoginBean" scope="request"></jsp:useBean>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products page</title>
</head>
<body bgcolor="yellow">

	<%@ include file="header.html" %>
	
<%
	HttpSession ss=request.getSession(false);
	if(ss!=null){ %>
		<h3>Hey,<b style="color:green;"> <%=ss.getAttribute("user") %> </b>choose your products</h3>
<%	}
	else{%>
		<h2 style="color:red;">No ,Session here</h2>
<% 	} %>

	<%@ include file="footer.html" %>
	
</body>
</html>