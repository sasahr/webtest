<%-- 
    Document   : calculator
    Created on : May 25, 2019, 5:28:26 PM
    Author     : Sale
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<!DOCTYPE html>
<html>
    <head>
        <style type="text/css">
            #prvibroj{
                margin-left: 15px;
            }
            #body1{
                background: yellow;
            }
            #label{
                margin-left: 270px;            }
            #deljenje{
                margin-left: 350px;
            }
            #oduzimanje{
                margin-left: 350px;
            }
            #mnozenje{
                margin-left: 350px;
            }
            #sabiranje{
                margin-left: 350px;
            }
            #footer1{
                margin-top: 700px;
            }
            .error{
                color: red;
            }
            #div2{
                 position: fixed;
                width: 700px;
                height: 600px;
                margin-left: 1000px;;
                padding-top: 300px;
            }
            
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>calculator</title>
    </head>
    <body id="body1">
        <div id="div2"> <img src="ajnstajn.jpg" alt="slika">   </div>
        <div>
        <form:form action="calculator.htm" method="post" commandName="racunanje">
            <label  >UNESI PRVI BROJ:</label>
            <form:input path="prvibroj"id="prvibroj"  ></form:input>
            <br>
            <label >UNESI DRUGI BROJ:</label>
            <form:input path="drugibroj" id="drugibroj" ></form:input>
            <br>
            <input type="submit" value="izracunaj" name="izracunaj">
            <label id="label" >IZABERI OPERACIJU:</label><br>
            <form:radiobutton id="sabiranje" path="poruka" name="radio"value="sabiranje" label="SABIRANJE" checked="checked" ></form:radiobutton><br>
            <form:radiobutton id="oduzimanje" path="poruka" name="radio"value="oduzimanje" label="ODUZIMANJE"></form:radiobutton> <br>
            <form:radiobutton id="mnozenje" path="poruka" name="radio"value="mnozenje" label="MNOZENJE"></form:radiobutton><br>
            <form:radiobutton id="deljenje" path="poruka" name="radio"value="deljenje" label="DELJENJE"></form:radiobutton>
           
        </form:form>
            <textarea readonly cols="35">${res}${greska}</textarea>
            
            <footer id="footer1"><a href="index.htm">HOME PAGE</a></footer>
           
            </div>
            
    </body>
</html>
 