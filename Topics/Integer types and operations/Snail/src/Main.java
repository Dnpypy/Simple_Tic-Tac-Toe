import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int days = 1;
        int feetsUp = a;
        while (feetsUp < h) {
            feetsUp = (feetsUp - b) + a;
            days++;
        }
        System.out.println(days);
        
    }
}
