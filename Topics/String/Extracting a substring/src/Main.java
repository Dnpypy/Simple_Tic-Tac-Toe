
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = s.substring(a, b + 1);
        System.out.println(c);
    }
}