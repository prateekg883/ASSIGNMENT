public class IntersectionSorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        int i = 0, j = 0;

        System.out.print("Intersection: ");

        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;  
            } 
            else if (arr2[j] < arr1[i]) {
                j++; 
            } 
            else { 
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
}
