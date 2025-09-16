import java.util.Scanner;

public class SpiralTransversal {
    static void spiralTraversal(int[][] matrix, int n, int m) {
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        
        while (top <= bottom && left <= right) {
           
            for (int j = left; j <= right; j++) {
                System.out.print(matrix[top][j] + " ");
            }
            top++;
            
        
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            
            if (top <= bottom) {
                // Print bottom row (right to left)
                for (int j = right; j >= left; j--) {
                    System.out.print(matrix[bottom][j] + " ");
                }
                bottom--;
            }
            
            if (left <= right) {
                // Print leftmost column (bottom to top)
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
    
        spiralTraversal(matrix, n, m);
        
        scanner.close();
    }
}
