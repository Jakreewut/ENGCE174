import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance -= amount;
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double initialBalance = scan.nextDouble();
        
        double depositAmount = scan.nextDouble();
        
        double withdrawAmount = scan.nextDouble();
        
        BankAccount account = new BankAccount(initialBalance);
        
        account.deposit(depositAmount);
        
        account.withdraw(withdrawAmount);
        
        System.out.printf("Final Balance: %.1f\n", account.getBalance());

        scan.close();
    }
}