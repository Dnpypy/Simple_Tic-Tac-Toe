import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int n;

        while (sc.hasNext()) {
            n = sc.nextInt();

            if (n == 0) {
                break;
            }

            if (n < 0) {
                n = -1 * n;
            }
            max = max < n ? n : max;
        }
        System.out.print(max);
    }
}