import java.util.Scanner;

class Employee {
    private String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            this.monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return this.monthlySalary * 12;
    }

    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextLine()) return;
        String name = scanner.nextLine(); 
        
        if (!scanner.hasNextLine()) return;
        double monthlySalary = Double.parseDouble(scanner.nextLine()); 
        
        if (!scanner.hasNextLine()) return;
        double taxRate = Double.parseDouble(scanner.nextLine()); 
        
        if (!scanner.hasNextLine()) return;
        double raiseAmount = Double.parseDouble(scanner.nextLine()); 
        
        scanner.close();

        Employee employee = new Employee(name, monthlySalary);

        double taxBefore = employee.calculateTax(taxRate);
        System.out.println("Tax (Before): " + taxBefore);

        employee.giveRaise(raiseAmount);

        double taxAfter = employee.calculateTax(taxRate);
        System.out.println("Tax (After): " + taxAfter);
    }
}