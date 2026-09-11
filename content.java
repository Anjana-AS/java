package anjana;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class content {

    public static void main(String[] args) {

        try {
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt");

            int data;

            while ((data = in.read()) != -1) {
                out.write(data);
            }

            in.close();
            out.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
