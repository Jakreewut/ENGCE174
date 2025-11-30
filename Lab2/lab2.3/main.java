import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number ");

        if (!scan.hasNextInt()) {
            System.out.println("Error : Invative input ");
            scan.close();
            return;
        }

        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Student information" + (i + 1) + ":");

            System.out.println("Enter Student ID :");
            String id = scan.nextLine();

            System.out.println("Enter Student name :");
            String name = scan.nextLine();

            Student newStudent = new Student(id, name);
        }
        System.out.println("=============================");
        System.out.println("Total Number of Students Created");
        System.out.println(Student.getStudentCount());
        System.out.println("=================================");
    }
}


