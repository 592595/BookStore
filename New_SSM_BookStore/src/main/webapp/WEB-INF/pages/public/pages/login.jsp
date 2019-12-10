<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="no-js" lang="zxx">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Login| Bookshop Responsive Bootstrap4 Template - SHARED ON THEMELOCK.COM</title>
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
<div class="wrapper" id="wrapper"  style=" margin: 100px;">

    <!-- Header -->
    <header id="wn__header" class="oth-page header__area header__absolute sticky__header ">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-4 col-sm-4 col-7 col-lg-2">
                    <div class="logo">
                        <a >
                            <img src="../images/logo/logo.png" alt="logo images">
                        </a>
                    </div>
                </div>
                <%--        <div class="col-lg-8 d-none d-lg-block">
                            <nav class="mainmenu__nav">
                                <ul class="meninmenu d-flex justify-content-start">
                                    <li class="drop with--one--item"><a href="../WEB-INF/pages/public/index.jsp">Home</a></li>
                                    <li class="drop"><a href="shop.jsp">Shop</a></li>
                                    <li class="drop"><a href="login.jsp">Login</a></li>
                                    <li class="drop"><a href="register.jsp">Register</a></li>
                                </ul>
                            </nav>
                        </div>
                        <div class="col-md-8 col-sm-8 col-5 col-lg-2">
                            <ul class="header__sidebar__right d-flex justify-content-end align-items-center">
                                <li class="shop_search"><a class="search__active" href="#"></a></li>
                                <li class="wishlist"><a href="#"></a></li>
                                <li class="shopcart"><a class="cartbox_active" href="#"><span class="product_qun">*</span></a></li>
                                <li class="setting__bar__icon"><a class="setting__active l" href="#"></a></li>
                            </ul>
                        </div>--%>
            </div>
        </div>
    </header>
    <!-- //Header -->
    <!-- Start Search Popup -->
    <%--    <div class="box-search-content search_active block-bg close__top">
            <form id="search_mini_form" class="minisearch" action="#">
                <div class="field__search">
                    <input type="text" placeholder="Search entire store here...">
                    <div class="action">
                        <a href="#"><i class="zmdi zmdi-search"></i></a>
                    </div>
                </div>
            </form>
            <div class="close__wrap">
                <span>close</span>
            </div>
        </div>--%>
    <!-- End Search Popup -->

    <!-- Start My Account Area -->
    <section class="my_account_area pt--100 pb--55 bg--white" style="opacity: 0.75;width: 700px; margin:auto;      padding-top: 30px; margin-top: 150px">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-12" align="center" >
                    <div class="my__account__wrapper"  width: 600px;>
                        <h3 class="account__title">Login</h3>
                        <form action="${pageContext.request.contextPath}/public/login" >
                            <div class="account__form">
                                <%if((Integer) session.getAttribute("flag") == 0) {%>
                                <a class="forget_pass"  >用户名或密码错误，请重新登录</a>
                                <%}%>
                                <div class="input__box">
                                    <label>Username <span>*</span></label>
                                    <input type="text" name="username">
                                </div>
                                <div class="input__box">
                                    <label>Password<span>*</span></label>
                                    <input type="password" name="password">
                                </div>
                                <div class="form__btn">
                                    <button type="submit">Login</button>

                                </div>
                            </div>
                        </form>
                    </div>
                </div>

            </div>
        </div>
    </section>
    <!-- End My Account Area -->

    <!-- JS Files -->
    <script src="../js/vendor/jquery-3.2.1.min.js"></script>
    <script src="../js/popper.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/plugins.js"></script>
    <script src="../js/active.js"></script>


</body>
</html>


