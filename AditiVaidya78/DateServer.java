import java.net.*;
import java.io.*;
import java.util.*;

class DateServer{
    public static void main(String args[]) throws Exception
    {
        ServerSocket s=new ServerSocket(1000);
        while(true){
            System.out.println("Waiting for Connection....");
            Socket soc=s.accept();
            System.out.println("Connection done...");
            DataOutputStream out=new DataOutputStream(soc.getOutputStream());
            out.writeBytes("Server date"+ (new Date()).toString()+"\n");
            out.close();
            soc.close();
        }
    }
}