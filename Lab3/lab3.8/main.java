import java.util.Scanner;

class InventoryItem { 
    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;
        
        if (initialStock > 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void sellStock(int amount) {
        if (amount > 0) {
            if (amount <= this.stock) {
                this.stock -= amount;
                System.out.println("Sale successful.");
            } else {
                System.out.println("Not enough stock.");
            }
        } else {
            System.out.println("Invalid amount.");
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLine()) return;
        String productName = scanner.nextLine();
        
        if (!scanner.hasNextLine()) return;
        int lineN = 0;
        try {
            lineN = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return; 
        }

        if (!scanner.hasNextLine()) return;
        int initialStock = 0;
        try {
            initialStock = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return;
        }

        InventoryItem item = new InventoryItem(productName, initialStock);

        for (int i = 0; i < lineN; i++) {
            if (!scanner.hasNextLine()) break;
            String command = scanner.nextLine();
            
            if (!scanner.hasNextLine()) break;
            int amount = 0;
            try {
                amount = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }

            if (command.equalsIgnoreCase("ADD")) {
                item.addStock(amount);
            } else if (command.equalsIgnoreCase("SELL")) {
                item.sellStock(amount);
            }
        }

        System.out.println("Final Stock: " + item.getStock());
        
        scanner.close();
    }
}