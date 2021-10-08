import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.print(--n + " ");
        }
    }
}
