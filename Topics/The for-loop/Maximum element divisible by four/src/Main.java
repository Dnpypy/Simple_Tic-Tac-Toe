import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int maxElement = 0;
        final int four = 4;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n % four == 0 && maxElement < n) {
                maxElement = n;
            }
        }

        System.out.println(maxElement);
    }
}