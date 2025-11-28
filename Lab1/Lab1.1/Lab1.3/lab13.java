import java.util.Scanner;

public class lab13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  1 number:");
        int n = scanner.nextInt();

        //ตรวจ
        if (n % 2 == 0) {
            System.out.println("================================");
            System.out.println("This numer is : Even");
        } else {
            System.out.println("================================");
            System.out.println("This number is : Odd");
        }

        scanner.close();
    }
}
