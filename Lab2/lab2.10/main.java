import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number product :");
        int n = scan.nextInt();
        scan.nextLine();

        shoppingCart myCart = new shoppingCart();
        System.out.println("Entering the quantity of items" + n + "item");

        for (int i = 0; i < n; i++) {
            System.out.println("Item" + (i + 1) + ":");

            System.out.println("Enter name product :");
            String name = scan.nextLine();

            System.out.println("Enter price product");
            double price = scan.nextDouble();
            scan.nextLine();

            product p = new product(name, price);
            myCart.addProduct(p);
        }
        double total = myCart.calculateTotalPrice();

        System.out.println("=================================");
        System.out.println("Total :" + total);
        System.out.println("=================================");

    }     
}
