<%@ page import="com.pan.model.BooksMes" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 74415
  Date: 2019/11/6
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>shop</title>
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

    <%@include file="index.jsp"%>

    <!-- Start Shop Page -->
    <section class="page-shop-sidebar left--sidebar bg--white section-padding--lg">
        <div class="container" style="padding: 20px;border: 1px #ddd solid;">
            <div class="row">
                <div class="col-lg-12">

                    <div class="container-fluid">
                        <div class="row-fluid">
                            <div class="span12">
                                <table class="table table-bordered table-hover">
                                    <thead>
                                    <tr>
                                        <th>
                                            图书名称
                                        </th>
                                        <th>
                                            所属商家
                                        </th>
                                        <th>
                                            价格
                                        </th>
                                        <th>
                                            出版社
                                        </th>
                                        <th>
                                            出版时间
                                        </th>
                                        <th>
                                            图书数量
                                        </th>
                                        <th>
                                            操作
                                        </th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <%if ((Integer) request.getAttribute("code") == 1) {%>
                                    <%List<BooksMes> newlist = (List<BooksMes>) session.getAttribute("data");%>
                                    <%for (int i = 0; i < newlist.size(); i++) {%>
                                    <%BooksMes adminBookViolation = newlist.get(i);%>
                                    <tr>
                                        <td>
                                            <%=adminBookViolation.getNameBook()%>
                                        </td>
                                        <td>
                                            <%=adminBookViolation.getIdSeller()%>
                                        </td>
                                        <td>
                                            <%=adminBookViolation.getPriceBook()%>
                                        </td>
                                        <td>
                                            <%=adminBookViolation.getPressBook()%>
                                        </td>
                                        <td>
                                            <%=adminBookViolation.getTimeBook()%>
                                        </td>
                                        <td>
                                            <%=adminBookViolation.getSumBook()%>
                                        </td>
                                        <td>
                                            <a href="/public/CancelBookViolation?BookID=<%=adminBookViolation.getIdBook()%>">取消违规</a>
                                        </td>
                                    </tr>
                                    <%
                                            }
                                        }
                                    %>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- End Shop Page -->

</div>

<script src="../js/vendor/jquery-3.2.1.min.js"></script>
<script src="../js/popper.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/plugins.js"></script>
<script src="../js/active.js"></script>
</body>
</html>
