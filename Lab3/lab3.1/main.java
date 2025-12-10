import java.util.Scanner;

class user{
    private String Username;

    public user(String Username) {
        this.Username = Username;
    }

    public String getUserName() {
        return this.Username;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Username = scan.nextLine();

        user userName = new user(Username);

        String display = userName.getUserName();

        System.out.println(display);
    }
}
