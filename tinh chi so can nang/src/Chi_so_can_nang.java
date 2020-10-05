import java.util.Scanner;

public class Chi_so_can_nang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap can nang cua ban: ");
        double weight = scanner.nextDouble();

        System.out.println("nhap chieu cao: ");
        double height = scanner.nextDouble();

        double bmi = weight/Math.pow(height,2);

        if(bmi < 18){
            System.out.println("your bmi is "+bmi+" you are underweight");
        }else if(bmi < 25.0){
            System.out.println("your bmi is "+bmi+" you are normal");
        }else if(bmi < 30.0){
            System.out.println("your bmi is "+bmi+" you are overWeight");
        }else{
            System.out.println("your bmi is "+bmi+" you are Obese");
        }
    }
}
