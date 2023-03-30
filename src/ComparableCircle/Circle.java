package ComparableCircle;

public abstract class Circle {
    protected double radius;

    protected String color;
    protected boolean filler;


    public Circle(double radius, String color, boolean filler) {
        this.radius = radius;
        this.color = color;
        this.filler = filler;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    protected Circle() {
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filler=" + filler +
                '}';
    }
}


