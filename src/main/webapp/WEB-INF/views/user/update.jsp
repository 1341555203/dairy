<%--
  Created by IntelliJ IDEA.
  User: mtf81
  Date: 2016/10/24
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>categories</title>
    <link href="<%=request.getContextPath()%>/static/bootstrap/css/bootstrap.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right" role="tablist">
            <li role="presentation" ><a href="<%request.getContextPath();%>/article/list">Article</a></li>
            <li role="presentation" class="active"><a href="<%request.getContextPath();%>/category/list">Category</a></li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">${user.loginName} <span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                    <li><a href="#">Account</a></li>
                    <li><a href="<%=request.getContextPath()%>/user/login">Logout</a></li>
                </ul>
            </li>

        </ul>
        <h3 class="text-muted">Categories </h3>

    </div>
    <hr>
</div>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-body">
            <form:form modelAttribute="user" method="post" class="form-horizontal" role="form">
                <div><form:errors path="*" cssStyle="color:red"/> </div>
                <h2 class="form-signin-heading" style="text-align: center">User Update</h2>
                <div class="form-group">
                    <label for="password" class="col-sm-2 control-label">password<font color="red">*</font></label>
                    <div class="col-sm-10">
                        <form:input  class="form-control" path="password" placeholder="Password" required="required" maxlength="20" type="password"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="name" class="col-sm-2 control-label">Name<font color="red">*</font></label>
                    <div class="col-sm-10">
                        <form:input path="name" class="form-control"  placeholder="Name" required="required" maxlength="20"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="col-sm-2 control-label">email<font color="red">*</font></label>
                    <div class="col-sm-10">
                        <form:input class="form-control" path="email" placeholder="email" required="required" maxlength="20" type="email"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="phone" class="col-sm-2 control-label">phone<font color="red">*</font></label>
                    <div class="col-sm-10">
                        <form:input class="form-control" path="phone" placeholder="phone" required="required" maxlength="20"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="mobile" class="col-sm-2 control-label">mobile</label>
                    <div class="col-sm-10">
                        <form:input class="form-control" path="mobile" placeholder="mobile"/>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">update</button>
                    </div>
                </div>
            </form:form>>
        </div>

    </div>


</div>
</body>
<script src="<%=request.getContextPath()%>/static/jquery/1.11.3/jquery.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/static/bootstrap/js/bootstrap.js" ></script>
</html>


