<%@ page language="java"%>
<%@ page import="java.util.*;"%>

<html>
    <body>
        <form action="Slip7a.jsp" method="get">
            Enter your Name :<input type="text" name="t1" value="">
            <input type="submit" name="b1" value=" submit">

<%
  String val=request.getParameter("t1");
  if(val!=null)
  {
    Date currdate=new Date();
    out.println("<br> Today's Date :"+currdate);
    int hrs=currdate.getHours();
    if(hrs<12)
     out.println("<br> Good Morning !"+val);
    else if(hrs>11 && hrs<17)
    out.println("<br> Good Afternoon !"+val);
    else if(hrs>16 && hrs<20)
    out.println("<br> Good Evening !"+val);
    else if(hrs>19)
    out.println("<br> Good Night !"+val);

  }
%>
        </form>
    </body>
</html>