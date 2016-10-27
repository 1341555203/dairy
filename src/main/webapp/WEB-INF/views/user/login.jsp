<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/6
  Time: 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>user login</title>
    <link href="<%=request.getContextPath()%>/static/bootstrap/css/bootstrap.css" rel="stylesheet">
    <script src="<%=request.getContextPath()%>/static/bootstrap/js/bootstrap.js" ></script>
    <script src="<%=request.getContextPath()%>/static/jquery/1.11.3/jquery.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function(){
           $('#register').bind("click",function(){
               window.location.href="<%=request.getContextPath()%>/user/register";
            });
        });
    </script>
</head>
<body>

<div class="container col-xs-10 col-xs-offset-1  col-md-3 col-md-offset-7" style="padding-top:80px;">
    <form class="form-signin" role="form" method="post">
        <div id="errorMessages" >${errorMessages}</div>
        <h2 class="form-signin-heading" style="text-align: center"><legend>Dairy Diary</legend></h2>
        <input class="form-control" placeholder="loginName" name="loginName" required="" autofocus="" >
        <input class="form-control" placeholder="Password"  name="password"required="" type="password">
        <%--<div class="checkbox">--%>
            <%--<label>--%>
                <%--<input value="remember-me" type="checkbox"> Remember me--%>
            <%--</label>--%>
        <%--</div>--%>
        <button class="btn btn-md btn-primary btn-block" type="submit">Sign in</button>
        <button type="button" id="register" class="btn btn-md btn-primary btn-block">register</button>
    </form>
</div>
</body>

</html>
