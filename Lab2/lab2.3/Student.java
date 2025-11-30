public class Student {
    private String studentId;
    private String name;
    
    private static int studentCount = 0;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;

        studentCount++;
    }
    public static int getStudentCount () {
       return studentCount;
    }
}
