import java.util.Scanner;

  public class lab16 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         //รับค่า
         System.out.println("Enter you number (Multiplier):");
         int mp = scanner.nextInt();

         System.out.println("Multiplier :" + mp);

         //คำนวณ & แสดงผล
         for (int i = 1; i <= 12; i++) {
            int result = mp * i;

            System.out.println(mp + "x" + i + "=" + result );
         }

         //scanner close
         scanner.close();
     }
}
