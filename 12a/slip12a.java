// Q.12a. Write a java program to create Teacher table (TNo. TName, Sal, Desg) and insert a record in it. 

import java.io.*;
import java.sql.*;

public class slip12a 
{

    static Connection cn;
    static Statement st;

    public static void main(String[] args) 
    {
        try 
        {
            int tno, sal;
            String tname, desg;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Class.forName("sun.jdbcOdbcDriver");
            cn = DriverManager.getConnection("jdbc:odbc:mydsn");
            st = cn.createStatement();
            /*String str = "crate table Teacher(TNo number,Tname varchar(20),Sal number , Desg varchar(20))";
                int i = st.executeUpdate(str);
                System.err.println("Table Craeted " + i);*/

            System.out.println("Enter tno");
            tno = Integer.parseInt(br.readLine());
            System.out.println("Enter Tname");
            tname = br.readLine();
            System.out.println("Enetr sal");
            sal = Integer.parseInt(br.readLine());
            System.out.println("Enter Desg");
            desg = br.readLine();
            int i = st.executeUpdate("insert into Teacher values(" + tno + ",'" + tname + "'," +sal+ ",'" + desg + "')");
            System.out.println("Record added successfully" + 1);
            cn.close();
        }
        catch (Exception e) {}
    }
}
