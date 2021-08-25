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
        </style>
    </head>

    <body>
        <form action="${pageContext.request.contextPath}//designTourController?image=${image}" method="Post">
        <div class="hero-text" style="background: #ddd">
            <body style="background: #ddd">
                <br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                <table style="border: 4px solid #048BC1; margin-right: auto; margin-left: auto; width: 960px; height: auto">
                    <tr>
                        <td colspan="2" style="padding: 20px 10px 15px 10px; font-size: xx-large; text-align: center; vertical-align: middle; font-weight: bold; color:#048BC1">Design Tour<br><br></td>
                    </tr>


                    <tr>
                        <th style="width: 20%"><p>Email:</p><br><br><br></th>
                        <td style="width: 80%"><input type='text' name='email' style="padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px ;width: 70%;">
                            <br><br><br></td>  
                    </tr>

                    <tr>
                        <th style="width: 20%">Phone:<br><br><br></th>
                        <td style="width: 80%"><input type='number' name='phone' style="padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px;width: 70%;">
                            <br><br><br></td>  
                    </tr>
                    <tr>
                        <th style="width: 20%">Address:<br><br><br></th>
                        <td style="width: 80%"><input type='text' name='address' style="padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px;width: 70%;">
                            <br><br><br></td>  
                    </tr>
                    <tr>
                        <th style="width: 20%">Start time:<br><br><br></th>
                        <td style="width: 80%"><input type='text' name='startTime' style="padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px;width: 70%;">
                            <br><br><br></td>  
                    </tr>
                    <tr>

                        <th style="width: 20%">End time:<br><br><br></th>
                        <td style="width: 80%"><input type='text' name='endTime' style="padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px;width: 70%;">
                            <br><br><br></td>  
                    </tr>
                    <tr>
                        <th style="width: 20%">Slot:<br><br><br></th>
                        <td style="width: 80%"><input type='number' name='slot' style="padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px;width: 70%;">
                            <br><br><br></td>  
                    </tr>
                    <tr>

                        <th style="width: 20%">Price:<br><br><br></th>
                        <td style="width: 80%"><input type='text' name='price' style="padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px;width: 70%;">
                            <br><br><br></td>  
                    </tr>
                    <tr>

                        <th style="width: 20%">Transport:<br><br><br></th>
                        <td style="width: 80%"><input type='text' name='transport' style="padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px;width: 70%;">
                            <br><br><br></td>  
                    </tr>
                    <tr>
                        <td colspan="2" style="text-align: center;">
                            <button type="submit" style="background: #03a9f4;
                                    font-size:16px;border-radius: 5px;color: #ffffff;padding: 10px 20px;border: none;"><b>CREATE TOUR</b></button><br><br></td>          
                    </tr>             
                </table>
            </body>
        </div>
        </form>
    </body>
</html>
