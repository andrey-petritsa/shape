package main.prodecure;

public class Geometry {
    public double area(Object shape) {
        if (shape instanceof Square) {
            Square s = (Square)shape;
            return s.side * s.side;
        }
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle)shape;
            return r.height * r.width;
        }
        if (shape instanceof Circle) {
            Circle c = (Circle)shape;
            return c.radius * 3.14;
        }

        return -1;
    }
}
