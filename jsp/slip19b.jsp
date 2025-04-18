<%@ page language="java"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%
 Connection con; 
 PreparedStatement pst;
 Statement st;
 ResultSet rs;
 try
 {
 int acno=Integer.parseInt(request.getParameter("acno"));
 String typ=request.getParameter("typ");
 int bal=Integer.parseInt(request.getParameter("bal"));
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 con=DriverManager.getConnection("jdbc:odbc:mydsn");
 pst=con.prepareStatement("insert into account values(?,?,?)");
 pst.setInt(1,acno);
 pst.setString(2,typ);
 pst.setInt(3,bal);
 pst.executeUpdate();
 st=con.createStatement();
  rs=st.executeQuery("select * from account");
%>
<table border="1">
    <tr>
        <td>ACCOUNT NO</td>
        <td>TYPE</td>
        <td>BALANCE</td>
    </tr>
    <%
    while(rs.next())
    {
    %>
    <tr>
        <td><%=rs.getInt(1) %></td>
        <td><%=rs.getString(2) %></td>
        <td><%=rs.getInt(3) %></td>
    </tr>
    <% } %>
</table>
<% 
st.close();
pst.close();
con.close();
%>
<%
}
catch(Exception e)
{
    out.println(e.getMessage());
}
 
%>