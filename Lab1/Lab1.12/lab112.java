import java.util.Scanner;

  public class lab112 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input
        System.out.println("==========Welcome==========");
        System.out.println("Enter type product :");
        int n = scan.nextInt();

        int[] productID = new int[n];
        int[] stock = new int[n];
        
        //intput product Id and inventory quantity (Stock)  
        for (int i = 0; i < n; i++) {
            System.out.println("Type product" + (i + 1));

            System.out.println("Enter product ID :");
            productID[i] = scan.nextInt();

            System.out.println("Enter inventory quantity :");
            stock[i] = scan.nextInt();
        }

        //Search product
        System.out.println("Enter ID for Search product");
        int searchID = scan.nextInt();

        scan.close();

        //find ID
        int foundIndex = -1;

        for (int i = 0; i < n; i++) {
            if ( productID[i] == searchID) {
                foundIndex = i;
                break;
            }
        }

        //output
        System.out.println("==========Output==========");
        if (foundIndex != -1) {
            System.out.println(stock[foundIndex]);
        } else {
            System.out.println("Product " + searchID + " not found");
        }
    }
}
