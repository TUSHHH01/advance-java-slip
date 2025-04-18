// Write a Socket program in java which displays the server machine’s date and time on the client machine.  

import java.io.*;
import java.net.*;
import java.util.*;

class DateServer {
    public static void main(String args[]) throws Exception {
        // Corrected the class name from 'SeverSocket' to 'ServerSocket'
        ServerSocket serverSocket = new ServerSocket(1000);

        while (true) {
            System.out.println("Waiting for connection...");
            Socket socket = serverSocket.accept();  // Wait for client connection
            System.out.println("Connection established...");

            // Sending date and time to the client
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeBytes("Server Date: " + (new Date()).toString() + "\n");

            // Closing streams and socket
            out.close();
            socket.close();
        }
    }
}
