import java.sql.*;
public class Slip20a{
    public static void main(String [] args)
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con= DriverManager.getConnection("jdbc:odbc:mydsn");
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery("Select eno from emp");
            int n=0;
            while(rs.next())
            {
                n++;

            }
            System.out.println("Total Record"+n);
        }catch(Exception e){}
    }
}