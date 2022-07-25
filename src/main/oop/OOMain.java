package main.oop;


public class OOMain {
    public static void main(String[] args) {
        Square s = new Square(25);
        ShapeService service = new ShapeService();
        service.doSomething(s);
    }
}
