import java.util.Scanner;

public class NumberToWord {
    //Khai báo mảng từ text số từ 0 tới 19
    public static final String[] oneToTen = {
            "", "One", "Two", "Three", "Four", "five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
            "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    //Khai báo mảng từ text số  20 tới 90
    public static final String[] tys = {
            "", //0
            "", //1
            "Twenty",  // 2
            "Thirty",  // 3
            "Forty",   // 4
            "Fifty",   // 5
            "Sixty",   // 6
            "Seventy", // 7
            "Eighty",  // 8
            "Ninety"   // 9
    };

    //Hàm xử lý tách phần nguyên và phần dư của 2 mảng
    public static String ConverNumberToText(int number){
        if (number < 0){
            return "Dường như bạn đã nhập giá trị Âm hoặc Chuỗi";
        }
        if (number < 20){
            return oneToTen[number];
        }
        if (number < 100){
            return tys[number / 10] + " " + oneToTen[number % 10];
        }
        if (number < 1000){
            return tys[number / 100] + " Hunred " + ConverNumberToText(number % 100);
        }
        return "Số lớn quá phải code thêm, không thì đọc mỏi mồm lắm";
    }
    public static void main(String[] args) {
//        System.out.printf(String.valueOf(tys.length)); //lấy về chiều dài của mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời Bạn nhập số muốn đổi");
        int num = sc.nextInt();
        System.out.println(ConverNumberToText(num));
        sc.close();
    }
}


