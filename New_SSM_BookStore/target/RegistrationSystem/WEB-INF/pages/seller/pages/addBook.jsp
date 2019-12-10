<%@ page import="java.util.List" %>
<%@ page import="com.pan.model.BooksMes" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>seller</title>
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

    <%@include file="_template.jsp"%>
    <!-- Start Shop Page -->
    <section class="page-shop-sidebar left--sidebar bg--white section-padding--lg">
        <div class="container">
            <div class="row">
                <div class="container-fluid">
                    <div class="row-fluid">
                        <div class="col-12">
                            <div class="col-7" style="margin-left: auto;margin-right: auto;border: 1px #ddd solid; padding: 20px">
                                <form action="/public/addBook" method="post">
                                    <table class="table table-bordered table-hover" >
                                        <tbody>
                                        <tr>
                                            <td>
                                                书名:
                                            </td>
                                            <td>
                                                <input class="input" name="nameBook" required>
                                            </td>
                                            <td>
                                                上架数量:
                                            </td>
                                            <td>
                                                <input class="input" name="sumBook" type="number" value="0"  min="0" step="0" required >
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>价格:</td>
                                            <td><input class="input" name="priceBook" type="number" value="0"  min="0" step="0.01" required></td>
                                            <td>类型:</td>
                                            <td><input class="input" name="typeBook" required></td>
                                        </tr>
                                        <tr>
                                            <td>出版社:</td>
                                            <td><input class="input" name="pressBook" required></td>
                                            <td>出版时间:</td>
                                            <td><input class="input" name="timeBook" type="date" required></td>
                                        </tr>
                                        <tr>
                                            <td colspan="4" >
                                                <span style="right: 20px;float: right">
                                                    <button class="btn btn-info" type="submit" >上架</button>
                                                    <button class="btn btn-warning" type="reset" >重置</button>
                                                </span>
                                            </td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </form>
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
