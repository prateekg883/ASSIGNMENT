public class ArrayReverse {
    static void printReverse(int[] arr, int i) {
        if (i < 0) return; 
        System.out.print(arr[i] + " "); 
        printReverse(arr, i - 1); 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printReverse(arr, arr.length - 1); 
    }
}
