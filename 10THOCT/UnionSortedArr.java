public class UnionSortedArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        int i = 0, j = 0;
        System.out.print("Union: ");

        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } 
            else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j] + " ");
                j++;
            } 
            else {  
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

        
        while (i < arr1.length) {
            System.out.print(arr1[i] + " ");
            i++;
        }

        // Print remaining elements of arr2
        while (j < arr2.length) {
            System.out.print(arr2[j] + " ");
            j++;
        }
    }
}
