public class student {
    private String name;
    private address address;

    public student(String name, address address) {
        this.name = name;
        this.address = address;
    }

    public void displayProfile() {
        System.out.println("Name :" + name);
        System.out.println("Adress :" + address.fullAddress());
    }
}
