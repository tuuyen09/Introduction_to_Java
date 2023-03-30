package Resizeable;

import Triangle.Shape;

public class Rectangle extends Shape implements Resizeable{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea (){
        return width * height;
    }

    @Override
    public double resize() {
        double random = Math.random();
        random = random * 100 +1;
        int randomInt = (int) random;
        return getArea() * randomInt;
    }
}
