package anjanamssc;

import java.util.Scanner;

class Time {
    int hour, minute, second;

    void getTime() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        hour = sc.nextInt();

        System.out.print("Enter minutes: ");
        minute = sc.nextInt();

        System.out.print("Enter seconds: ");
        second = sc.nextInt();
    }

    Time add(Time t) {
        Time result = new Time();

        result.second = this.second + t.second;
        result.minute = this.minute + t.minute + result.second / 60;
        result.second = result.second % 60;

        result.hour = this.hour + t.hour + result.minute / 60;
        result.minute = result.minute % 60;

        return result;
    }

    
    void display() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();

        System.out.println("Enter First Time:");
        t1.getTime();

        System.out.println("Enter Second Time:");
        t2.getTime();

        Time sum = t1.add(t2);

        System.out.println("First Time:");
        t1.display();

        System.out.println("Second Time:");
        t2.display();

        System.out.println("Sum of Times:");
        sum.display();
    }
}