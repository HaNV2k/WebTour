
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}//editNews" method="get">     
            <div style="width: 100%">                    
                <div style="float: left ;margin-left: 50px">
                    Title:<br>                                       
                    <input type="text" name="title" value="" style="width: 500px;height: 20px"><br>
                    Content:<br> <textarea rows='' cols='' name="content" style="width: 500px;height: 150px" >                        
                    </textarea><br><br>
                    <input type="submit" value="Ok" name="thuchien" style="margin-left:470px">
                    <br><br>
                    <%= (request.getAttribute("message") == null) ? "" : request.getAttribute("message")%>
                </div>
        </form>
    </div>
</body>
</html>
