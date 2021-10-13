import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        final int c = sc.nextInt();
        final int d = sc.nextInt();
        final int thousand = 1000;
        for (int i = 0; i < thousand; i++) {
            if ((a * (i * i * i)) + (b * (i * i)) + (c * i) + d == 0) {
                System.out.println(i);
            }
        }

    }
}