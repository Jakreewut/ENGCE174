import java.util.Scanner;

  public class lab111 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        
      //input
      System.out.println("Enter Number :");
      int n = scan.nextInt();

      if (n <= 0) {
            System.out.println("Error : Array > 0");
            scan.close();
            return;
      }

      int[] numArr = new int[n];

      for (int i = 0; i < n; i++) {
        System.out.println("Enter num" + (i + 1) + "Number");
        numArr[i] = scan.nextInt();
      }

      scan.close();

      //import function
      int tatalSum = sumArray(numArr);

      //output
      System.out.println("Summary :");
      System.out.println(tatalSum);
    }

    //function sum Array
    public static int sumArray(int[] numArr) {
        int sum = 0;

        for (int Number : numArr) {
          sum += Number;
        }
        return sum;
    }
}
