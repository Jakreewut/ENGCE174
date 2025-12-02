import java.util.Scanner;

public class main { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Name: ");
        String ownerName = scan.nextLine(); 

        System.out.println("Enter Balance :");
        double initialBalance = scan.nextDouble();
        
        scan.nextLine(); 

        System.out.println("Enter Deposit amount :");
        double depositAmount = scan.nextDouble();
        
        bankAccount account = new bankAccount(ownerName, initialBalance); 

        account.deposit(depositAmount);


        account.displaySummary(); 

        scan.close();
    }
}