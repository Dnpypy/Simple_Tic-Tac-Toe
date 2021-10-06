import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int a = -15;
        final int b = 14;
        final int c = 12;
        final int d = 17;
        final int e = 19;


        if (n > a && n <= c) {
            System.out.println("True");

        } else if (b < n && n < d) {
            System.out.println("True");

        } else if (e <= n) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }


    }
}
