import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int sum = 0;
        final int divSix = 6;
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (x % divSix == 0) {
                sum += x;
            }
        }
        System.out.print(sum);
    }
}
