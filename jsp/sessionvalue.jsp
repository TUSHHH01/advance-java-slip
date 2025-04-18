<!-- <%@ page language="java"%>
<%
String username=request.getParameter("username");
if(username==null) username=" ";
session.setAttribute("username",username);
%>
<html>
    <head>
        <title>Name saved</title>
    </head>
    <body>
        <p><a href="sessionSaved.jsp">Next page to view the session value</a></p>
    </body>
</html> -->


<%@ page language="java"%>
<%
  String username=request.getParameter("username");
  if(username==null);
  username="";
  session.setAttribute("username",username);
%>
<html>
    <head>
        <title>
            Name Saved
        </title>
    </head>
    <body>
        <p>
            <a href="sessionSaved.jsp">
                <%!=username%>Next
            </a>
        </p>
    </body>
</html>