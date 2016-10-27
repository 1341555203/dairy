<%--
  Created by IntelliJ IDEA.
  User: mtf81
  Date: 2016/10/25
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>New Diary</title>
	<link href="<%=request.getContextPath()%>/static/bootstrap/css/bootstrap.css" rel="stylesheet">
	<link href="<%=request.getContextPath()%>/static/wangEditor/css/wangEditor.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<div class="header">
		<ul class="nav nav-pills pull-right" role="tablist">
			<li role="presentation" class="active"><a href="<%=request.getContextPath()%>/article/list">Article</a></li>
			<li role="presentation"><a href="<%=request.getContextPath()%>/category/list">Category</a></li>
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
				   aria-expanded="false">${user.loginName} <span class="caret"></span></a>
				<ul class="dropdown-menu" role="menu">
					<li><a href="<%=request.getContextPath()%>/user/update">Account</a></li>
					<li><a href="<%=request.getContextPath()%>/user/logout">Logout</a></li>
				</ul>
			</li>

		</ul>
		<h3 class="text-muted">New</h3>

	</div>
	<hr>
</div>
<div class="container">
	<input type="text" class="form-control col-xs-7" id="title" placeholder="title" required="required">
	<select class="form-control col-xs-5" id="selector">
		<c:forEach items="${categories}" var="category">
			<option value="${category.id}">${category.cName}</option>
		</c:forEach>
	</select>
	<hr>


</div>
<div class="container">
	<div id="editorDiv" style="height:400px;max-height:500px;">

	</div>
	<div>
		<a href="#" class="btn btn-primary btn-block" id="submitBtn">SUBMIT</a>
	</div>
</div>
</body>
<script src="<%=request.getContextPath()%>/static/jquery/1.11.3/jquery.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/static/bootstrap/js/bootstrap.js" ></script>
<script src="<%=request.getContextPath()%>/static/wangEditor/js/wangEditor.min.js"></script>
<script>
	var editor=new wangEditor("editorDiv");
	editor.create();

</script>
<script>
	$(function(){
		$("#submitBtn").on('click',function(){
			var title_=$("#title").val();
			var content_=editor.$txt.html();
			var cid_=$("#selector").val();
			var postData={
				'title':title_,
				'cId':cid_,
				'content':content_
			}
			$.ajax({
				url:"<%=request.getContextPath()%>/article/new",
				type:'post',
				data:postData,
				success:function(){
					window.location.href="<%=request.getContextPath()%>/article/list"
				},
				error:function(){
					alert("錯誤請重試");
				}

			})
		});
	})
</script>

</html>
