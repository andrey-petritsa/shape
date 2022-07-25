package main.prodecure;

public class ProcedureMain {
    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        Circle circle = new Circle();
        circle.radius = 50;

        double area = geometry.area(circle);
        System.out.println(area);
    }
}
