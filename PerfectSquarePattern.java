import java.util.Scanner;

public class PerfectSquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows of squares: ");
        int nRows = scanner.nextInt();
        System.out.print("Enter the number of columns of squares: ");
        int nCols = scanner.nextInt();

        int squareSize = 5;

        for (int row = 0; row < nRows * (squareSize + 1) + 1; row++) {
            for (int col = 0; col < nCols * (squareSize + 1) + 1; col++) {
                if (row % (squareSize + 1) == 0 || col % (squareSize + 1) == 0) {
                    System.out.print("*");
                } else {
                    int squareRow = row / (squareSize + 1);
                    int squareCol = col / (squareSize + 1);
                    if ((squareRow + squareCol) % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
