public class ClimbStairs {
    public static int countWays(int n) {
        return climb(n);
    }

    private static int climb(int steps) {
        if (steps < 0) return 0;
        if (steps == 0) return 1;
        return climb(steps - 1) + climb(steps - 2);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(countWays(n)); // Output: 3
    }
}

