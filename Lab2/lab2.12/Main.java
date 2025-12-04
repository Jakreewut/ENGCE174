import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputCourseId = scanner.nextLine(); 
        
        String inputCourseName = scanner.nextLine();
        
        String inputStudentName = scanner.nextLine(); 

        Course course = new Course(inputCourseId, inputCourseName);

        Student student = new Student(inputStudentName, course);

        student.displayEnrollment();

        scanner.close();
    }
}