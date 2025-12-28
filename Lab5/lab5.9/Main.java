import java.util.Scanner;

class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public double getValue() {
        return 0.0;
    }
}

class PhysicalProduct extends Item {
    protected double unitPrice;
    protected int quantity;

    public PhysicalProduct(String name, double unitPrice, int quantity) {
        super(name);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public double getValue() {
        return unitPrice * quantity;
    }
}

class DigitalSubscription extends Item {
    protected double monthlyCost;
    protected int months;

    public DigitalSubscription(String name, double monthlyCost, int months) {
        super(name);
        this.monthlyCost = monthlyCost;
        this.months = months;
    }

    @Override
    public double getValue() {
        return monthlyCost * months;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pName = sc.nextLine();
        double pPrice = sc.nextDouble();
        int pQty = sc.nextInt();
        sc.nextLine();

        String dName = sc.nextLine();
        double dCost = sc.nextDouble();
        int dMonths = sc.nextInt();

        PhysicalProduct physical = new PhysicalProduct(pName, pPrice, pQty);
        DigitalSubscription digital = new DigitalSubscription(dName, dCost, dMonths);

        Item[] inventory = { physical, digital };

        double totalValue = 0;
        for (Item item : inventory) {
            totalValue += item.getValue();
        }

        System.out.println(totalValue);

        sc.close();
    }
}