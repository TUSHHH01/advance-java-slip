<!-- Write a JSP program to calculate sum of first and last digit of a given number. Display sum in Red Color with font size 18.   -->

<html>
    <body>
        <form action="slip8a.jsp" method="get">    <!-- action= http://localhost:9090/slip8a.jsp -->
            Enter any Number :<input type="text" name="name">
            <input type="submit" name="submit" value="calculate">

        </form>
    


<%@ page language="java"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<font color="red" size="18">
    <%! int n=0,rem=0,r=0;%>
    <%
    String message = "Be Happy";
    out.print(message);
    try
    {
        n=Integer.parseInt(request.getParameter("name"));
        if(n<10)
        {
            out.println("Sum of digit of first and last number is :"+n);

        }
        else
        {
            rem=n%10;
            do
            {
                r=n%10;
                n=n/10;
            }while(n>0);
            n=rem+r;
            out.println("Sum of digit of first and last number is :"+n);
        }
    }
    catch(Exception e){}
%>
</font>
</body>
</html>