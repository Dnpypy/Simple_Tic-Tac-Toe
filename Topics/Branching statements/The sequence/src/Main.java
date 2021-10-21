import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (count == n) {
                    break;
                }
                count++;
                System.out.print(i + " ");
            }
        }
    }
}