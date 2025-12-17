import java.util.Scanner;
class location{
    private double latitude;
    private double longitude;

    public location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public location(location other) {
        this.latitude = other.latitude;
        this.longitude = other.longitude;
    }

    public void setLatitude(double newLat) {
        this.latitude = newLat;
    }

    public void displayinfo() {
        System.out.println("Latlab [" + latitude + "] , Lon [" + longitude +"]");
    }
    
}
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter latitude :");
        double latitude = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter longitude :");
        double longitude = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter New latitude :");
        double newLat = scan.nextDouble();
        scan.nextLine();

        location loc1 = new location(latitude,longitude);

        location loc2 = new location(loc1);

        loc1.setLatitude(newLat);


        System.out.println("=====================================");
        loc1.displayinfo();

        loc2.displayinfo();

        scan.close();

    }
}
