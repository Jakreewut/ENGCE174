import  java.util.Scanner;

  public class lab110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input
        System.out.println("input width :");
        double w = scan.nextDouble();

        System.out.println("input height :");
        double h = scan.nextDouble(); 

        //import function
        double areaResutl = calcurateArea(w, h);

        scan.close();

        //output
        System.out.println("Area : ");
        System.out.println(areaResutl);
    }
    
    //function calcuratearea
    public static double calcurateArea(double w, double h) {
        return w * h;
    }
}
