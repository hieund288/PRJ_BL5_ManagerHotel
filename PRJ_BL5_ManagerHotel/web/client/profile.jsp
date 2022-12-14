<%-- 
    Document   : profile
    Created on : Dec 14, 2022, 8:00:57 PM
    Author     : l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="assets/css/fontawesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="assets/css/fontawesome.css" rel="stylesheet" type="text/css"/>
    </head>
    <%@include file="../navigator/header.jsp" %>
    <body>
        <section class="jumbotron text-center" style=" background-color: #D86515;">
        </section>

        <div class="container">
            <h1> Status booking</h1>
            <c:forEach items="${book}" var="a">

                <div class ="row">
                    <div class="col-xs-12 col-md-12">
                        <!-- product -->
                        <div class="product-content product-wrap clearfix">
                            <div class="row">
                                <div class="col-md-6 col-sm-12 col-xs-12">
                                    <div class="product-image" style="margin-bottom: 10px"> 
                                        <img src="${a.room.rimageURL}"  class="img-responsive" width="400px"> 
                                    </div>
                                </div>
                                <div class="col-md-6 col-sm-12 col-xs-12">
                                    <div class="product-deatil">
                                        <h3 class="name">
                                            ${a.room.rname} <span> </span>
                                        </h3>
                                        Kiểu ${a.room.roomtype}

                                        <h3 class="name">
                                            Checkin ${a.datefrom} <span> </span>
                                        </h3>
                                        <h3 class="name">
                                            Checkout ${a.dateto} <span> </span>
                                        </h3>
                                        <span class="tag1"></span> 
                                    </div>
                                    <div class="description">
                                        <h3> Số lượng người:${a.numPeople}</h3>
                                    </div>
                                    <h4>Trạng thái: ${a.status?"Đã đặt thành công":"Đã hủy"} </h4>
                                    <a href=""><h1 style="color: pink">Hủy phòng</h1></a>
                                </div>
                            </div>
                        </div>
                        <!-- end product -->
                    </div>
                </div>

            </c:forEach>
        </div>

        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/popper.min.js"></script>
        <script src="assets/js/bootstrap.bundle.min.js"></script>
        <script src="assets/js/jquery-3.0.0.min.js"></script>
        <script src="assets/js/plugin.js"></script>
        <!-- sidebar -->
        <script src="assets/js/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="assets/js/custom.js"></script>
        <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
    </body>

</html>
