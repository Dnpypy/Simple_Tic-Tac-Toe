import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble(); // money
        double p = sc.nextDouble(); // percent
        double k = sc.nextDouble(); // money ++
        int year = 0;
        final int hundred = 100;
        while (m < k) {
            m = m + m * p / hundred;
            year++;
        }
        System.out.println(year);
    }
}