import java.util.Scanner;

public class ChessboardDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[N][N];

        
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                board[i][j] = sc.nextInt();

        int mainDiagonalSum = 0, secondaryDiagonalSum = 0;
       
        for (int i = 0; i < N; i++) {
            mainDiagonalSum += board[i][i];
            secondaryDiagonalSum += board[i][N - 1 - i];
        }
      
        System.out.println(mainDiagonalSum + " " + secondaryDiagonalSum);
    }
}
