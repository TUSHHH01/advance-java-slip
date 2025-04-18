<!-- <%@ page language="java"%>
<%! String pwd="admin"; %>
<% 
  String username=(String)session.getAttribute("username");
  if(username==null)username="";
%>
<html>
    <body>
<%
        if(username.equals(pwd))
        out.println("Welcome")
        else
             out.println("Wrong Password");
%>
    </body>
</html> -->

<%@ page language="java"%>
<%! String pwd="admin";%>
<%
 String username=(String)session.getAttribute("username");
 if(username==null) username="";
 %>
 <html>
    <head>
        <title>
            Show saved name
        </title>
    </head>
    <body>
        <%
        if(username.equals(pwd))
        out.println("welcome:"+username);
        else
        {
            out.println("wrong password");
        }
        %>
    </body>
 </html>