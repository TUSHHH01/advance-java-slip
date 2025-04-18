import java.net.*;
import java.io.*;

public class Server{
    private SeverSocket mServerSock;
    private Socket mSock;

    public Server(){
        try{
            mServerSock=new SeverSocket(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        Server mserv=new Server();
        mserv.talk();
    }
    public void talk(){
        try{
            mSock=mServerSock.accept();
            System.out.println("Waiting for request");
            DataInputStream din=new DataInputStream(mSock.getInputStream());
            DataOutputStream dos=new DataOutputStream(mSock.getOutputStream());
            DataInputStream dink=new DataInputStream(System.in);

            while(true){
                System.out.println(din.readUTF());
                dos.writeUTF(dink.readLine());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}