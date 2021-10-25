import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        final String a = "gryffindor";
        final String b = "hufflepuff";
        final String c = "slytherin";
        final String d = "ravenclaw";

        switch (n) {
            case a:
                System.out.println("bravery");
                break;
            case b:
                System.out.println("loyalty");
                break;
            case c:
                System.out.println("cunning");
                break;
            case d:
                System.out.println("intellect");
                break;
            default:
                System.out.println("not a valid house");
                break;
        }
    }
}