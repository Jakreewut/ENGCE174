public class shoppingCart {
    private product[] item;
    private int itemCount;

    public shoppingCart() {
        this.item = new product[10];
        this.itemCount  = 0;
    }

    public void addProduct(product p) {
        if (itemCount < item.length) {
            this.item[itemCount] = p;
            itemCount ++;
        } else {
            System.out.println("!! The shopping cart is full. Cannot add any more items. !!");
        }
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += item[i].getPrice();
        }
        return total;
    }
}
