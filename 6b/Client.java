import java.io.*;
import java.net.*;

public class Client {

    private Socket msock;
    private DataInputStream mdin;
    private DataOutputStream mdout;

    public Client(InetAddress addr, int port) {
        try {
            msock = new Socket(addr, port);
            mdin = new DataInputStream(msock.getInputStream());
            mdout = new DataOutputStream(msock.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Client cli = new Client(InetAddress.getLocalHost(), 2000);
            cli.talk();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public void talk() {
        String msg = "";
        try {
            BufferedReader dink = new BufferedReader(new InputStreamReader(System.in)); // Changed DataInputStream to BufferedReader for reading from the console
            while (true) {
                System.out.print("Client: ");
                msg = dink.readLine();
                mdout.writeUTF(msg);
                mdout.flush();
                System.out.println("Server: " + mdin.readUTF());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
