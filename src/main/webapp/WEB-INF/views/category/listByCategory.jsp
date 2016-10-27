<%--
  Created by IntelliJ IDEA.
  User: mtf81
  Date: 2016/10/24
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>category-</title>
	<link href="<%=request.getContextPath()%>/static/bootstrap/css/bootstrap.css" rel="stylesheet">

</head>
<body>
<div class="container">
	<div class="header">
		<ul class="nav nav-pills pull-right" role="tablist">
			<li role="presentation" ><a href="<%=request.getContextPath()%>/article/list">Article</a></li>
			<li role="presentation" class="active"><a href="<%=request.getContextPath()%>/category/list">Category</a></li>
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">${user.loginName} <span class="caret"></span></a>
				<ul class="dropdown-menu" role="menu">
					<li><a href="<%=request.getContextPath()%>/user/update">Account</a></li>
					<li><a href="<%=request.getContextPath()%>/user/logout">Logout</a></li>
				</ul>
			</li>

		</ul>
		<h3 class="text-muted">${category.cName}</h3>

	</div>
	<hr>
</div>
<div class="container">
	<div class="panel panel-default">
		<div class="panel-body">
			<legend>当前分类下共${count}篇文章</legend>
			<c:forEach items="${articles}" var="article">
				<div class="list-group">
					<a href="<%=request.getContextPath()%>/article/${article.id}" class="list-group-item">
						<h4 class="list-group-item-heading">${article.title}</h4>
						<p class="list-group-item-text">${article.createDate}</p>
					</a>
				</div>
			</c:forEach>
		</div>
	</div>


</div>
</body>
<script src="<%=request.getContextPath()%>/static/jquery/1.11.3/jquery.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/static/bootstrap/js/bootstrap.js" ></script>
</html>

