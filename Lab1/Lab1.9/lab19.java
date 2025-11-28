import java.util.Scanner;

 public class lab19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input
        System.out.println("Enter Number :");
        int n = scan.nextInt();

        //operate
        if (n <= 0) {
            System.out.println("Error : Array > 0");
            scan.close();
            return;
        }

        int[] numarr = new int[n];

        long sum = 0;

        System.out.println("Enter"+ n +"Number");
        for (int i = 0; i < n; i++) {
            System.out.println("Number" + (i + 1));
            numarr[i] = scan.nextInt() ;
            sum += numarr[i];
        }

        scan.close();

        double averg = (double) sum / n ;

        //output
        System.out.println("Average is ");
        System.out.println(averg);

    }
 }