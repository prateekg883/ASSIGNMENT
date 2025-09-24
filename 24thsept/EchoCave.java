public class EchoCave {
    static void echo(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        echo(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        echo(n);
    }
}
