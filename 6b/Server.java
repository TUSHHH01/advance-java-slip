// Write a Socket program in java for simple stand alone chatting application 

import java.io.*;
import java.net.*;

public class Server {

    private ServerSocket mServersock;
    private Socket msock;

    public Server() {
        try {
            mServersock = new ServerSocket(2000); // Corrected the variable name
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server mserv = new Server();
        mserv.talk();
    }

    public void talk() {
        try {
            msock = mServersock.accept(); // Corrected the variable name
            System.out.println("Waiting for Request");
            DataInputStream din = new DataInputStream(msock.getInputStream());
            DataOutputStream dos = new DataOutputStream(msock.getOutputStream());
            BufferedReader dink = new BufferedReader(new InputStreamReader(System.in)); // Changed DataInputStream to BufferedReader for reading from the console

            while (true) {
                System.out.println("Client: " + din.readUTF());
                System.out.print("Server: ");
                dos.writeUTF(dink.readLine());
                dos.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
