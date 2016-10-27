<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/19
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dariy diary</title>
    <link href="<%=request.getContextPath()%>/static/bootstrap/css/bootstrap.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right" role="tablist">
            <li role="presentation" class="active"><a href="<%=request.getContextPath()%>/article/list">Article</a></li>
            <li role="presentation"><a href="<%=request.getContextPath()%>/category/list">Category</a></li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">${user.loginName} <span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                    <li><a href="#">Account</a></li>
                    <li><a href="#">Logout</a></li>
                </ul>
            </li>

        </ul>
        <h3 class="text-muted">Welcome </h3>

    </div>
    <hr>
</div>
<div class="container">
</div>
</body>
<script src="<%=request.getContextPath()%>/static/jquery/1.11.3/jquery.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/static/bootstrap/js/bootstrap.js" ></script>
</html>
