package oop;


interface Shape {
    float getArea();
}

class Triangle implements Shape {
    float a;
    float h;
    float con = 0.5F;

    Triangle(float a, float h) {
        this.a = a;
        this.h = h;
    }

    public float getArea() {
        return a * h * con;
    }
}

class Square implements Shape {
    float a;
    Square(float a) {
        this.a = a;
    }

    public float getArea() {
        return a*a;
    }
}

class Rectangle implements Shape {
    float a;
    float b;
    Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getArea() {
        return a*b;
    }
}

class Circle implements Shape {
    float r;
    float pi = (float) Math.PI;
    Circle(float r) {
        this.r = r;
    }

    public float getArea() {
        return pi*r*r;
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle anyTriangle = new Triangle(20, 10);
        System.out.println(anyTriangle.getArea());
        Square anySquare = new Square(30);
        System.out.println(anySquare.getArea());
        Rectangle anyRectangle = new Rectangle(40, 10);
        System.out.println(anyRectangle.getArea());
        Circle anyCircle = new Circle(15);
        System.out.println(anyCircle.getArea());
    }
}