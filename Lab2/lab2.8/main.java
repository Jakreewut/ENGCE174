import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String mode;
        if (scanner.hasNextLine()) {
            mode = scanner.nextLine().trim();
        } else {
            scanner.close();
            return;
        }


        double temperature;
        if (scanner.hasNextDouble()) {
            temperature = scanner.nextDouble();
        } else {
            scanner.close();
            return;
        }
        
        double result = 0.0;
        
 
        if (mode.equalsIgnoreCase("C_TO_F") || mode.equalsIgnoreCase("C TO F")) { 
            result = TempConverter.celsiusToFahrenheit(temperature);
        } else if (mode.equalsIgnoreCase("F_TO_C") || mode.equalsIgnoreCase("F TO C")) { 
            result = TempConverter.fahrenheitToCelsius(temperature);
        }
        
 
        System.out.printf("%.1f%n", result); 

        scanner.close();
    }
}