import java.util.Scanner;
class Color {
    private int Red;
    private int Green;
    private int Blue;

    public Color(int r, int g, int b) {

        if (r < 0) this.Red = 0;
        else if (r > 255) this.Red = 255;
        else this.Red = r;

        if (g < 0) this.Green = 0;
        else if (g > 255) this.Green = 255;
        else this.Green = g;

        if (b < 0) this.Blue = 0;
        else if (b > 255) this.Blue = 255;
        else this.Blue = b;
    }

    public int getRed() {
        return this.Red;
    }

    public int getGreen() {
        return this.Green;
    }

    public int getBlue() {
        return this.Blue;
    }

    public void displayRGB() {
        System.out.println("R[" + this.Red + "] , G[" + this.Green + "] , B[" + this.Blue + "]");
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter RGB red :");
        int r = scan.nextInt();

        System.out.println("Enter RGB green :");
        int g = scan.nextInt();

        System.out.println("Enter RGB blue :");
        int b = scan.nextInt();

        Color color = new Color(r, g, b);

        System.out.println("================================");
        color.displayRGB();

        scan.close();
    }

}
