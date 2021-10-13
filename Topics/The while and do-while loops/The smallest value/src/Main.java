import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = 1;
        int count = 0;

        for (int i = 1; i <= n; i++) {
           // 1 = 1 * 1; 1 = 1 * 2; 2 = 2 * 3; 6 = 6 * 4
            result = result * i;
            count++;
        }
        System.out.println(count);

//        int i,fact=1;
//        int number=5;//It is the number to calculate factorial
//        for(i=1;i<=number;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
}