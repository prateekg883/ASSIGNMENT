public class DrumBeats {
    static void printBeats(int n) {
        if (n == 0) return;
        printBeats(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        printBeats(n);
    }
}
