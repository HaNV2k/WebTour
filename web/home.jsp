<!DOCTYPE html>
<html>
    <head>
        <title>Viet Nam Traveling</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta property="og:title" content="Vide" />      
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href="css/component.css" rel  ="stylesheet" type="text/css"  />
        <style>
            body, html {
                height: 93%;
                margin: 0;
                font-family: Arial, Helvetica, sans-serif;
            }

            .hero-image {
                background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url("images/111.jpg");
                height: 100%;
                background-position: center;
                background-repeat: no-repeat;
                background-size: cover;
                position: relative;
            }

            .hero-text {
                text-align: center;
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                color: white;
            }

            .hero-text button {
                border: none;
                outline: 0;
                display: inline-block;
                padding: 10px 25px;
                color: black;
                background-color: #ddd;
                text-align: center;
                cursor: pointer;
            }

            .hero-text button:hover {
                background-color: #555;
                color: white;
            }
        </style>
    </head>

    <body>
        <div>	
            <div class="header">
                <div class="container">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="home.jsp">Viet Nam <span>Traveling</span></a>
                    </div>
                    <div class="top-nav">
                        <nav class="top-nav-bottom cbp-spmenu cbp-spmenu-vertical cbp-spmenu-right" id="cbp-spmenu-s2">
                            <h3>Menu</h3>
                            <a href="${pageContext.request.contextPath}/home.jsp">Home</a>                            
                            <a href="${pageContext.request.contextPath}/favoriteDestination.jsp">Favorite destination</a>
                            <a href="${pageContext.request.contextPath}/login.jsp">Login</a>
                            <a href="${pageContext.request.contextPath}/designTour.jsp">Design Tour</a>         
                            <a href="${pageContext.request.contextPath}/new.jsp">News</a>
                            
                        </nav>
                        <div class="main buttonset">	

                            <button id="showRightPush"><img src="images/menu.png" alt=""/></button>

                            <script src="js/classie.js"></script>
                            <script>
                                var menuRight = document.getElementById('cbp-spmenu-s2'),
                                        showRightPush = document.getElementById('showRightPush'),
                                        body = document.body;

                                showRightPush.onclick = function () {
                                    classie.toggle(this, 'active');
                                    classie.toggle(body, 'cbp-spmenu-push-toleft');
                                    classie.toggle(menuRight, 'cbp-spmenu-open');
                                    disableOther('showRightPush');
                                };

                                function disableOther(button) {
                                    if (button !== 'showRightPush') {
                                        classie.toggle(showRightPush, 'disabled');
                                    }
                                }
                            </script>

                        </div>	
                        <div class="clearfix"> </div>
                    </div>


                </div>

            </div>

        </div>
        <div class="hero-image">
            <div class="hero-text">
                <h1 style="font-size:50px">Happiness is travelling</h1>
                <p>Let's start your journey with us, your dream will come true</p>
                <button><a href="${pageContext.request.contextPath}//listTours">Explore now</a></button>
            </div>
        </div>
    </body>
</html>
