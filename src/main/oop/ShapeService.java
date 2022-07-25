package main.oop;

//Shape является плагином для ShapeService
public class ShapeService {
    public void doSomething(Shape shape) {
        System.out.println(shape.area());
    }
}
