import java.util.Scanner;
class employee {
    protected double  sarary;

    public employee(double sarary) {
        this.sarary = sarary;
    }

    public double calaulateBonus() {
        return sarary * 0.10 ;
    }
}

class manager extends employee{

    public manager(double sarary) {
        super(sarary);
    }

    @Override
    public double calaulateBonus() {
        double beasBonus = super.calaulateBonus();
        
        double extraBonus = sarary * 0.05;

        return beasBonus + extraBonus;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Sarary :");
        double sarary = scan.nextDouble();
        scan.nextLine();

        manager myManager = new manager(sarary);

        myManager.sarary = sarary;
        
        myManager.calaulateBonus();

        System.out.println("Total Sarary :" + myManager.calaulateBonus());

    }
}
