<%--
  Created by IntelliJ IDEA.
  User: mtf81
  Date: 2016/10/25
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>article</title>
	<link href="<%=request.getContextPath()%>/static/bootstrap/css/bootstrap.css" rel="stylesheet">

</head>
<body>
<div class="container">
	<div class="header">
		<ul class="nav nav-pills pull-right" role="tablist">
			<li role="presentation" class="active"><a href="<%=request.getContextPath()%>/article/list">Article</a></li>
			<li role="presentation" ><a href="<%=request.getContextPath()%>/category/list">Category</a></li>
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">${user.loginName} <span class="caret"></span></a>
				<ul class="dropdown-menu" role="menu">
					<li><a href="<%=request.getContextPath()%>/user/update">Account</a></li>
					<li><a href="<%=request.getContextPath()%>/user/logout">Logout</a></li>
				</ul>
			</li>

		</ul>
		<h3 class="text-muted">Article </h3>

	</div>
	<hr>
</div>
<div class="container">
	<div class="panel panel-default">
		<div class="panel-body">
			<legend>
				${article.title}
			</legend>
			${article.content}
		</div>
		<div class="panel-footer">
			<h5>${article.createDate}</h5>
		</div>
		<div>
			<a href="<%=request.getContextPath()%>/article/${article.id}/del" class="btn btn-warning btn-block" >Del</a>
		</div>
	</div>


</div>
</body>
<script src="<%=request.getContextPath()%>/static/jquery/1.11.3/jquery.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/static/bootstrap/js/bootstrap.js" ></script>
</html>