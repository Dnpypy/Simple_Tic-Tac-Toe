import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String result;
        int n;

        while (sc.hasNext()) {
            n = sc.nextInt();

            if (n == 0) {
                break;
            }

            if (n < 0) {
                n = -1 * n;
            }
            result = n % 2 == 0 ? "even" : "odd";
            System.out.println(result);
        }

    }
}