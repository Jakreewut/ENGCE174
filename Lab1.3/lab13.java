import java.util.Scanner;

public class lab13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //รับค่า 1 จำนวน
        System.out.println("Enter  1 number:");
        int n = scanner.nextInt();

        //ตรวจว่าเป็น เลขคู่ หรือ เลขคี่ และ แสดงผล
        if (n % 2 == 0) {
            System.out.println("================================");
            System.out.println("This numer is : Even");
        } else {
            System.out.println("================================");
            System.out.println("This number is : Odd");
        }

        //scanner close
        scanner.close();
    }
}
