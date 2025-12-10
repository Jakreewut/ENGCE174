import java.util.Scanner;

class player {
    private int score;

    public player(int initialScore) {
        this.score = initialScore;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int newScore) {
        this.score = newScore;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter score :");
        int initialscore = scan.nextInt();

        player myPlayer = new player(initialscore);

        System.out.println("Update score :");
        int newScore = scan.nextInt();

        myPlayer.setScore(newScore);

        int displayScore = myPlayer.getScore();

        System.out.println(displayScore);
    }
}
