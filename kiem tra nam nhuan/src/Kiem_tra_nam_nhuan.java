import java.util.Scanner;

public class Kiem_tra_nam_nhuan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap nam ban muon kiem tra");
        int year = scanner.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0 && year % 400 != 00){
                System.out.println("nam "+year+" ko phai la nam nhuan");
            }else{
                System.out.println("nam "+year+" la nam nhuan");
            }
        }else{
            System.out.println("nam "+year+" ko phai la nam nhuan");
        }
    }
}
