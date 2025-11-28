import  java.util.Scanner;

public class lab12 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

   //input 
   System.out.println("Enter width :");
   double w = scanner.nextDouble();


   System.out.println("Enter height :");
   double h = scanner.nextDouble();


   double area = w * h;

   //output
   System.out.println("===========================");
   System.out.println("Area of Rectangle :" + area);

   scanner.close();
   }
}