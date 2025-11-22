import java.util.Scanner;

public class lab15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //รับค่า
        System.out.println("Enter menu number :");
        int menuNumber = scanner.nextInt();

        //ตรวจสอบ
        String menuName;

        if (menuNumber == 1) {
            menuName = "Americano";
        } else if (menuNumber == 2) {
            menuName = "Latte";
        } else if (menuNumber == 3) {
            menuName = "Espresso";
        } else if (menuNumber == 4) {
            menuName = "Mocha";
        } else {
            menuName = "Invalid Menu";
        }

        //แสดงผล
        System.out.println("==========================================");
        System.out.println("You menu :");
        System.out.println(menuName);

        //scanner close
        scanner.close();
    }
}