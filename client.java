package anjana;

import java.net.*;
import java.io.*;
import java.util.*;

public class client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 6000);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter message: ");
        String msg = sc.nextLine();

        PrintWriter out = new PrintWriter(
            s.getOutputStream(), true);

        out.println(msg);

        s.close();
        sc.close();
    }
}
