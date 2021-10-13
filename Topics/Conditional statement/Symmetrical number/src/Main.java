import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p1;
        int p2;
        int hundred = 100;
        int ten = 10;
        p1 = n / hundred;
        p2 = n % hundred;
        p2 = p2 % ten * ten + p2 / ten;
        System.out.println((p2 - p1) + 1);

    }
}