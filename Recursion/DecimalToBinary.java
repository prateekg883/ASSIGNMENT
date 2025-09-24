//Convert decimal to binary

public class DecimalToBinary {
    static void printBinary(int n) {
        if (n == 0) return;
        printBinary(n / 2);
        System.out.print(n % 2);
    }
    public static void main(String[] args) {
        printBinary(13);
    }
}
