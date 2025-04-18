// Write a Socket program in java which displays the server machine’s date and time on the client machine.  

import java.io.*;
import java.net.*;

class DateClient{
    public static void main(String args[])throws Exception{
        //Socket sc=new Socket(InetAddress.getLocalHost(),1000);
        Socket sc=new Socket("localhost",1000);
        BufferedReader in=new BufferedReader(new InputStreamReader(sc.getInputStream()));
        System.out.println(in.readLine());
    }
}