import java.util.Scanner;

class shape {
    protected String name;

    public shape (String name) {
        this.name = name;
    }

    public double calculateArea() {
        return 0.0;
    }
}

class circle extends shape {
    protected double radius;

    public circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return  3.14 * radius * radius;
    }
}

class rectangle extends shape {
    protected double width;
    protected double hight;

    public rectangle(String name, double width, double hight) {
        super(name);
        this.width = width;
        this.hight = hight;
    }

    @Override
    public double calculateArea() {
        return width * hight;
    } 
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name :");
        String n = scan.nextLine();

        System.out.println("Enter radius :");
        double r = scan.nextInt();

        System.out.println("Enter width :");
        double w = scan.nextInt();

        System.out.println("Enter hight :");
        double h = scan.nextInt();

        circle c = new circle(n, r);

        rectangle rec = new rectangle(n, w, h);

        shape shapes[] = new shape[2];

        shapes[0] = c;
        shapes[1] = rec;

        for(shape s : shapes) {
            System.out.println("Name : " + n + ", Area : " + s.calculateArea());
        }

        scan.close();
    }
}
