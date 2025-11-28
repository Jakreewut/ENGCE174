import java.util.Scanner;

  //main
  public class lab22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String studentIdInput = scan.nextLine();

        String nameInput = scan.nextLine();

        Student studentInstance = new Student(studentIdInput, nameInput);

        studentInstance.displayStudentInfo();

        scan.close();
    }
  }

   //calss
  class Student {
    private String studentId;
    private String name;

    public Student (String studentId, String name) {
      this.studentId = studentId;
      this.name = name;
    }

    public void displayStudentInfo() {
      System.out.println(studentId);
      System.out.println(name);
    }
  }