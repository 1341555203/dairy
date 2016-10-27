<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/6
  Time: 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>user register</title>
    <link href="<%=request.getContextPath()%>/static/bootstrap/css/bootstrap.css" rel="stylesheet">
    <script src="<%=request.getContextPath()%>/static/bootstrap/js/bootstrap.js" ></script>
    <script src="<%=request.getContextPath()%>/static/jquery/1.11.3/jquery.js" type="text/javascript"></script>

</head>
<body>

<div class="container col-md-4 col-md-offset-4" style="padding-top:40px;">
    <form:form modelAttribute="user" method="post" class="form-horizontal" role="form">
        <div><form:errors path="*" cssStyle="color:red"></form:errors> </div>
        <h2 class="form-signin-heading" style="text-align: center">User Register</h2>
        <div class="form-group">
            <label for="loginName" class="col-sm-2 control-label">loginName<font color="red">*</font></label>
            <div class="col-sm-10">
                <form:input path="loginName" class="form-control" required="required" maxlength="20" placeholder="loginName" />
            </div>
        </div>
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
                <button type="submit" class="btn btn-default">register</button>
            </div>
        </div>
    </form:form>
</div>
</body>


</html>
