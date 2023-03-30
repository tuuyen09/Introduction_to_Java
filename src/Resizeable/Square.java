package Resizeable;

import Triangle.Shape;

public class Square extends Shape implements Resizeable{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }
    public double getArea(){
        return side * side;
    }

    @Override
    public double resize() {
        double random = Math.random();
        random = random * 100 +1;
        int randomInt = (int) random;
        return getArea() * randomInt;
    }
}
