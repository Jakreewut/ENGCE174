import java.util.Scanner;

class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Car extends RentalVehicle {
    public Car(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle extends RentalVehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cModel = sc.nextLine();
        double cRate = sc.nextDouble();
        sc.nextLine();

        String mModel = sc.nextLine();
        double mRate = sc.nextDouble();

        Car car = new Car(cModel, cRate);
        Motorcycle motorcycle = new Motorcycle(mModel, mRate);

        RentalVehicle[] vehicles = { car, motorcycle };

        double totalRentalFee = 0;
        for (RentalVehicle v : vehicles) {
            totalRentalFee += v.calculateFee();
        }

        System.out.println(totalRentalFee);

        sc.close();
    }
}