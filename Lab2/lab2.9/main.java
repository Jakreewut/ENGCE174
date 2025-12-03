import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name :");
        String studentName = scan.nextLine();

        System.out.println("Enter street :");
        String street = scan.nextLine();

        System.out.println("Enter city :");
        String city = scan.nextLine();

        System.out.println("Enter zipcode :");
        String zipCode = scan.nextLine();

        address addrObject = new address(street,city,zipCode);

        student studentObject = new student(studentName,addrObject);

        scan.close();

        System.out.println("Output");
        studentObject.displayProfile();
    }   
}
