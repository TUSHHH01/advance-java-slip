import java.sql.*;
import java.net.*;
class SLip14b{
     static Connection cn;
     static Statement stmt;

    public static void main(String args[]){
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            cn=DriverManager.getConnection("jdbc:odbc:mydsn");
            stmt=cn.createStatement();
            // stmt.addBatch("Create table test2(roll_no number,name text(10),dept varchar(10),sal number)");
            // System.out.println("Table create");
            stmt.addBatch("insert into  test2(4,'Renu','Finance',15000)");
            stmt.addBatch("insert into  test2(5,'Anuja','Marketing',18900)");
            stmt.addBatch("insert into  test2(6,'Tanuja','HR',234569)");
            stmt.addBatch("insert into  test2(7,'Suresh','HR',40000)");
            // stmt.addBatch("update emp set name='Mahesh' where eno=1 ");
            // System.out.println("Table updated.");

            int[] result=stmt.executeBatch();
            for(int i=0;i<result.length;i++)
            {
                System.out.println(result[i]);
            }
            stmt.close();
            cn.close();
        }
        catch(BatchUpdateException e)
        {
            int[] count=e.getUpdateCounts();
            for(int i=0;i<count.length;i++)
            {
                System.out.println(count[i]);
            }
        }
        catch(Exception e)
        {
            System.out.println("err");
        }
    }
}