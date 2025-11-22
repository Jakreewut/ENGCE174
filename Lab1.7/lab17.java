import java.util.Scanner;

   public class lab17 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         //กำหนดครั้งแรก sum = 0
         int sum =0;

         //รับค่า n
         System.out.println("Please enter the total number of digits to accept (N) :");
         int n = scanner.nextInt();
 
         System.out.println("Please enter Numer" + n + "Number");
         
         //ป้อนตัวเลขตามจำนวนครั้ง
         for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            //บวกเลขตามจำนวนครั้ง
            sum += number;
         }

         //แสดงผล
         System.out.println("Result :");
         System.out.println(sum);

         //scanner close
         scanner.close();
     }
}
