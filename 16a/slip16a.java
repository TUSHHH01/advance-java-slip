// Write a JDBC program for implementation absolute() and relative() methods of ResultSet. Consider Emp table
// Not Complete program
import java.lang.*;
import java.sql.*;

public class slip16a{
    public static void main(String arg[])throws SQLException,ClassNotFoundException{
    try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
    }
    catch(Exception e){}
    }
}