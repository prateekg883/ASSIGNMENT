
//recursion print from 1 to n and n to 1

public class Recursion {
    static void printNumbers(int n) {
        if (n == 0) return;
        printNumbers(n - 1); 
        System.out.print(n + " "); 
    }
static void printReverse(int n) {
    if (n == 0) return;
    System.out.print(n + " ");
    printReverse(n - 1);
}

    public static void main(String[] args) {
        int n = 10;
        printNumbers(n);
        System.out.println(" ");
        printReverse(n); 
    }
}


