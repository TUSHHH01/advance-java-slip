import java.net.*;
import java.io.*;

public class Client{
    private Socket mSock;
    DataInputStream mdin;
    DataOutputStream mdout;


    public Client(InetAddress addr,int Port){
        try{
            mSock=new Socket(addr,Port);
            mdin=new DataInputStream(mSock.getInputStream());
            mdout=new DataOutputStream(mSock.getOutputStream());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        try{
            Client cli=new Client(InetAddress.getLocalHost(),2000);
            cli.talk();
        }
        catch(UnknownHostException e){
            e.printStackTrace();
        }
    }
    public void talk(){
        String msg=new String(" ");

        while(true){
            try{
                DataInputStream dink=new DataInputStream(System.in);
                msg=new String(dink.readLine());
                mdout.writeUTF(msg);
                System.out.println(mdin.readUTF());
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}