<%@ page import="java.util.List" %>
<%@ page import="com.pan.model.BooksMes" %>
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

    <%@include file="_template.jsp"%>
    <!-- Start Shop Page -->
    <section class="page-shop-sidebar left--sidebar bg--white section-padding--lg">
        <div class="container" style="padding: 20px;border: 1px #ddd solid;">
            <div class="row">
                <%if ((Integer) request.getAttribute("code") == 1) {%>
                <div class="span12" style="margin:2% 5%;">
                    <p>请输入图书编号进行查询：</p>
                </div>
                <%}%>
                <div class="span12" style="margin:2% 5%">
                    <%--按照图书编号显示--%>
                    <form action="/public/showBookSumByID" method="post">
                        <%if ((Integer) request.getAttribute("code") == 0) {%>
                        <span style="color: red;font-weight: bold">${error}</span>
                        <%}%>
                        <input type="text" name="bookid" placeholder="输入图书编号"/>
                        <input type="submit" value="查询"/>
                    </form>
                </div>
                <div class="col-lg-12">

                    <div class="container-fluid">
                        <div class="row-fluid">
                            <div class="span2">
                                <table class="table table-bordered table-hover">
                                    <thead>
                                    <tr>
                                        <th>
                                            图书编号
                                        </th>
                                        <th>
                                            图书名称
                                        </th>
                                        <th>
                                            图书数量
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
                                            图书类型
                                        </th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <%if ((Integer) request.getAttribute("code") == 1) {%>
                                    <%List<BooksMes> list = (List<BooksMes>) session.getAttribute("data");%>
                                    <%for (int i = 0; i < list.size(); i++) {%>
                                    <%BooksMes sellerBook = list.get(i);%>
                                    <tr>
                                        <td>
                                            <%=sellerBook.getIdBook()%>
                                        </td>
                                        <td>
                                            <%=sellerBook.getNameBook()%>
                                        </td>
                                        <td>
                                            <%=sellerBook.getSumBook()%>
                                        </td>

                                        <td>
                                            <%=sellerBook.getPriceBook()%>
                                        </td>
                                        <td>
                                            <%=sellerBook.getPressBook()%>
                                        </td>
                                        <td>
                                            <%=sellerBook.getTimeBook()%>
                                        </td>

                                        <td>
                                            <%=sellerBook.getTypeBook()%>
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
