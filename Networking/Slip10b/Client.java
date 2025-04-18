import java.util.scanner;
import java.io.*;
import java.net.*;

public class Client{
    private static Socket socket;

    public static void main(Stirng args[]){
        try{
            String host="localhost";
            int port=25000;
            InetAddress address=InetAddress.getByName(host);
            Socket=new Socket(address.port);

            //send message to server
            BurfferedWriter bw-new BufferedWriter(new outputStream(socket.getOuptutStream()));

            Scanner sc=new Scanner(System.in);
            bw.write(sendMessage);
            bw.flush();
            System.out.println("Message sent to the Server: " +sendMessage);

            //get the return message form the server
            InputStream is =socket.getInputStream();
            InputStreamReader isr=new InputStreamREader(is);
            BufferedReader br= new BufferedReader(isr);
            Stirng message=br.readLine();
            System.out.println("Factorial reaceived form the server :" +message);
            }
            catch(Excepiton e){
                e.printStackTrace();
            }
            finally{
                //clsing the socket
                try{
                    socket.close();
                }
                catch(Excepiton e){
                    e.printStackTrace();
                }
            }
    }
}