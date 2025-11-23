import java.util.Scanner;

   public class lab18 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //รับค่า
        System.out.println("Please enter the total number of digits to accept (N) :");
        int n = scan.nextInt();

        //array
        int[] number = new int[n];

        System.out.println("Please enter number" + n + "number");
        for (int i = 0; i < n; i++) {
            System.out.println("Number" + (i + 1) + ":");
            number[i] = scan.nextInt(); 
        }

        int maxValue = number[0];
        
        for (int i = 1; i < number.length; i++ ) {
            if (number[i] > maxValue) {
                maxValue = number[i];
            }
        }

        //แสดงผล
        System.out.println("\n Result of the maximum is :");
        System.out.println(maxValue);

        scan.close();
     }
    
}
