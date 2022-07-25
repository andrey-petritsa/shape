package main.oop;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public double area() {
        return this.width * this.height;
    }
}
