package Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return super.toString() + " Volume = " + getVolume();
    }
}

class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10.8, "red", 14.5);
        System.out.println(cylinder);
    }
}