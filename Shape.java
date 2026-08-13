package anjanamssc;

import java.util.Scanner;

class Shape {
    void calculate() {
        System.out.println("Shape");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s;

        System.out.print("Enter radius of circle: ");
        s = new Circle(sc.nextDouble());
        s.calculate();

        System.out.print("Enter side of square: ");
        s = new Square(sc.nextDouble());
        s.calculate();

        System.out.print("Enter base and height of triangle: ");
        s = new Triangle(sc.nextDouble(), sc.nextDouble());
        s.calculate();

        System.out.print("Enter radius of sphere: ");
        s = new Sphere(sc.nextDouble());
        s.calculate();

        System.out.print("Enter side of cube: ");
        s = new Cube(sc.nextDouble());
        s.calculate();

        sc.close();
    }
}

class TwoDim extends Shape { }

class ThreeDim extends Shape { }

class Circle extends TwoDim {
    double r;
    Circle(double r) {
        this.r = r;
    }
    void calculate() {
        System.out.println("Area of Circle = " + Math.PI * r * r);
    }
}

class Square extends TwoDim {
    double side;
    Square(double side) {
        this.side = side;
    }
    void calculate() {
        System.out.println("Area of Square = " + side * side);
    }
}

class Triangle extends TwoDim {
    double b, h;
    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }
    void calculate() {
        System.out.println("Area of Triangle = " + 0.5 * b * h);
    }
}

class Sphere extends ThreeDim {
    double r;
    Sphere(double r) {
        this.r = r;
    }
    void calculate() {
        System.out.println("Surface Area = " + 4 * Math.PI * r * r);
        System.out.println("Volume = " + (4.0 / 3) * Math.PI * r * r * r);
    }
}

class Cube extends ThreeDim {
    double side;
    Cube(double side) {
        this.side = side;
    }
    void calculate() {
        System.out.println("Surface Area = " + 6 * side * side);
        System.out.println("Volume = " + side * side * side);
    }
}