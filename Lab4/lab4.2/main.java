import java.util.Scanner;
class product {
    private String name;
    private double price;

    public product(String name) {
        this(name,0.0);
    }

    public product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayinfo() {
        System.out.println("Product :" + name + ", Price :" + price + ".");
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        product product = null;

        System.out.println("Select mode :");
        int mode = scan.nextInt();
        scan.nextLine();

        if (mode == 1) {
            System.out.println("Enter Product name :");
            String name = scan.nextLine();

            product = new product(name);
        } else if (mode == 2) {
            System.out.println("Enter Product name :");
            String name = scan.nextLine();

            System.out.println("Enter Product price :");
            double price = scan.nextDouble();
            scan.nextLine();

            product = new product(name, price);
        } else {
            System.out.println("!! Invalid mode.");
            return;
        }

        System.out.println("====================================================");
        product.displayinfo();
        scan.close();
    }
}
