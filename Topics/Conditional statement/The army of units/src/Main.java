
import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int pack = 1;
        final int packTi = 19;
        final int throng = 20;
        final int throngTi = 249;
        final int zounds = 250;
        final int zoundsTi = 999;

        if (n < pack) {
            System.out.println("no army");
        } else if (pack <= n && n <= packTi) {
            System.out.println("pack");
        } else if (throng <= n && n <= throngTi) {
            System.out.println("throng");
        } else if (zounds <= n && n <= zoundsTi) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }

    }
}