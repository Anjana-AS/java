package lab;

import java.util.Scanner;

interface MyShape {
    void calculate();
}

abstract class TwoDimension implements MyShape {}
abstract class ThreeDimension implements MyShape {}

class MyCircle extends TwoDimension {
    double r;
    MyCircle(double r) { this.r = r; }
    public void calculate() {
        System.out.println("Circle Area = " + Math.PI * r * r);
    }
}

class MySquare extends TwoDimension {
    double s;
    MySquare(double s) { this.s = s; }
    public void calculate() {
        System.out.println("Square Area = " + s * s);
    }
}

class MyTriangle extends TwoDimension {
    double b, h;
    MyTriangle(double b, double h) { this.b = b; this.h = h; }
    public void calculate() {
        System.out.println("Triangle Area = " + 0.5 * b * h);
    }
}

class MySphere extends ThreeDimension {
    double r;
    MySphere(double r) { this.r = r; }
    public void calculate() {
        System.out.println("Surface Area = " + 4 * Math.PI * r * r);
        System.out.println("Volume = " + (4.0 / 3) * Math.PI * r * r * r);
    }
}

class MyCube extends ThreeDimension {
    double s;
    MyCube(double s) { this.s = s; }
    public void calculate() {
        System.out.println("Surface Area = " + 6 * s * s);
        System.out.println("Volume = " + s * s * s);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyShape x;

        System.out.print("Circle radius: ");
        x = new MyCircle(sc.nextDouble());
        x.calculate();

        System.out.print("Square side: ");
        x = new MySquare(sc.nextDouble());
        x.calculate();

        System.out.print("Triangle base height: ");
        x = new MyTriangle(sc.nextDouble(), sc.nextDouble());
        x.calculate();

        System.out.print("Sphere radius: ");
        x = new MySphere(sc.nextDouble());
        x.calculate();

        System.out.print("Cube side: ");
        x = new MyCube(sc.nextDouble());
        x.calculate();

        sc.close();
    }
}