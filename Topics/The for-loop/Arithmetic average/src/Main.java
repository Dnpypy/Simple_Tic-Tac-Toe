import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        final int c = 3;
        int count = 0;
        double sum = 0.0;

        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                sum += i;
                count++;
            }
        }
        sum = sum / count;
        System.out.println(sum);
    }
}