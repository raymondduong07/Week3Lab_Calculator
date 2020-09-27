<%-- 
    Document   : agecalculator
    Created on : 23-Sep-2020, 10:20:11 AM
    Author     : rayfi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="number" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">
            <p>${error}<p>
            <p>${display}<p>
        </form>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
