import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
