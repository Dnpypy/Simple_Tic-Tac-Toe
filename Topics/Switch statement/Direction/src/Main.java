import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int a = 1;
        final int b = 2;
        final int c = 3;
        final int d = 4;
        final int f = 0;

        switch (n) {
            case f:
                System.out.println("do not move");
                break;
            case a:
                System.out.println("move up");
                break;
            case b:
                System.out.println("move down");
                break;
            case c:
                System.out.println("move left");
                break;
            case d:
                System.out.println("move right");
                break;
            default:
                System.out.println("error!");
                break;
        }
    }
}