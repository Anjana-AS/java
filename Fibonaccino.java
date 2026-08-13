package anjanamssc;


import java.util.Scanner;

public class Fibonaccino {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter n: ");
		        int n = sc.nextInt();

		        int first = 0, second = 1;
System.out.println("first " + n + " fibonacci numbers are:");
		        for (int i = 1; i <= n; i++) {
		            System.out.print(first + " ");

		            int next = first + second;
		            first = second;
		            second = next;
		        }

		        sc.close();
		    }
		}