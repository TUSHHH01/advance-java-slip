<html>
    <body>
        <form action="Slip8a.jsp" method="get">
            Enter any Number :<input type="text" name="name">
            <input type="submit" name="submit" value="calculate">

        </form>
    


<%@ page language="java"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<font color="red" size="18">
    <%! int n=0,rem=0,r=0;%>
    <%
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