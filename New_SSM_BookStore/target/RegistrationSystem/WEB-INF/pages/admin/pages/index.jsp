<%--
  Created by IntelliJ IDEA.
  User: 74415
  Date: 2019/11/19
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>管理员主页</title>
</head>
<body class="bg-image--8" style=" background-attachment: fixed;">
<!-- Main wrapper -->
<div class="wrapper" id="wrapper" style="margin: 100px">
    <!-- Header -->
    <header id="wn__header" class="oth-page header__area header__absolute sticky__header ">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-4 col-sm-4 col-7 col-lg-2">
                    <div class="logo">
                        <a >
                            <img src="../../../../images/logo/logo.png" alt="logo images">
                        </a>
                    </div>
                </div>
                <div class="col-lg-8 d-none d-lg-block">
                    <nav class="mainmenu__nav">
                        <ul class="meninmenu d-flex justify-content-start">
                            <li class="drop"><a href="/public/selectAllBuyer">查看买家信息</a></li>
                            <li class="drop"><a href="/public/showBookSum">查看图书信息</a></li>
                            <li class="drop"><a href="/public/findViolationBook">违规图书查询</a></li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
    </header>
    <!-- //Header -->

</div>
</body>
</html>
