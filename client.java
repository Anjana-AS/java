package anjana;

import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try {
            // Connect to server
            Socket socket = new Socket("localhost", 5000);

            // Send message to server
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            // Read response from server
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            out.println("Hello Server!");

            String response = in.readLine();
            System.out.println("Server says: " + response);

            // Close connection
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
