<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all">	
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    </head>
    <body>			
        <div class="news">
            <img src="images/FD.png" alt="" style="width:100%;height:500px">
            <div style="float: right;margin-right: 100px;">



                <c:choose>
                    <c:when test="${sessionScope.email == null}">

                        <div style="width: 300px;height: 20px;float: left;   ">

                            <a href="${pageContext.request.contextPath}/login.jsp">
                                Login/Register
                            </a>
                        </div>
                    </c:when>

                    <c:otherwise>
                        <form action="${pageContext.request.contextPath}//logoutController" method="GET">
                            <div style="width: 300px;height: 32px;float: left;">
                                <button class="button" style="float: left;height: 70%;color: black;margin-top: 3px" name="button" value="logout"> Log Out</button>
                            </div>
                        </form>
                    </c:otherwise>
                </c:choose>    


            </div>
            <h3 style="width: auto;height: auto;text-height: auto;color: #e51c23;margin-left: 10%"><b><i>Tour</i></b></h3>
            <div class="container">
                <div>
                    <%
                        int i = 1;
                    %>
                    <div style="float: left;width: 60%;background-color: lightcoral">
                        <c:forEach var="n"  items="${listTours}">
                            <div style="border: 2px solid black;height: 240px;width: 100%;float: left;">              
                                <div style="width: 310px;margin-left: 50px;float: left;margin-top: 15px;">
                                    <a href="${pageContext.request.contextPath}//searchByIdTour?idTour=${n.getIdTour()}"><img src='images/${n.getImage()} 'style="width: 200px;height: 200px;margin-left: 5%">
                                    </a>
                                </div>
                                <div id="<%=i%>" name = "address" for="<%=i++%>" style="margin-left: 40px;margin-top: 15px;float: left;width: 200px">
                                    <p style=""><b><i>${n.getAddress()}</i></b></p>
                                    From Date:<i>${n.getStartTime()}</i></p>
                                    To Date:<i>${n.getEndTime()}</i></p>
                                    <p>Price :<b style="color: red"><i>${n.getPrice()}$</i></b></p>
                                    Slot : <i>${n.getSlot()}</i>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <div style="float: left;margin-left: 5%;width: 30%">
                        <a href="home.jsp">Home</a>                                                         
                        <p><a href="${pageContext.request.contextPath}//listNews">FAQ</a></p>
                        <c:if test="${check1 != null && checkAccount == true}">
                            <a href="uploadfile.jsp" >Design Tour</a>
                            </c:if>
                    </div>
                    <br><br>
                </div>
            </div>
        </div>
    </body>
</html>