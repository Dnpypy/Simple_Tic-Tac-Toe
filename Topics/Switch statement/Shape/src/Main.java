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
        switch (n) {
            case a:
                System.out.println("You have chosen a square");
                break;
            case b:
                System.out.println("You have chosen a circle");
                break;
            case c:
                System.out.println("You have chosen a triangle");
                break;
            case d:
                System.out.println("You have chosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
                break;
        }
    }
}