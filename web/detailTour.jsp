
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
            <h3 style="width: auto;height: auto;text-align: center;text-height: auto;color: #e51c23;"><b><i>Detail Tour</i></b></h3>
            <div class="container">


                <%
                    int i = 1;

                %>
                <div style="float: left;width: 60%;background-color: lightcoral">
                    <c:forEach var="n"  items="${listTours}">
                        <div style="height: 240px;width: 100%;float: left;">              
                            <div style="width: 310px;margin-left: 50px;float: left;margin-top: 15px;">
                                <img src='images/${n.getImage()} 'style="width: 200px;height: 200px;margin-left: 5%">     
                            </div>
                            <div id="<%=i%>" name = "address" for="<%=i++%>" style="margin-left: 40px;margin-top: 15px;float: left;width: 200px">  
                                <p style=""><b><i>${n.getAddress()}</i></b></p>
                                Email :  ${n.getEmail()}
                                Phone :  ${n.getPhone()}
                                From Date:<i>${n.getStartTime()}</i></p>
                                To Date:<i>${n.getEndTime()}</i></p>
                                <p>Price :<b style="color: red"><i>${n.getPrice()}$</i></b></p>
                                Slot : <i>${n.getSlot()}</i>
                                <p>Transport : ${n.getTransport()}</p>                                
                            </div>

                        </div>
                    </c:forEach>
                </div>



                <div style="float: left;margin-left: 5%;width: 30%">
                    <p><a href="home.jsp">Home</a></p>                                                         
                    <p><a href="${pageContext.request.contextPath}//listNews">FAQ</a></p>
                    <p> <a href="${pageContext.request.contextPath}//listTours">Tour</a></p>
                    <c:if test="${checkAccount != true}">
                        <p><a href="login.jsp" >Login</a></p>
                    </c:if>
                </div>
                <br><br>



            </div>  
            <br><br>
            <c:if test="${checkAccount != false}">
                <form action="${pageContext.request.contextPath}//order?idTour=${idTour}" method="post">
                    <c:forEach var="n"  items="${listTours}">

                        <p style="margin-left:150px">
                            Quantity: <input type="number" value="<%=request.getAttribute("order")%>" name="order" style="" min="1" max="${n.getSlot()}">
                            <input type="submit" value="Order" name="submit">
                        </c:forEach>
                    </c:if>

            </form>
            <br><br><br>
        </div>

    </body>
</html>