import java.util.*;

class fibonacci {
    public static void main(String args[]) {
        int n = 10;
        int a = 0, b = 1, c;

        System.out.println("Fibonacci Series: " + a + " " + b);

        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}