import java.util.Scanner;

public class lab11 {
    public static void main(String[] args) {
        // สร้างวัตถุ Scanner เพื่อรับข้อมูลจากผู้ใช้
        Scanner scanner = new Scanner(System.in);

        // --- ส่วนรับค่า ---
        System.out.print("Enter A : "); // ใช้ print() เพื่อให้ผู้ใช้ป้อนค่าในบรรทัดเดียวกัน
        int number1 = scanner.nextInt();

        System.out.print("Enter B : ");
        int number2 = scanner.nextInt();

        // --- ส่วนคำนวณ ---
        int sum = number1 + number2;

        // --- ส่วนแสดงผลลัพธ์ ---
        System.out.println("==================");
        // แก้ไขการแสดงผลลัพธ์ให้มีช่องว่างและอ่านง่าย
        System.out.println("Sum of " + number1 + " and " + number2 + " is " + sum); 

        // ปิดวัตถุ Scanner (ดีมากที่คุณมีบรรทัดนี้แล้ว)
        scanner.close();
    }
}