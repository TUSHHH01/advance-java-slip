// Write a JDBC program to remove “percentage” column from student (rno, sname, percentage) table. 

import java.sql.*;
class slip16b
{
    public static void main(String args[])
    {
        try
        {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
          Statement st=con.createStatement();
          st.executeUpdate("alter table student drop percentage");
          System.out.println("Percentage Column deleted");
          con.close();
        }
        catch(Exception e){e.printStackTrace();}
    }
}