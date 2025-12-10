import java.util.Scanner;

class User {
    private String password;

    public User(String initialPassword) {
        this.password = initialPassword;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= 8) {
            this.password = newPassword;
            System.out.println("Password updated.");
        } else {
            System.out.println("Password is too short.");
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String initialPassword = scan.nextLine();
    
        User userAccount = new User(initialPassword);

        String newPassword = scan.nextLine();

        userAccount.setPassword(newPassword);

        System.out.println(userAccount.getPassword());

        scan.close();
    }
}
