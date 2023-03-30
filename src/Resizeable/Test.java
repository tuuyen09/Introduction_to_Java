package Resizeable;

import Triangle.Shape;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(12);
        shapes[1] = new Rectangle(12,24);
        shapes[2] = new Square(10);

        for (Shape shape : shapes){
            if (shape instanceof Circle circle){
                System.out.println(circle.resize());
            } else if (shape instanceof Rectangle rectangle){
                System.out.println(rectangle.resize());
            }else if (shape instanceof Square square){
                System.out.println(square.resize());
            }
        }
    }

}
