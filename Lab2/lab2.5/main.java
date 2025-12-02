import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Width :");
        double width = scan.nextDouble();
        System.out.println("Enter Height :");
        double height = scan.nextDouble();

        rectangle rectangle = new rectangle(width, height);


        System.out.println("==========Output==========");
        System.out.println(rectangle.getArea());
        System.err.println(rectangle.getRerimeter());

        scan.close();
    }
}
