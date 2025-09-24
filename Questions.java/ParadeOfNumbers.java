import java.util.*;

public class ParadeOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0)
                neg.add(arr[i]);
            else
                pos.add(arr[i]);
        }
        for (int i = 0; i < neg.size(); i++) {
            System.out.print(neg.get(i) + " ");
        }
        for (int i = 0; i < pos.size(); i++) {
            System.out.print(pos.get(i) + " ");
        }
    }
}
