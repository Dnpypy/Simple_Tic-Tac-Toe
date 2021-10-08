import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        
        int sum = (( d * 3600 + e * 60 + f ) - ( a * 3600 + b * 60 + c ));
        System.out.print(sum);
    }
}
