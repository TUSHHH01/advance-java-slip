import java.lang.*;
import java.sql.*;
import java.util.*;

public class Slip16a{
    public static void main(String arg[])throws SQLException,ClassNotFoundException{
    try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
    }
    }
}