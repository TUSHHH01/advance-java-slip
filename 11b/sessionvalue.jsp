<!-- Write a JSP script to accept username, store it into the session, compare it with password in another jsp file,
if username matches with password then display appropriate message in html file.		[25]
(inputform.jsp, sessionvalue.jsp, sessionsaved.jsp) -->

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

<!-- save file as sessionvalue -->
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
            <a href="sessionsaved.jsp"><%=username%>Next%>Next page to view the session value</a>            
        </p>
    </body>
</html>