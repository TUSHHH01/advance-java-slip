import java.io.*;
import java.net.*;
import java.net.Socket;
import java.net.SeverSocket;

public class Server{
    private static Socket socket;
    
    public static void main(String[] args){
        try{
            int port=25000;
            SeverSocket severSocket=new SeverSocket(port);
            System.out.println("Server started and listening to the port 25000");

            //server is running always this is done using this while(true)loop
            while(true){
                //Reading the message from the client
                socket=serverSocket.accept();
                BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String number=br.readLine();
                System.out.println("Message received from client is :" +number);

                //calculating the factorial and forming the returing message
                String returnMessage;
                try{
                    int numberInIntFormat=Integer.parseInt(number);
                    int returnValue=1;
                    
                    for(int i=numberInIntFormat;i>=1;i--)
                    retrunValue=returnValue*i;
                    returnMessage=String valueOf(returnValue)+"\n";
                }
                catch(NumberFormatException e){
                    returnMessage="Please send a proper number \n";
                }

                //sending the response back to the client
                OuputStream os=socket.getOutputStream();
                OutputStreamWriter osw=new outputStreamWriter(os);
                BufferedWriter bw=new BufferedWriter(osw);
                bw.write(returnMessage);
                System.out.println("Factorial sent to the client is :" +returnMessage);
                bw.flush();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                socket.close();
            }
            catch(Exception e){}
        }
    }
}