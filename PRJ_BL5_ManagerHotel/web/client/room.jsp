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

    ${room.get(0).rname} <br/>
    ${room.get(0).price} <br/>
    ${room.get(8).hotel.typeid}<br/>
    ${room.get(0).status?"đúng":"sai"}<br/>
    

    
    
    
    
    <div class="container">
        <div class ="row">
            <div class="col-xs-12 col-md-12">
                <div class="product-content product-wrap clearfix">
                    <div class="row">
                        <div class="col-md-6 col-sm-12 col-xs-12">
                            <div class="product-image"> 
                                <img src="${room.get(0).hotel.imageURL}"  class="img-responsive"> 
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-12 col-xs-12">
                            <div class="product-deatil">
                                <h5 class="name">
                                    <a href="">
                                        <h1 style="font-weight: bold; font-size: 40px;">${room.get(0).hotel.name}</h1> <span> ${room.get(0).hotel.typeid}</span>
                                    </a>
                                </h5>
                                <p class="price-container">
                                    <span>$99</span>
                                </p>
                                <span class="tag1"></span> 
                            </div>
                            <div class="description">
                                <p>${room.get(0).hotel.description}</p>
                            </div>
                            <div class="product-info smart-form">
                                <div class="row">
                                    <div class="col-md-6 col-sm-6 col-xs-6"> 
                                        <a href="checkout" class="btn btn-success">Book now</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-12 col-xs-12">
                            <div class="product-image"> 
                                <img src="${room.get(0).imageURL}"  class="img-responsive"> 
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>


    </div>
</body>

<%@include file="../navigator/footer.jsp" %>