public class ArraySumRecursion {
    static int sumArray(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + sumArray(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 9, 12};
        int sum = sumArray(arr, 0);
        System.out.println(sum);
    }
}
