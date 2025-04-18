import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServeltException{
        PrintWriter out=res.getWriter();
    }
}