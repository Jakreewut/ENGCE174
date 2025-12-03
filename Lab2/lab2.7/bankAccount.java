import com.sun.jdi.Value;
import java.text.DecimalFormat;

public class bankAccount{
    private String ownerName;
    private double balance;

    public bankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount ;
            System.out.println("You Withdrawal successfully.");
        }
        else {
            System.out.println("\"Insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance" + formatBalance(this.balance));
    }

    private String formatBalance(double Value) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(Value);
    }

    public String getOwnerName() {
        return ownerName;
    }
}