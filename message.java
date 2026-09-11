package anjana;

import java.util.Scanner;

class MessageTooLargeException extends Exception {
    public MessageTooLargeException(String message) {
        super(message);
    }
}

public class message {

    static void take(String str) throws MessageTooLargeException {
        if (str.length() > 10) {
            throw new MessageTooLargeException("message too large");
        }

        System.out.println("Message accepted");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String str = sc.nextLine();

        try {
            take(str);
        } catch (MessageTooLargeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
