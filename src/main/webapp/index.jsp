<%@ page language="java" pageEncoding="utf-8" %>
<html>
<body>
<h2>home</h2>
<%response.sendRedirect("/user/login");%>
<a href="<%request.getContextPath();%>/user/login">login</a>
<a href="<%request.getContextPath();%>/user/register">register</a>
</body>
</html>
