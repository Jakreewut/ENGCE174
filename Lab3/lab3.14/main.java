import java.util.Scanner;

class BankAccount {
    // Attributes
    private double balance;
    private static int totalTransactionCount = 0;

    // Constructor
    public BankAccount(double initialDeposit) {
        if (initialDeposit > 0) {
            this.balance = initialDeposit;
            System.out.println("Account created.");
        } else {
            this.balance = 0;
            System.out.println("Account created.");
        }
    }

    // Methods
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance -= amount;
                totalTransactionCount++;
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount myAccount = null;

        if (!scanner.hasNextLine()) return;
        int N = Integer.parseInt(scanner.nextLine()); 

        for (int i = 0; i < N; i++) {
            if (!scanner.hasNextLine()) break;
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("CREATE")) {
                if (!scanner.hasNextLine()) break;
                double initialDeposit = Double.parseDouble(scanner.nextLine());
                myAccount = new BankAccount(initialDeposit);
            
            } else if (command.equalsIgnoreCase("DEPOSIT")) {
                if (myAccount == null) {
                    System.out.println("No account exists.");
                    continue;
                }
                if (!scanner.hasNextLine()) break;
                double amount = Double.parseDouble(scanner.nextLine());
                myAccount.deposit(amount);
            
            } else if (command.equalsIgnoreCase("WITHDRAW")) {
                if (myAccount == null) {
                    System.out.println("No account exists.");
                    continue;
                }
                if (!scanner.hasNextLine()) break;
                double amount = Double.parseDouble(scanner.nextLine());
                myAccount.withdraw(amount);
            
            } else if (command.equalsIgnoreCase("STATUS")) {
                if (myAccount != null) {
                    System.out.println("Balance: " + myAccount.getBalance());
                } else {
                    System.out.println("No account exists.");
                }
            
            } else if (command.equalsIgnoreCase("GLOBAL_STATUS")) {
                int totalTransactions = BankAccount.getTotalTransactionCount();
                System.out.println("Total Transactions: " + totalTransactions);
            }
        }
        
        scanner.close();
    }
}
