import java.util.Scanner;

class User {
    private String username;
    private String password = "pass123";
    private int failedAttempts = 0;
    private boolean isLocked = false;

    private static int maxAttempts = 3;

    public User(String username ) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public String getUsername() {
        return username;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public void login(String attemptPassword) {
        if (isLocked) {
            System.out.println("Account is locked.");
            return;
        }

        if (attemptPassword.equals(this.password)) {
            this.failedAttempts = 0;
            System.out.println("Login successful.");
        } else {
            this.failedAttempts++;
            if (this.failedAttempts >= maxAttempts) {
                this.isLocked = true;
                System.out.println("Login failed. Account locked.");
            } else {
                int attemptsLeft = maxAttempts - this.failedAttempts;
                System.out.println("Login failed. " + attemptsLeft + " attempts left.");
            }
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextLine()) return;
        String username = scanner.nextLine(); 
        User user = new User(username);

        if (!scanner.hasNextLine()) return;
        int N = Integer.parseInt(scanner.nextLine()); 

        for (int i = 0; i < N; i++) {
            if (!scanner.hasNextLine()) break;
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("SET_POLICY")) {
                if (!scanner.hasNextLine()) break;
                int max = Integer.parseInt(scanner.nextLine());
                User.setPolicy(max);
            
            } else if (command.equalsIgnoreCase("LOGIN")) {
                if (!scanner.hasNextLine()) break;
                String password = scanner.nextLine();
                user.login(password);
            }
        }
        
        scanner.close();
    }
}