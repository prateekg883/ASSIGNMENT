import java.util.Scanner;

public class WaveFormTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                matrix[i][j] = sc.nextInt();

        for (int col = 0; col < m; ++col) {
            if (col % 2 == 0) {
                for (int row = 0; row < n; ++row)
                    System.out.print(matrix[row][col] + " ");
            } else {
                for (int row = n - 1; row >= 0; --row)
                    System.out.print(matrix[row][col] + " ");
            }
        }
        sc.close();
    }
}