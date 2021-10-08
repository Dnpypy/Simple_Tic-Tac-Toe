import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        String s = sc.next();
        int a = Character.getNumericValue(s.charAt(0));
        int b = Character.getNumericValue(s.charAt(1));
        int c = Character.getNumericValue(s.charAt(2));
        System.out.print(a + b + c);
    }
}
