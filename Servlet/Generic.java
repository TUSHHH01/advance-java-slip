import java.io.*;
import javax.servlet.*;

public class First extends GenericServlet{
    pubic void Service(ServletRequest req, ServletResponse res)throws IOException,ServeltException{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("<html><body>");
        out.println("<p>Hello Generic Servlet</p>");
        out.prinltn("</body></html>");
    }
}