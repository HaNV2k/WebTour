<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <link href="style.css" rel="stylesheet" type="text/css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link rel="canonical" href="https://www.ivivu.com/ho-tro" />
        <link rel="shortcut icon" href="https://res.ivivu.com/hotel/img/favicon.ico" type="image/x-icon" />
        <link href="https://plus.google.com/109621980211258897268/" rel="author" />
        <link rel="preload" href="https://res.ivivu.com/hotel/vendor/font-awesome/css/font-awesome.min.css" as="style" onload="this.rel = 'stylesheet'">
        <link rel="preload" href="https://res.ivivu.com/hotel/vendor/animate/animate.min.css" as="style" onload="this.rel = 'stylesheet'">
        <link href="https://res.ivivu.com/hotel/css/iVIVU.StaticPage.css?v=0.2" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </style>
</head>
<body>
    <form action="${pageContext.request.contextPath}//listNews" method="GET">
        <div class ="container">
            <div class="static-content clearfix">
                <div class="container">
                    <div class="right-col col-xs-12 col-sm-12 col-md-9 col-lg-9 col-md-push-3 col-lg-push-3 txt-justify">
                        <div class="right-col-wrap">
                            <div id="content">
                                <div id="tvtmenu">
                                    <p><span style="color: #003c71;"><strong>&nbsp;</strong></span></p>
                                </div>
                                <div id="tvt_content">
                                    <h1>Frequently Asked Question</h1>                                
                                    <p>&nbsp;</p>


                                    <%= (request.getAttribute("message") == null) ? "" : request.getAttribute("message")%>
                                    <br>
                                    <c:if test="${check1 != null}">
                                        <a href="editNews.jsp">+</a>
                                    </c:if>

                                    <div class="container">
                                        <%
                                            int i = 1;
                                        %>
                                        <c:forEach var="n"  items="${listNews}">
                                            <hr style="width: 800px;margin-left: -75px">
                                            <button type="button" class= "btn btn-info" data-toggle="collapse" data-target="#demo<%=i%>"
                                                    style="background:lightcoral;color: black;max-width: 600px;padding: 5px;width: 100%;text-align: left"
                                                    name = "title"> - ${n.getTitle()}</button>
                                            <c:if test="${check1 != null}">
                                                <a href="${pageContext.request.contextPath}//updateNews?title=${n.getTitle()}">Update</a>
                                                <a href="${pageContext.request.contextPath}//deleteNews?title=${n.getTitle()}">Delete</a>
                                            </c:if>
                                            <div id="demo<%=i%>" class="collapse" name = "content" for="<%=i++%>" style="width: 700px">
                                                ${n.getContent()}
                                            </div>                                                        
                                            <br><br>
                                        </c:forEach>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="left-col col-xs-12 col-sm-12 col-md-3 col-lg-3 col-md-pull-9 col-lg-pull-9">
                        <div class="left-col-wrap">
                            <ul>
                                <li><a href="home.jsp">Home</a></li>
                                <li><a href="${pageContext.request.contextPath}//listTours">Tour</a></li>
                                    <c:if test="${check1 != null}">
                                    <li><a href="uploadfile.jsp">Design Tour</a></li>
                                </c:if>
                                <c:if test="${checkAccount != true}">
                                    <li><a href="login.jsp" >Login</a></li>
                                    </c:if>
                                   <c:if test="${checkAccount != true}">
                                    <li><a href="${pageContext.request.contextPath}//historyOrder?email=+${email1}">History Order</a></li>
                                    </c:if> 
                                
                            </ul>
                        </div>
                    </div>	
                </div>
            </div>
        </div>
    </form>
</body>
</html>