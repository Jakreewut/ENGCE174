import  java.util.Scanner;

public class lab12 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

   //รับค่าความกว้าง
   System.out.println("Enter width :");
   double w = scanner.nextDouble();

   //รับค่าความยาว
   System.out.println("Enter height :");
   double h = scanner.nextDouble();

   //คำนวณพื้นที่
   double area = w * h;

   //แสดงผล
   System.out.println("===========================");
   System.out.println("Area of Rectangle :" + area);

   //scanner close
   scanner.close();
   }
}