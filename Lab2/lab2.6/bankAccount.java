public class bankAccount {
    private String ownerName;
    private double balance;

    public bankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void displaySummary() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}