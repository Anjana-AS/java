package anjana;

import java.net.*;
import java.io.*;
import java.util.*;
public class client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 6000);
        Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader(
            new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(
            s.getOutputStream(), true);
        while (true) {
            System.out.print("Client: ");
            String msg = sc.nextLine();
            out.println(msg);
            if (msg.equalsIgnoreCase("exit")) {
                break;
            }
            String reply = in.readLine();
            System.out.println("Server: " + reply);
            if (reply.equalsIgnoreCase("exit")) {
                break;
            }
        }
        s.close();
        sc.close();
    }
}
