import java.util.Scanner;

public class Tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ban muon biet so ngay cua thang nao?");
        int month = scanner.nextInt();

        switch (month){
            case 2:
                System.out.print("The month '2' has 28 or 29 days!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang "+month+" co 31 ngay.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang "+month+" co 30 ngay.");
                break;
            default:
                System.out.println(month+" ko phai la 1 thang trong nam");
        }
    }
}
