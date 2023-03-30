package Resizeable;

import Animal.Edible;
import Triangle.Shape;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea (){
        return radius * radius * Math.PI;
    }

    @Override
    public double resize() {
        double random = Math.random();
        random = random * 100 +1;
        int randomInt = (int) random;
        return getArea() * randomInt;
    }
}
