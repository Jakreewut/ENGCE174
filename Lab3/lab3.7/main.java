import java.util.Scanner;

class Employee {
    private String employeeId; 
    private String department;

    public Employee(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String id = scan.nextLine();
        String currentDept = scan.nextLine();
        String newDept = scan.nextLine();

        Employee employee = new Employee(id, currentDept);
        
        employee.setDepartment(newDept);
        
        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getDepartment());
        
        scan.close();
    }
}