//Mean of array elements
public class ArrayMean {
    static double mean(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + mean(arr, i + 1);
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 9, 12};
        System.out.println(mean(arr, 0) / arr.length);
    }
}
