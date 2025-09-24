public class TreasureBoxes {
    static int sumCoins(int[] arr, int i, int n) {
        if (i == n) return 0;
        return arr[i] + sumCoins(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 8, 6};
        int n = arr.length;
        System.out.println(sumCoins(arr, 0, n));
    }
}
