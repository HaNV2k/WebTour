<%-- 
    Document   : listTours
    Created on : Jul 21, 2021, 8:04:25 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            int i = 1;

        %>
        <div style="float: left;width: 60%;background-color: lightcoral">
            <c:forEach var="n"  items="${listTours}">
                <div style="height: 240px;width: 100%;float: left;">                              
                    <div id="<%=i%>" name = "address" for="<%=i++%>" style="margin-left: 40px;margin-top: 15px;float: left;width: 200px">  
                        <p style=""><b><i>${n.getAddress()}</i></b></p>                     
                        Slot : <i>${n.getSlot()}</i>     
                        <p> idTour : ${n.getIdTour()}</p>
                        
                        
                    </div>

                </div>
            </c:forEach>
        </div>
                    
    </body>
</html>
