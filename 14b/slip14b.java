// Write a program to execute a batch of SQL statements in Java.

import java.sql.*;

class slip4b {
    static Connection cn;
    static Statement stmt;

    public static void main(String[] args) {
        try {
            // Use correct driver or switch to a specific JDBC driver for your database
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); // Deprecated, use a specific driver instead
            
            // Ensure your ODBC DSN 'mydsn' is correctly configured
            cn = DriverManager.getConnection("jdbc:odbc:mydsn");
            stmt = cn.createStatement();
            
            // Uncomment and correct the SQL statements to fit your database schema
            // stmt.addBatch("CREATE TABLE test1(roll_no NUMBER, name VARCHAR(10))");
            // stmt.addBatch("INSERT INTO emp VALUES(12, 'Renu', 'Finance', 15000)");
            
            // Adding batch statements
            stmt.addBatch("UPDATE emp SET ename = 'Mahesh' WHERE empno = 4");
            stmt.addBatch("INSERT INTO emp VALUES(3, 'Anuja', 'Mktg', 30000)");
            stmt.addBatch("INSERT INTO emp VALUES(15, 'Tanuja', 'HR', 30000)");
            stmt.addBatch("INSERT INTO emp VALUES(10, 'Suraj', 'HR', 40000)");

            System.out.println("Executing batch updates...");

            // Execute the batch of SQL statements
            int[] result = stmt.executeBatch();

            // Display the result of each batch execution
            for (int i = 0; i < result.length; i++) {
                System.out.println("Update " + (i + 1) + ": " + result[i] + " rows affected.");
            }

            // Close the statement and connection
            stmt.close();
            cn.close();
        } 
        catch (BatchUpdateException e) 
        {
            int[] count=e.getUpdateCounts();
            for(int i=0;i<count.length;i++)
            {
                System.out.println(count[i]);
            }
        } catch (Exception e) 
        {
            e.printStackTrace(); // Print stack trace for better error visibility
        }
    }
}



// // Vaidya code
// import java.sql.*;
// class slip14b{
//      static Connection cn;
//      static Statement stmt;

//     public static void main(String args[]){
//         try
//         {
//             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//             cn=DriverManager.getConnection("jdbc:odbc:mydsn");
//             stmt=cn.createStatement();
//             // stmt.addBatch("Create table test2(roll_no number,name text(10),dept varchar(10),sal number)");
//             // System.out.println("Table create");
//             stmt.addBatch("insert into  test2(4,'Renu','Finance',15000)");
//             stmt.addBatch("insert into  test2(5,'Anuja','Marketing',18900)");
//             stmt.addBatch("insert into  test2(6,'Tanuja','HR',234569)");
//             stmt.addBatch("insert into  test2(7,'Suresh','HR',40000)");
//             // stmt.addBatch("update emp set name='Mahesh' where eno=1 ");
//             // System.out.println("Table updated.");

//             int[] result=stmt.executeBatch();
//             for(int i=0;i<result.length;i++)
//             {
//                 System.out.println(result[i]);
//             }
//             stmt.close();
//             cn.close();
//         }
//         catch(BatchUpdateException e)
//         {
//             int[] count=e.getUpdateCounts();
//             for(int i=0;i<count.length;i++)
//             {
//                 System.out.println(count[i]);
//             }
//         }
//         catch(Exception e)
//         {
//             System.out.println("err");
//         }
//     }
// }