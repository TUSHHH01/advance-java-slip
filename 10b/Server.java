import java.io.*;
import java.net.*;

public class Server {
    private static Socket socket;

    public static void main(String[] args) {
        try {
            int port = 25000;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server started and listening on port 25000");

            // Server is running always; this is done using a while(true) loop
            while (true) {
                // Reading the message from the client
                socket = serverSocket.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String number = br.readLine();
                System.out.println("Message received from client is: " + number);

                // Calculating the factorial and forming the returning message
                String returnMessage;
                try {
                    int numberInIntFormat = Integer.parseInt(number);
                    int returnValue = 1;

                    for (int i = numberInIntFormat; i >= 1; i--)
                        returnValue = returnValue * i;

                    returnMessage = String.valueOf(returnValue) + "\n";
                } catch (NumberFormatException e) {
                    returnMessage = "Please send a proper number \n";
                }

                // Sending the response back to the client
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(returnMessage);
                System.out.println("Factorial sent to the client is: " + returnMessage);
                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
