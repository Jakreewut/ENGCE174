import java.util.Scanner;

  public class lab113 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input
        System.out.println("Enter sive Grid");
        
        //row
        int r = scan.nextInt();

        //colum
        int c = scan.nextInt();

        int[][] serverGrid = new int[r][c];

        //operate
        System.out.println("Enter Status" + r + "x" + c );

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                serverGrid[i][j] = scan.nextInt();
            }
        }

        scan.close();

        int onlineCount = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (serverGrid[i][j] == 1) {
                  onlineCount++;
                }
            }
        }

        //output
        System.out.println("==========Output==========");
        System.out.println(onlineCount);
    }   
}
