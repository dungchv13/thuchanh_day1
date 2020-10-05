import java.util.Scanner;

public class giai_phuong_trinh_bac1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap a :");
        double a = scanner.nextDouble();

        System.out.println("nhap b :");
        double b = scanner.nextDouble();

        if(a == 0) {
            if(b == 0){
                System.out.println("phuong trinh vo so nghiem");
            }else{
                System.out.println("phuong trinh vo nghiem");
            }
        }else{
            double result = -b/a;
            System.out.println("phuong trinh co nghiem x = "+result);
        }

    }
}
