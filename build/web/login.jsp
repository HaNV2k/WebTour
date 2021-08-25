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

            .hero-text {
                text-align: center;
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                color: black;
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
            .hero-text .form-floating:focus-within {
                z-index: 2;
            }
            input {
                outline:none;
            }

        </style>
    </head>

    <body>
        <div class="hero-text" style="background: #ddd;width: 300px;height:400px">
            <body style="background-color: #ddd">

                <h2 style="color: "><b>Log in</b></h2>
                <form action="${pageContext.request.contextPath}//loginController" method="GET" style="margin:auto">
                    <div style="border:1px solid black ;width: auto;padding: 20px; margin-left: auto;color: black">

                        <br><input type='email' id="email" name='email' Placeholder ="Email"
                                   style=" width: 100%;max-width: 330px;padding: 20px 50px;margin: auto; border-radius:20px;color: black"
                                   >
                        <br><input type='password' name='pass'  Placeholder ="Pass"
                                   style=" width: 100%;max-width: 330px;padding:20px 50px;margin: auto; border-radius: 20px;color: black"
                                   
                                   >
                        <br><br><%= (request.getAttribute("message") == null) ? "" : request.getAttribute("message")%>

                        <br><br>
                        <button class="w-100 btn btn-lg btn-primary" type="submit" style="background: #03a9f4;color: #ffffff;max-width: 330px;padding: 20px 50px;width: 100%">Sign in</button>
                        <br><a href="home.jsp">Home?</a>
                        <br>Don't have an account yet?<a href="signup.jsp">Sign up here</a>
                    </div>
                </form>
            </body>
        </div>

    </body>
</html>
