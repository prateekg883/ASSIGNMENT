import java.util.Scanner;

public class SumOneToN {
//     public static int sum(int n) {
//         return n * (n + 1) / 2;
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println("Sum from 1 to " + n + " = " + sum(n));
//     }
// }

public static int sum(int n) {
    if (n == 0) {
        return 0;
    } else {
        return n + sum(n - 1);
    }
}
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();    
        System.out.println("Sum from 1 to " + n + " = " + sum(n));
    }
}


