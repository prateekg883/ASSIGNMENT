import java.util.Scanner;

public class RoyalTournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int maxSum = Integer.MIN_VALUE, maxIndex = -1;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum += sc.nextInt();
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}
