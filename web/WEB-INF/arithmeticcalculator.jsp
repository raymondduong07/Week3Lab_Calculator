<%-- 
    Document   : arithmeticcalculator
    Created on : 23-Sep-2020, 11:22:59 AM
    Author     : rayfi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="number" name="first" value="${first}"><br>
            Second: <input type="number" name="second" value="${second}"><br>
            <input type="submit" name="submit" value="+">
            <input type="submit" name="submit" value="-">
            <input type="submit" name="submit" value="*">
            <input type="submit" name="submit" value="%"><br><br>
            Result: ${answer}
            <br><a href="age">Age Calculator</a>
        </form>
    </body>
</html>
