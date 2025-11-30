import java.util.Scanner;

public class studentMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("==========Student Grade Calculator Program==========");

        System.out.println("Enter name :");
        String name = scan.nextLine();

        System.out.println("Enter midterm score :");
        if (!scan.hasNextInt()) {
            System.out.println("Error : Please enter score !");
            scan.close();
            return;
        }
        int midterm = scan.nextInt();

        System.out.println("Enter final score :");
        if (!scan.hasNextInt()) {
            System.out.println("Error : Please enter score !");
            scan.close();
            return;
        }
        int finalscore = scan.nextInt();

        scan.close();

        student student = new student (name, midterm, finalscore);

        System.out.println("==========Output==========");
        student.displaySummary();

    }
}
