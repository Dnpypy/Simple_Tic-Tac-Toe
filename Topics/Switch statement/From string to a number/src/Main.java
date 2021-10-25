import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        final String a = "one";
        final String b = "two";
        final String c = "three";
        final String d = "four";
        final String e = "five";
        final String f = "six";
        final String h = "seven";
        final String g = "eight";
        final String k = "nine";
        switch (n) {
            case a:
                System.out.println(1);
                break;
            case b:
                System.out.println(2);
                break;
            case c:
                System.out.println(3);
                break;
            case d:
                System.out.println(4);
                break;
            case e:
                System.out.println(5);
                break;
            case f:
                System.out.println(6);
                break;
            case h:
                System.out.println(7);
                break;
            case g:
                System.out.println(8);
                break;
            case k:
                System.out.println(9);
                break;
            default:
                System.out.println("");
                break;
        }
    }
}