import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu cao(m):");
        float height = scanner.nextFloat();

        System.out.println("Nhap can nang(kg):");
        float weight = scanner.nextFloat();

        float BMI = weight / (height * height);

        if (BMI < 18.5) {
            System.out.printf("%f is underweight", BMI);
        } else if (BMI < 25) {
            System.out.printf("%f is normal ", BMI);
        } else if (BMI < 30) {
            System.out.printf("%f is overweight", BMI);
        } else {
            System.out.printf("%f is obese", BMI);
        }
    }
}
