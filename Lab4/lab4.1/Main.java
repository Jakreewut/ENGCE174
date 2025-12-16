import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Book book = null; 

        System.out.print("Select mode (1 or 2): ");
        int mode = scan.nextInt(); 
        scan.nextLine(); 

        if (mode == 1) {
            System.out.print("Enter the book title: ");
            String title = scan.nextLine();
            
            book = new Book(title); 
            
        } else if (mode == 2) {
            System.out.print("Enter the book title: ");
            String title = scan.nextLine();
            
            System.out.print("Enter the book Author: ");
            String author = scan.nextLine();
            

            book = new Book(title, author); 
            
        } else {
            System.out.println("Invalid mode entered.");
        }

        System.out.println("\n--- Displaying Information ---");
        book.displayInfo();
        
        
        scan.close();
    }
}