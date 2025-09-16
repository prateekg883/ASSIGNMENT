import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int[][] transpose = new int[m][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(transpose[i][j]);
                if(j < n-1) System.out.print(" ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
