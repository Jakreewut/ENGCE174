
import java.util.Scanner;

class Vehicle {
    protected String color;

    public Vehicle (String color) {
        this.color = color;
    }
}

class Car extends Vehicle {
    protected int wheel;

    public Car (String color, int wheel) {
        super(color);
        this.wheel = wheel;
    }

    public void displayInfo() {
        System.out.println("Color [" + color + "] , Wheel [" + wheel + "]");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter coor :");
        String col = scan.nextLine();

        System.out.println("Enter wheel :");
        int whe = scan.nextInt();

        Car mycar = new Car(col, whe);

        mycar.color = col;

        mycar.displayInfo();

        scan.close();
    }
}
