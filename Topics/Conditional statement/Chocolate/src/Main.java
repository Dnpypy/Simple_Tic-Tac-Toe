import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here When K > N * M then answer is "NO"
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt();
        int k = sc.nextInt();
        if (k > n * m) {
            System.out.print("NO");
        } else if (k % m == 0 || k % n == 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        
    }
}
