<%--
  Created by IntelliJ IDEA.
  User: rama
  Date: 28/4/20
  Time: 6:09 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  import="org.rama.User"  %>
<html>
<head>
    <title>Success page</title>
</head>
<body>

<h3> Login successful </h3>
<%
  User user = (User) request.getAttribute("user");
%>

Hello <%=user.getUserName()%>

</body>
</html>
