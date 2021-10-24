import java.util.*;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int t = 3;
        System.out.print(n + " ");

        while (n != 1) {
            if (n == 1) {
                n = 1;
                System.out.print(n);
                break;
            } else if ((n & 1) == 1) {
                n = n * t + 1;
                System.out.print(n + " ");
            } else if (n % 2 == 0) {
                n = n / 2;
                System.out.print(n + " ");
            }
        }

    }
}