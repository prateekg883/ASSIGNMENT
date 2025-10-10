import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(2, 4, 6, 8);
        List<Integer> B = Arrays.asList(3, 4, 7, 9);

        List<Integer> temp = new ArrayList<>();
        int i = 0, j = 0;

        while (i < A.size() && j < B.size()) {
            if (A.get(i) < B.get(j)) {
                temp.add(A.get(i));
                i++;
            } else if (A.get(i) > B.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }

     
        while (i < A.size()) {
            temp.add(A.get(i));
            i++;
        }

        System.out.print("Difference of A and B: ");
        for (int x : temp) {
            System.out.print(x + " ");
        }
    }
}
