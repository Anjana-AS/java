package anjanamssc;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt(), rev = 0, temp = num;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        System.out.println("Reversed Number = " + rev);
        System.out.println(num == rev ? "Palindrome" : "Not a Palindrome");

        sc.close();
    }
}