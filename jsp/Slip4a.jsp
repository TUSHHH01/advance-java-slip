<html>
    <body>
    <form action="Slip4a.jsp" method="get">
        Enter a number :<input type="text" name="num", value="">
        <input type="submit" name="calculate" value="calculate">
</form>
</body>
</html>

<%@ page language="java"%>
<%! int temp,n,sum=0,mod=0;%>
<%
   try
   {
    n=Integer.parseInt(request.getParameter("num"));
    temp=n;
    while(temp!=0)
    {
        mod=temp%10;
        sum=sum+(mod*mod*mod);
        temp=temp/10;
    }
    if(sum==n)
    {
        out.println("Armstrong number");
        sum=0;
    }
    else{
        out.println("not an Armstrong number");
        sum=0;
    }
}
    catch(Exception e){}
   
%>