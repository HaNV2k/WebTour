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
        <div class="hero-text" style="background: #ddd;width: auto;height:auto">
            <body style="background-color: #ddd">
                <h2 style="color: "><b>Sign up</b></h2>
                <form action="${pageContext.request.contextPath}//singupController" method="GET" style="margin:auto">        
                    <div style="border:1px solid black ;wisignupControllerdth: auto;padding: 20px; margin-left: auto;color: black">
                        <table>
                            <tr>
                                <td><br><input type='text' name='name'  Placeholder ="FullName"
                                               style=" width: 100%;max-width: 330px;padding:20px 50px;margin: auto; border-radius: 20px;color: black"></td>
                                <td><br><div style="width: 100%;max-width: 330px;padding:20px 50px;margin: auto; border-radius: 20px;color: black">
                                        Gender: <input type="radio" id="1" name="gender" value="1" checked>
                                        <label for="1">Male</label>
                                        <input type="radio" id="0" name="gender" value="0">
                                        <label for="0">Female</label>
                                    </div></td>
                            </tr>
                            <tr>
                                <td><br><input type='text' name='phone'  Placeholder ="Phone"
                                               style=" width: 100%;max-width: 330px;padding:20px 50px;margin: auto; border-radius: 20px;color: black"></td>
                                <td><br><input type='text' name='address'  Placeholder ="Address"
                                               style=" width: 100%;max-width: 330px;padding:20px 50px;margin: auto; border-radius: 20px;color: black"></td>
                            </tr>
                            <tr>
                                <td><br><input type='text' name='dob'  Placeholder ="Date of birth"
                                               style=" width: 100%;max-width: 330px;padding:20px 50px;margin: auto; border-radius: 20px;color: black"></td>
                                <td><br><input type='text' id="email" name='email' Placeholder ="Enter Email"
                                               style=" width: 100%;max-width: 330px;padding: 20px 50px;margin: auto; border-radius:20px;color: black"></td>
                            </tr>
                            <tr>
                                <td><br><input type='password' name='pass'  Placeholder ="Enter Password"
                                               style=" width: 100%;max-width: 330px;padding:20px 50px;margin: auto; border-radius: 20px;color: black"></td>
                                <td><br><input type='password' name='pass1'  Placeholder ="Repeat Password"
                                               style=" width: 100%;max-width: 330px;padding:20px 50px;margin: auto; border-radius: 20px;color: black"></td>
                            </tr>
                        </table>

                        <br><%= (request.getAttribute("message") == null) ? "" : request.getAttribute("message")%>
                        <br>
                        <button class="w-100 btn btn-lg btn-primary" type="submit" style="background: #03a9f4;color: #ffffff;max-width: 330px;padding: 20px 50px;width: 100%">Sign up</button>
                        <br><a href="home.jsp">Home?</a>
                        <br>You have an account? <a href="login.jsp">Login here</a>


                    </div>    
                </form>
            </body>
        </div>
    </body>

</html>
