import java.util.Scanner;
class Point {
    private final int x;
    private final int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x ;
    }

    public int getY() {
        return this.y ;
    }

    public Point move(int dx, int dy) {
        int newX = this.x + dx;
        int newY = this.y + dy;

        return new Point(newX, newY);
    }

    public void displayinfo() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter point x :");
        int x = scan.nextInt();

        System.out.println("Enter point y :");
        int y = scan.nextInt();

        System.out.println("Enter move point x :");
        int dx = scan.nextInt();

        System.out.println("Enter move point y :");
        int dy = scan.nextInt();

        Point newPoint = new Point(dx, dy);

        Point p1 = new Point(x, y);

        Point p2 = p1.move(dx, dy);

        Point p3 = p2.move(dx, dy);

        System.out.println("============================================");
        p1.displayinfo();
        p2.displayinfo();
        p3.displayinfo();

        scan.close();
    }
}
