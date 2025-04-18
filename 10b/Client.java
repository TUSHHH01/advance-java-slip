import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    private static Socket socket;

    public static void main(String[] args) {
        try {
            String host = "localhost";
            int port = 25000;
            InetAddress address = InetAddress.getByName(host);
            socket = new Socket(address, port);

            // Send message to server
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            String sendMessage = sc.nextLine();
            bw.write(sendMessage + "\n"); // Send the user input to the server
            bw.flush();
            System.out.println("Message sent to the Server: " + sendMessage);

            // Get the return message from the server
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String message = br.readLine();
            System.out.println("Factorial received from the server: " + message);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Closing the socket
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
