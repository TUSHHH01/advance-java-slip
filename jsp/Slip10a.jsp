<%@ page language="java"%>
<%!int n=0,flag=0;%>
<% if(request.getParameter("t1")!=null)
{
    String s1=request.getParameter("t1");
    for(int i=0;i<s1.length();i++)
    {
        if(s1.charAt(i)=='@')
        {
            flag ++;

        }
    }
    if(flag==0 ||flag>1)
    {
        out.println("Invalid mail ID");
        flag=0;
    }
    else
    out.println("valid mail ID");
}

%>

<html>
    <body>
        <form action="Slip10a.jsp" method="get">
            Enter Email Id:<input type="text", name="t1">
            <input type="submit" name="submit" value="submit">


        </form>
    </body>
</html>