<%-- 
    Document   : hotel
    Created on : Dec 7, 2022, 11:21:28 AM
    Author     : l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <%@include file="../navigator/header.jsp" %>
    <body class="main-layout">
        <div class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
                <h1 >Movies List</h1>
                <a href="moviescreate"><button class="btn btn-success">Create</button></a>
            </div>
            <table border="1" style="margin: 0px auto; width: 80%">
                <tr>
                    <th>ID</th><th>Name</th><th>Genre</th><th>Year</th>
                    <th colspan="2"></th>

                    <c:forEach items="${listMovies}" var="a">
                    <tr>
                        <td>${a.movieID}</td>
                        <td>${a.title}</td>
                        <td>${a.genreID}</td>
                        <td>${a.year}</td>
                       
                    </tr>
                </c:forEach>

            </table>
        </div>    
    </body>
    <!-- end about -->

    <%@include file="../navigator/footer.jsp" %>
</html>

