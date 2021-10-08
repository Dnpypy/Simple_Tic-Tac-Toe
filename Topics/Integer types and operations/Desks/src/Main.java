import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        int sum = 0;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n / 2;
            } else if (n % 2 != 0) {
                sum += n / 2 + 1;
            }
        }
        System.out.print(sum);
        
        
    }
}
