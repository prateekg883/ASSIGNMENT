import java.util.Scanner;

public class MatrixPatternKingdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int val = 1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = val++;
        
        int[][] res = new int[n][n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean onPattern = false;
                if (ch == 'Z') {
                    if (i == 0 || i == n - 1 || i + j == n - 1)
                        onPattern = true;
                } else if (ch == 'X') {
                    if (i == j || i + j == n - 1)
                        onPattern = true;
                } else if (ch == 'A') {
                    if (i == 0 || j == 0 || j == n - 1 || (i == j && i <= n / 2) || (i + j == n - 1 && i <= n / 2))
                        onPattern = true;
                } else if (ch == 'D') {
                    if (j == 0 || (i == 0 && j < n - 1) || (i == n - 1 && j < n - 1) || (j == n - 1 && i > 0 && i < n - 1))
                        onPattern = true;
                }
                if (onPattern) {
                    res[i][j] = mat[i][j];
                    sum += mat[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
        System.out.println(sum);
    }
}
