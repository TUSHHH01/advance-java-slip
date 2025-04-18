<!-- <%@ page language="java"%>
<html>
    <head>
        <title>
            Name Input Form
        </title>
    </head>
    <body>
        <form method="post" action="http://localhost:9090/sessionvalue.jsp" style="" disabled>
        <p><b>Enter Your Name :</b></p>
        <input type="text" name="username" autocomplete="off"><br>
        <input type="submit" value="submit">
        </form>
    </body>
</html> -->

<%@ page language="java"%>
<html>
    <title>Name Input form</title>
    <body>
        <form method="post" action="sessionvalue.jsp">
            <p><b>Enter Your Name:</b></p>
            <input type="text" name="username">
            <input type="submit" value="submit">
            

        </form>
    </body>
</html>