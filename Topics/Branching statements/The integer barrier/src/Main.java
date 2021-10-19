import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = 1;
        final int thousand = 1000;
        while (n != 0) {
            n = sc.nextInt();
            sum = sum + n;
            if (sum >= thousand) {
                sum = sum - thousand;
                break;
            }
        }
        System.out.println(sum);
    }
}