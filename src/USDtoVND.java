import java.util.Scanner;

public class USDtoVND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap USD:");
        float USD = scanner.nextFloat();

        float VND = USD * 23000;
        System.out.println("VND =" + VND);
    }
}
