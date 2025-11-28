import java.util.Scanner;

   public class lab17 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         //กำหนดครั้งแรก
         int sum =0;

         //รับค่า n
         System.out.println("Please enter the total number of digits to accept (N) :");
         int n = scanner.nextInt();
 
         System.out.println("Please enter Numer" + n + "Number");
         
         for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            sum += number;
         }

         //แสดงผล
         System.out.println("Result :");
         System.out.println(sum);

         scanner.close();
     }
}
