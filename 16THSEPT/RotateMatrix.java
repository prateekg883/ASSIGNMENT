import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
/*Example 1 
Input 
3 
1 2 3 
4 5 6 
7 8 9 
 
Output 
7 4 1 
8 5 2 
9 6 3 
 
Example 2 
Input 
4 
1  2  3  4 
5  6  7  8 
9 10 11 12 
13 14 15 16 
 
Output 
13  9  5  1 
14 10  6  2 
15 11  7  3 
16 12  8  4*/