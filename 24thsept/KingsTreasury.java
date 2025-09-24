public class KingsTreasury {
    static int treasurySum(int n) {
        if (n == 0) return 0;
        return n + treasurySum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(treasurySum(n));
    }
}
