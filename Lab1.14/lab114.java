import java.util.Scanner;

public class lab114 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows (R): ");
        int r = scan.nextInt();
        System.out.print("Enter number of columns (C): ");
        int c = scan.nextInt();
        scan.nextLine();

        char[][] map = new char[r][c];
        System.out.println("Enter the map (use * for mine, . for empty space):");
        for (int i = 0; i < r; i++) {
            String rowInput = scan.nextLine();
            if (rowInput.length() != c) {
                System.out.println(" Error: Incorrect row length. Must have " + c + " columns.");
                i--; 
                continue;
            }
            map[i] = rowInput.toCharArray();
        }

        System.out.print("Enter target coordinate (Row targetR, starting from 0): ");
        int targetR = scan.nextInt();
        System.out.print("Enter target coordinate (Column targetC, starting from 0): ");
        int targetC = scan.nextInt();

        System.out.println("\n--- Result Check ---");
        checkTargetCoordinate(map, targetR, targetC, r, c);

        scan.close();
    }


    public static void checkTargetCoordinate(char[][] map, int targetR, int targetC, int R, int C) {
        if (targetR < 0 || targetR >= R || targetC < 0 || targetC >= C) {
            System.out.println("Error: Target coordinate (" + targetR + ", " + targetC + ") is out of map bounds.");
            return;
        }

        char clickedCell = map[targetR][targetC];

        if (clickedCell == '*') {
            System.out.println(" Mine");
            return; 
        }

        if (clickedCell == '.') {
            int mineCount = countAdjacentMines(map, targetR, targetC, R, C);
            System.out.println("Number of adjacent mines: " + mineCount);
            System.out.println("Displaying result: " + mineCount);
            return; 
        }
        
        System.out.println("Error: Unknown character found at the clicked coordinate.");
    }

    public static int countAdjacentMines(char[][] map, int targetR, int targetC, int R, int C) {
        int count = 0;
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int neighborR = targetR + dr[i];
            int neighborC = targetC + dc[i]; 

            if (neighborR >= 0 && neighborR < R && neighborC >= 0 && neighborC < C) {
                if (map[neighborR][neighborC] == '*') {
                    count++;
                }
            }
        }

        return count;
    }
}