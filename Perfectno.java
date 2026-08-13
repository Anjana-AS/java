package anjanamssc;


import java.util.Scanner;
public class Perfectno {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (0 to exit): ");
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("Program exited.");
                break;
            }

            int sum = 0;


            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }

            if (sum == n) {
                System.out.println(n + " is a Perfect number");
            } else if (sum > n) {
                System.out.println(n + " is an Abundant number");
            } else {
                System.out.println(n + " is a Deficient number");
            }
        }

        sc.close();

	}
}