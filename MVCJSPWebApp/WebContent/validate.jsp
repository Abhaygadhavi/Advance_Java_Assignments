<%-- Controller JSP --%>

<jsp:useBean id="ob" class="com.phoenix.web.models.LoginBean" scope="request"></jsp:useBean>

<jsp:setProperty property="username" name="ob"/>
<jsp:setProperty property="password" name="ob"/>

<%	if(ob.isValid()){ %>
		<jsp:forward page="/welcome.jsp">
			<jsp:param value="core java" name="b1"/>
			<jsp:param value="C++" name="b2"/>
		</jsp:forward>
<%  } else{ %>	
		<h2 style="color:red;">Invalid login </h2>	
		<jsp:include page="login.html"/>
		
<%  }   %>
