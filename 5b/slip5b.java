// Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.	

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class slip5b extends HttpServlet{
    Connection cn;
    Statement st;

    public void init(){
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            cn=DriverManager.getConnection("jdbc:odbc:mydsn");
        }
        catch(Exception e){}
    }
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServeltException{
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();

        try{
            st=cn.createStatement();
            ResultSet rs=st.executeQuery("Select * from Product");
            pw.println("<table border=3>");
            pw.println("<th>product code</th>");
            pw.println("<th>product name</th>");
            pw.println("<th>priced</th>");

            while(rs.next()){
                pw.println("<tr>");
                pw.println("<td>" + rs.getInt(1)+ "</td>");
                pw.println("<td>" + rs.getString(2) +"</td>");
                pw.println("<td>" + rs.getInt(3) +"</td>");
            }
        }
        catch(Exception e){}
    }
}
