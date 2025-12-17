import java.util.Scanner;
class player {
    private String username ;
    private int level;
    
    public player() {
        this("unknow",1);
    }

    public player(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public void displayProfile() {
        System.out.println("User [" + username + "] , Level [" + level + "]");
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        player  player = null;

        System.out.println("Select mode :");
        int mode = scan.nextInt();
        scan.nextLine();

        if (mode == 1) {
            player = new player();
        } else if (mode == 2) {
            System.out.println("Enter Player name :");
            String username = scan.nextLine();

            System.out.println("Enter Player level :");
            int level = scan.nextInt();
            scan.nextLine();

            player = new player(username, level);
        } else {
            System.out.println("!! Invalid mode.");
            return;
        }

        System.out.println("==============================================");
        player.displayProfile();
    }
}
