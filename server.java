package anjana;

import java.net.*;
import java.io.*;
import java.util.*;
public class server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6000);
        System.out.println("Waiting for client...");
        Socket s = ss.accept();
        System.out.println("Client connected!");
        Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader(
            new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(
            s.getOutputStream(), true);
        while (true) {
            String msg = in.readLine();
            System.out.println("Client: " + msg);
            if (msg.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Server: ");
            String reply = sc.nextLine();
            out.println(reply);
            if (reply.equalsIgnoreCase("exit")) {
                break;
            }
        }
        s.close();
        ss.close();
        sc.close();
    }
}
