import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        final int zero = 0;
        int count = 0;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == zero) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}