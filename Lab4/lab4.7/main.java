import java.util.Scanner;
class Resource {
    private String id;

    public Resource(String id) {
        this.id = id;

        System.out.println("Resource [" + id + "] created.");
    }

    @Override
    protected void finalize() throws Throwable{
        try {
            System.out.println("Resource [" + id + "] finalize (destroyed).");
        } finally { 
            super.finalize();
        }
    }
}
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter ID (1) :");
        String id1 = scan.nextLine();

        System.out.println("Enter ID (2) :");
        String id2 = scan.nextLine();

        System.out.println("Enter ID (3) :");
        String id3 = scan.nextLine();

        Resource r1 = new Resource(id1);
        Resource r2 = new Resource(id2);
        Resource r3 = new Resource(id3);

        r1 = null;
        r2 = null;

        System.gc();

        r3 = null;

        System.gc();

        scan.close();

        try { Thread.sleep(1000); } catch (Exception e) {}
    }
}
