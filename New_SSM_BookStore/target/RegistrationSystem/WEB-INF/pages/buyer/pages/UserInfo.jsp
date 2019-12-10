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
    <title> UserInfo</title>
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

    <div class="cart-main-area section-padding--lg bg--white">
        <div class="container">
            <div class="row" style="margin-top: 15px">
                <div class="col-md-12 col-sm-12 ol-lg-12">

                    <ul class="cart__total__list">
                        <h3 class="wedget__title">个人信息</h3>
                    </ul>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12 col-sm-12 ol-lg-12">
                    <form action="#">
                        <div class="table-content wnro__table table-responsive">
                            <table>
                                <thead>
                                <tr class="title-top">
                                    <th class="product-thumbnail">用户名</th>
                                    <th class="product-name">电话</th>
                                    <th class="product-price">性别</th>
                                    <th class="product-remove">地址</th>
                                    <th class="product-name"></th>
                                </tr>
                                </thead>
                                <tbody>

                                <c:forEach items="${user}" var="user">
                                <tr>
                                    <td class="product-price"><span class="amount">${user.username}</span></td>
                                    <td class="product-price"><span class="amount">${user.phone}</span></td>
                                    <td class="product-price"><span class="amount">${user.gender}</span></td>
                                    <td class="product-remove" style="font-size: 16px;font-weight: 700;color: #333;" id="adddress">
                                        <%if ( request.getAttribute("address") == null) {System.out.println( request.getAttribute("address"));%>
                                    <a href="/public/edituser">添加地址</a>
                                        <%} else{%>
                                            ${user.addressBuyer}</td>
                                    <%}%>
                                    <td class="product-price"style="font-size: 16px;font-weight: 700;color: #333;"><a href="/public/edituserp">修改密码</a></td>

                                </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row" style="margin-top: 15px">
                <div class="col-md-12 col-sm-12 ol-lg-12">

                            <ul class="cart__total__list">
                                <h3 class="wedget__title">我的订单</h3>
                            </ul>

               </div>
            </div>
            <div class="row">
                <div class="col-md-12 col-sm-12 ol-lg-12">
                    <form action="#">
                        <div class="table-content wnro__table table-responsive">
                            <table>
                                <thead>

                                <tr class="title-top">
                                   <%-- <th class="product-name">Image</th>--%>
                                       <th class="product-name">书名</th>
                                       <th class="product-name">商家</th>
                                       <th class="product-price">单价</th>
                                       <th class="product-quantity">数量</th>
                                       <th class="product-subtotal">总价</th>
                                       <th class="product-remove">下单时间</th>
                                       <th class="product-remove">是否发货</th>
                                       <th class="product-remove">是否付款</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${order}" var="order">
                                <tr>

                                <td class="product-name" style="font-size: 16px;font-weight: 700;color: #333;">${order.nameBook}</td>
                                <td class="product-price" style="font-size: 16px;font-weight: 700;color: #333;">${order.idSeller}</td>
                                <td class="product-price"><span class="amount">${order.priceBook}</span></td>
                                <td class="product-subtotal">${order.sumBook}</td>
                                <td class="product-subtotal">${order.priceOrder}</td>
                                <td class="product-subtotal">${order.timeOrder}</td>
                                <td class="product-name" style="font-size: 16px;font-weight: 700;color: #333;">${order.deliverCheck}
                                <td class="product-name" style="font-size: 16px;font-weight: 700;color: #333;">${order.payCheck}</tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </form>
             <%--      <div class="cartbox__btn">
                    <ul class="cart__btn__list d-flex flex-wrap flex-md-nowrap flex-lg-nowrap justify-content-between">
                        <li></li><li></li><li></li>
                        <li><a href="#">Check Out</a></li>
                    </ul>
                </div>--%>
                </div>
            </div>

        </div>
    </div>

</div>

<script src="${pageContext.request.contextPath}/js/vendor/jquery-3.2.1.min.js"></script>
<script src="../js/popper.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/plugins.js"></script>
<script src="../js/active.js"></script>
</body>
</html>
