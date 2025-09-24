public class RabbitFamily {
    static int rabbitCount(int n) {
        if (n <= 2) return 1;
        return rabbitCount(n - 1) + rabbitCount(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(rabbitCount(n));
    }
}
