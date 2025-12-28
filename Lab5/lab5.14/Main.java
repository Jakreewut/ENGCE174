import java.util.Scanner;

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String id, double baseFee) {
        this.trackingId = id;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {
    public StandardShipping(String id, double baseFee) {
        super(id, baseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sId = sc.nextLine();
        double sFee = sc.nextDouble();
        sc.nextLine();

        String pId = sc.nextLine();
        double pFee = sc.nextDouble();
        double pInsurance = sc.nextDouble();

        StandardShipping standard = new StandardShipping(sId, sFee);
        PremiumShipping premium = new PremiumShipping(pId, pFee, pInsurance);

        Shipping[] shipments = { standard, premium };

        for (Shipping s : shipments) {
            System.out.println(s.calculateTotalFee());
        }

        sc.close();
    }
}