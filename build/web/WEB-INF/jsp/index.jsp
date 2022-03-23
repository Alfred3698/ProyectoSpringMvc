<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <form action="holaMundo.jsp" method="post">
            <h3>¿Cuál es tu nombre?</h3>
            <input type="text" name="nombre" value=""><br>
            <h3>¿cuál es tu apellido?</h3> 
            <input type="text" name="apellido" value=""><br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
