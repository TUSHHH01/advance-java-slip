<form method="post" action="Slip17a.jsp">
    Enter Age:<input type="text" name="no">
    <input type="submit" name="submit">
</form>
<%@ page language="java"%>
<%@ page import="java.lang.*"%>
<%@ page import="java.util.*"%>
<% int i=0; %>
<%
  try
  {
    i=Integer.parseInt(request.getParameter("no"));
    if(i>18)
    out.println("you are eligible to vote");
    else
    out.println("you are not eligible to vote");
  }
  catch(Exception e){}
%>