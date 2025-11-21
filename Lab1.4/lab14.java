import java.util.Scanner;

public class lab14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //รับค่าคะแนน
        System.out.println("Enter score :");
        //ตัวแปรเก็บคะแนน
        int s = scanner.nextInt();

        //ตัวแปรเก็บเกรด
        String g = "F";

        //คำนวณเกรด
        if (s >= 80) {
            g = "A";
        } else if (s >= 70) {
            g = "B";
        } else if (s >= 60) {
            g = "c";
        } else if (s >= 50) {
            g = "D";
        }

        //แสดงผล
        System.out.println("You Score :");
        System.out.println(s);
        System.out.println("You grade :");
        System.out.println(g);

        //scanner close
        scanner.close();
    }
}
