import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bankAccount account = null;

        System.out.println("--- Interactive BankAccount ---");

        System.out.print("1. Enter Owner Name : ");
        String owner = scanner.nextLine();

        double initialBalance = 0;
        System.out.print("2. Enter Initial Balance : ");
        if (scanner.hasNextDouble()) {
            initialBalance = scanner.nextDouble();
        } else {
            System.out.println("Error: Invalid initial balance input. Exiting.");
            scanner.close();
            return;
        }
        
        account = new bankAccount(owner, initialBalance);
        System.out.println("\n*** Account for " + account.getOwnerName() + " created. ***");
        account.displayBalance();
        
        scanner.nextLine(); 

        while (true) {
            System.out.println("\n--- Choose Action for " + account.getOwnerName() + " ---");
            System.out.println("1. Withdraw ");
            System.out.println("2. Display Balance ");
            System.out.println("3. Exit ");
            System.out.print("Enter choice (1/2/3): ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                double amount = 0;
                System.out.print("Enter amount to withdraw: ");
                if (scanner.hasNextDouble()) {
                    amount = scanner.nextDouble();
                    if (amount > 0) {
                        account.withdraw(amount);
                    } else {
                        System.out.println("Withdrawal amount must be positive.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                }
                scanner.nextLine(); 
            } else if (choice.equals("2")) {
                account.displayBalance();
            } else if (choice.equals("3")) {
                System.out.println("\nExiting test. Final balance for " + account.getOwnerName() + " is:");
                account.displayBalance();
                scanner.close();
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}