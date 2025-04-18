// Write a JDBC program to count the number of records in table. (Without using standard method)

import java.sql.*;

public class slip20a {
    public static void main(String[] args) {
        try{
            Class.forName("sun.jdbc.odbc.Jdbc Odbc Driver");
            Connection con = DriverManager.getConnection("jdbc:Odbc:mydsn");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select empno from emp");

            int n=0;
            while (rs.next()) 
            {
                n++;
                
            }
            System.out.println("Total Record");

        }
        catch(Exception e){}
    }
}