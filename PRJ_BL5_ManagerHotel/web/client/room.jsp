<%-- 
    Document   : hotel
    Created on : Dec 7, 2022, 11:21:28 AM
    Author     : l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link href="assets/css/custom.css" rel="stylesheet" type="text/css"/>

<%@include file="../navigator/header.jsp" %>

<body>
    <section class="jumbotron text-center" style=" background-color: #D86515;">
    </section>

    <div class ="row">
        <div class="col-xs-12 col-md-12">
            <form action="sort" method="POST" >
                <select name="sort">
                    <option name ="opAsc" value="A">Asc</option>
                    
                    <option name ="opDsc" value="B">Dsc</option>
                </select>
            </form>
        </div>
    </div>


    <c:forEach items="${room}" var="a">
        <div class ="row">
            <div class="col-xs-12 col-md-12">
                <!-- product -->
                <div class="product-content product-wrap clearfix">
                    <div class="row">
                        <div class="col-md-6 col-sm-12 col-xs-12">
                            <div class="product-image"> 
                                <img src="${a.rimageURL}"  class="img-responsive"> 
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-12 col-xs-12">
                            <div class="product-deatil">
                                <h5 class="name">
                                    <a href="">
                                        ${a.rname} <span> ${a.roomtype}</span>
                                    </a>
                                </h5>
                                <p class="price-container">
                                    <span>${a.price}$/1h</span>
                                </p>
                                <span class="tag1"></span> 
                            </div>
                            <div class="description">   
                                <p style="font-size: 30px">${a.rdescription}</p>
                            </div>
                            <div class="product-info smart-form">
                                <div class="row">
                                    <div class="col-md-6 col-sm-6 col-xs-6"> 
                                        <a href="checkout" class="btn btn-success">Book now</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- end product -->
            </div>
        </div>
    </c:forEach>           
</div>
</body>

<%@include file="../navigator/footer.jsp" %>