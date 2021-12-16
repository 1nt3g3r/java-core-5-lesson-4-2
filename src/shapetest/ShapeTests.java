package shapetest;

import modifiers.Circle;
import modifiers.Quad;
import modifiers.Shape;

public class ShapeTests {
    public static void main(String[] args) {
        Object[] objects = {
                new Quad(10),
                new Circle(),
                new Object()
        };

        System.out.println("objects[0] instanceof Shape = " + (objects[0] instanceof Shape));
        System.out.println("objects[1] instanceof Shape = " + (objects[1] instanceof Shape));

        System.out.println("objects[2] instanceof Shape = " + (objects[2] instanceof Shape));

        //Любой Shape является Object
        //Но не любой Object является Shape

        //Любое Яблоко является Фруктом
        //Но не любой Фрукт является Яблоком
    }

    public static void printShapeName(Shape shape) {
        System.out.println("shape.getName() = " + shape.getName());
    }
}
