// Write a JDBC program to accept the details of customer (CID, CName, Address, Ph_No) and store it into the database (Use PreparedStatement interface	
import java.io.*;
import java.sql.*;

public class slip4b {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pst = null;
        int i;
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:mydsn");
            pst = con.prepareStatement("insert into custom values (?,?,?,?)");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            i = 0;
            for (int j = 1; j <= 2; j++) {
                System.out.println("Enter id:");
                int cid = Integer.parseInt(br.readLine());
                System.out.println("Enter cname:");
                String cname = br.readLine();
                System.out.println("Enter address:");
                String addr = br.readLine();
                System.out.println("Enter phno:");
                double phno = Double.parseDouble(br.readLine());

                pst.setInt(1, cid);
                pst.setString(2, cname);
                pst.setString(3, addr);
                pst.setDouble(4, phno);
                i = pst.executeUpdate();
                System.out.println(" " + i);

            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}