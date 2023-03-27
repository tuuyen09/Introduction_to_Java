import java.util.Scanner;

public class QuadraticEquation {
    float a, b, c;

    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return this.a;
    }

    public float getB() {
        return this.b;
    }

    public float getC() {
        return this.c;
    }

    public float getDiscriminant() {
        return (b * b) - (4 * a * c);

    }
}

class New {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c:");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        QuadraticEquation qua = new QuadraticEquation(a, b, c);
        float delta = qua.getDiscriminant();
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        if (delta > 0) {
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        } else if (delta == 0) {
            System.out.println("The equation has one root" + root1);
        } else {
            System.out.println("The equation has no root");
        }
    }
}
