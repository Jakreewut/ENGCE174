import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String carModel = scan.nextLine();

        int initialYear = scan.nextInt();
        scan.nextLine();

        int newYear = scan.nextInt();

        car myCar = new car (carModel,initialYear);

        myCar.setYear(newYear);

        System.out.println("Car : " + myCar.getModel());
        System.out.println("Year : " + myCar.getYear());

        scan.close();
    }
}
