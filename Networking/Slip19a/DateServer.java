import java.net.*;
import java.io.*;
import java.util.*;

class DateServer{
    public static void main(String args[])throws Exception{
        SeverSocket s=new SeverSocket(1000);

        while(true){
            System.out.println("Waiting For Conneciton...");
            Socket sc=s.accept();
            System.out.println("Connection Done...");

            DataOutputStream out=new DataOutputStream(sc.getOutputStream());
            out.writeBytes("Server Date:" +(new Date()).toString() +"\n");

            out.close();
            sc.close();
        }
    }
}