import java.util.Scanner;

class LicenseManager {
    private static int maxLicenses = 10;
    private static int usedLicenses = 0;

    public static void setMax(int max) {
        if (max < 0) {
            System.out.println("Invalid max value.");
        } else if (max < usedLicenses) {
            System.out.println("Cannot set max lower than current usage.");
        } else {
            maxLicenses = max;
            System.out.println("Max licenses set to " + maxLicenses);
        }
    }

    public static boolean checkOut() {
        if (usedLicenses < maxLicenses) {
            usedLicenses++;
            System.out.println("Checkout successful.");
            return true;
        } else {
            System.out.println("Checkout failed: No licenses available.");
            return false;
        }
    }

    public static void checkIn() {
        if (usedLicenses > 0) {
            usedLicenses--;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Nothing to check-in.");
        }
    }

    public static void displayStatus() {
        int available = maxLicenses - usedLicenses;
        System.out.println("Used: " + usedLicenses);
        System.out.println("Available: " + available);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLine()) return;
        int N = Integer.parseInt(scanner.nextLine()); 

        for (int i = 0; i < N; i++) {
            if (!scanner.hasNextLine()) break;
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("SET")) {
                if (!scanner.hasNextLine()) break;
                int max = Integer.parseInt(scanner.nextLine());
                LicenseManager.setMax(max);
            } else if (command.equalsIgnoreCase("CHECKOUT")) {
                LicenseManager.checkOut();
            } else if (command.equalsIgnoreCase("CHECKIN")) {
                LicenseManager.checkIn();
            } else if (command.equalsIgnoreCase("STATUS")) {
                LicenseManager.displayStatus();
            }
        }
        
        scanner.close();
    }
}