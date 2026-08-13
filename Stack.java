package anjanamssc;

import java.util.Scanner;
class Stack {
    int a[], top = -1;
    Stack(int n) {
        a = new int[n];
    }
    void push(int x) {
        if (top == a.length - 1)
            System.out.println("Overflow");
        else
            a[++top] = x;
    }
    void pop() {
        if (top == -1)
            System.out.println("Underflow");
        else
            System.out.println("Popped: " + a[top--]);
    }
    void display() {
        if (top == -1)
            System.out.println("Empty");
        else {
            for (int i = top; i >= 0; i--)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in stack: ");
        int n = sc.nextInt();
        Stack s = new Stack(n);
        int ch;
        do {
            System.out.print("\n1.Push 2.Pop 3.Display 4.Exit\nChoice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Element: ");
                    s.push(sc.nextInt());
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("Program Exited");
                    break;
            }
        } while (ch != 4);
        sc.close();
    }
}