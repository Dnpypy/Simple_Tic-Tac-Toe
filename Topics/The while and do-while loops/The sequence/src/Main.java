import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;

        int i = 0;
        final int f = 4;
        int max = -9999;

        do {
            n = sc.nextInt();
            if (n % f == 0 && n > max) {
                max = n;
            }
            i++;

        } while (i != t);

        System.out.println(max);
    }
}