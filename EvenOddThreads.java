package lab;

import java.util.Scanner;

class EvenThread extends Thread {
    int n;

    EvenThread(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 2; i <= n; i += 2)
            System.out.println("Even: " + i);
    }
}

class OddThread extends Thread {
    int n;

    OddThread(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i += 2)
            System.out.println("Odd: " + i);
    }
}

public class EvenOddThreads {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();

        EvenThread even = new EvenThread(n);
        OddThread odd = new OddThread(n);

        even.start();
        even.join();

        odd.start();
    }
}