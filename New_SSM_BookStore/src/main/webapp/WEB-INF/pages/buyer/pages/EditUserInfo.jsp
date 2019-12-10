<%--
  Created by IntelliJ IDEA.
  User: ljj
  Date: 2019/11/2
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>EditUserInfo</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicons -->
    <link rel="shortcut icon" href="../images/favicon.ico">
    <link rel="apple-touch-icon" href="../images/icon.png">

    <!-- Google font (font-family: 'Roboto', sans-serif; Poppins ; Satisfy) -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,500,600,600i,700,700i,800" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900" rel="stylesheet">
    <!-- Cusom css -->
    <link rel="stylesheet" href="../css/custom.css">
    <!-- Stylesheets -->
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/plugins.css">
    <link rel="stylesheet" href="../css/style.css">
    <!-- Modernizer js -->
    <script src="../js/vendor/modernizr-3.5.0.min.js"></script>
</head>
<body class="bg-image--8" style=" background-attachment: fixed;">
<!--[if lte IE 9]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
<![endif]-->

<!-- Main wrapper -->
<div class="wrapper" id="wrapper" style="margin: 100px">

    <%@include file="template.jsp"%>
    <section class="my_account_area pt--100 pb--55 bg--white" style="opacity: 0.75;width: 700px; margin:auto;      padding-top: 30px; margin-top: 150px">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-12" align="center" >
                    <div class="my__account__wrapper"  width: 600px;>
                        <h3 class="account__title">修改信息</h3>
                        <form action="${pageContext.request.contextPath}/public/edituserinfo"  method="post">
                            <div class="account__form">
                                <div class="input__box">
                                    <label>用户名<span></span></label>
                                    <c:forEach items="${user}" var="user">
                                    <input type="text" name="username"  value="${user.username}" readonly>
                                    </c:forEach>
                                </div>
                                <div class="input__box">
                                    <label>地址</label>
                                    <input type="text" name="address">
                                </div>
                                <div class="form__btn" >
                                    <button type="submit" >提交</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>

            </div>
        </div>
    </section>


</div>

<script src="${pageContext.request.contextPath}/js/vendor/jquery-3.2.1.min.js"></script>
<script src="../js/popper.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/plugins.js"></script>
<script src="../js/active.js"></script>
</body>
</html>
