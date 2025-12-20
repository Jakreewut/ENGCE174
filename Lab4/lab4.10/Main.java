import java.util.Scanner;

class TimePeriod {
    private int startHour;
    private int endHour;

    public TimePeriod() {
        this(9, 17);
    }

    public TimePeriod(int startHour, int endHour) {
        if (startHour < 0) startHour = 0;
        else if (startHour > 23) startHour = 23;

        if (endHour < 0) endHour = 0;
        else if (endHour > 23) endHour = 23;

        if (startHour > endHour) {
            int temp = startHour;
            startHour = endHour;
            endHour = temp;
        }

        this.startHour = startHour;
        this.endHour = endHour;
    }

    public void displayPeriod() {
        System.out.println(this.startHour + ":00 - " + this.endHour + ":00");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mode = sc.nextInt();

        if (mode == 1) {
            TimePeriod tp = new TimePeriod();
            tp.displayPeriod();
        } else if (mode == 2) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            TimePeriod tp = new TimePeriod(s, e);
            tp.displayPeriod();
        }

        sc.close();
    }
}