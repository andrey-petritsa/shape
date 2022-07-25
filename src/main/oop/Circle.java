package main.oop;

public class Circle implements Shape {
    private double radius;

    public double area() {
        return this.radius * 3.14;
    }
}
