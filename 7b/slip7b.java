// Write a SERVLET program in java to accept details of student (SeatNo, Stud_Name, Class, Total_Marks). Calculate percentage and grade 
// obtained and display details on page.

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class slip7b extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,
    ServeltException{
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        try{
            String s=request.getParameter("marks");
            int m=Integer.parseInt(s);
            //double d=m/5;
            out.println("<html><body><h1>");
            out.println(m);

            if(m>=70)
            out.println("Distinction");
            
            else if(m>=60 && m<70)
            out.println("First Class");

            else if(m>=50 && m<60)
            out.println("Second Class");

            else
            out.println("Fail");

            out.println("</h1></body></html>");
        }
        catch(Exception e){
            out.println(e);
        }
    }
    public void doPost(HttpServletRequest requests,HttpServletResponse response)throws IOException,ServeltException{
        doGet(request,response);
    }
}