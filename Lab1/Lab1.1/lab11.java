import java.util.Scanner;

public class lab11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("Enter A : ");
        int number1 = scanner.nextInt();

        System.out.print("Enter B : ");
        int number2 = scanner.nextInt();

    
        int sum = number1 + number2;

        //output
        System.out.println("==================");
        System.out.println("Sum of " + number1 + " and " + number2 + " is " + sum); 

        scanner.close();
    }
}