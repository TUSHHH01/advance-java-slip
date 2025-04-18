// Q.2b. Write a JDBC program to delete the records of employees whose names are starting with ‘A’ character.

import java.sql.*;

public class slip2b 
{
    public static void main(String[] args)
    {
        try 
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:Microsoft Access Driver");
            System.out.println("Conn Done");
            Statement st = con.createStatement();
            int i = st.executeUpdate("DELETE FROM emp WHERE ename LIKE 'A%'");
            System.out.println(" record(s) deleted.");
            System.out.println(i);
            ResultSet rs = st.executeQuery("SELECT * FROM emp");
            while (rs.next()) 
            {
                System.out.print(" " + rs.getInt(1));  // Assuming the first column is an integer
                System.out.println(rs.getString(2));   // Assuming the second column is a string (ename)
                System.out.println(rs.getString(3));   // Assuming the third column is another string
                System.out.println(rs.getInt(4));      // Assuming the fourth column is an integer
            }

            rs.close();
            con.close();

        } 
        catch (Exception e) {        }
    }
}
