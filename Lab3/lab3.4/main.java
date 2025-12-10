import java.util.Scanner;

class Product {
    private String name;

    private static int productCount = 0;

    public Product(String name) {
        this.name = name;
        productCount++;
    }

    public String getName() {
        return this.name;
    }

    public static int getProductCount() {
        return productCount;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < N; i++) {
            String productName = scan.nextLine();
            
            Product product = new Product(productName);
        }

        System.out.println(Product.getProductCount());

        scan.close();
    }
}
