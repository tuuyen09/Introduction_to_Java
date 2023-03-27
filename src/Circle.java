public class Circle {
    private double radius = 1.0;
    private String color = "red";


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("r = " + circle.getRadius() + " S =" + circle.getArea());
    }
}

