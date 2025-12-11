import java.util.Scanner;

class SystemLogger {
    private static int currentLogLevel = 1;

    private static String getLevelName(int level) {
        switch (level) {
            case 1:
                return "INFO";
            case 2:
                return "DEBUG";
            case 3:
                return "ERROR";
            default:
                return "UNKNOWN";
        }
    }

    public static void setLogLevel(int newLevel) {
        if (newLevel >= 1 && newLevel <= 3) {
            currentLogLevel = newLevel;
            System.out.println("Log level set to " + getLevelName(currentLogLevel));
        } else {
            System.out.println("Invalid level.");
        }
    }

    public static void log(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel) {
            System.out.println("[" + getLevelName(messageLevel) + "]: " + message);
        }
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
                int newLevel = Integer.parseInt(scanner.nextLine());
                SystemLogger.setLogLevel(newLevel);
            } else if (command.equalsIgnoreCase("LOG")) {
                if (!scanner.hasNextLine()) break;
                int messageLevel = Integer.parseInt(scanner.nextLine());
                
                if (!scanner.hasNextLine()) break;
                String message = scanner.nextLine();
                
                SystemLogger.log(messageLevel, message);
            }
        }
        
        scanner.close();
    }
}