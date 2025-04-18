//  Write a JSP page, which accepts user name in a text box and greets the user according to the time on server machine. 	(greet.jsp)


<%@ page language="java" %>
<%@ page import="java.util.*" %> 
<html>
    <body>
        <form action="slip7a.jsp" method="post"> 
            Enter your Name: <input type="text" name="t1" value="">
            <input type="submit" name="b1" value="Submit">
        </form>

<%
    String val = request.getParameter("t1");
    if (val != null ) { 
        Date currdate = new Date();
        out.println("<br> Today's Date: " + currdate);
        int hrs = currdate.getHours(); 

        if (hrs < 12)
            out.println("<br> Good Morning, " + val + "!");
        else if (hrs >= 12 && hrs < 17)
            out.println("<br> Good Afternoon, " + val + "!");
        else if (hrs >= 17 && hrs < 20)
            out.println("<br> Good Evening, " + val + "!");
        else
            out.println("<br> Good Night, " + val + "!");
    }
%>
    </body>
</html>
