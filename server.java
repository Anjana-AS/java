package anjana;

import java.net.*;
import java.io.*;

public class server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6000);
        System.out.println("Waiting for client...");

        Socket s = ss.accept();

        BufferedReader in = new BufferedReader(
            new InputStreamReader(s.getInputStream()));

        String msg = in.readLine();
        System.out.println("Client says: " + msg);

        s.close();
        ss.close();
    }
}

