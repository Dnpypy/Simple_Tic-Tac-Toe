import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        final int t = 3;
        final int f = 5;
        for (int i = a; i <= b; i++) {
            if (i % t == 0 && i % f == 0) {
                System.out.println("FizzBuzz");
            } else {
                if (i % t == 0) {
                    System.out.println("Fizz"); 
                } else if (i % f == 0) {
                    System.out.println("Buzz");
                } else { 
                    System.out.println(i);   
                }
            }
        }
    }
}
