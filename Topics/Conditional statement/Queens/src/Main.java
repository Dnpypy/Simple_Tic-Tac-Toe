import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here 
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(); 
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        
        if (x1 == y1) {
            System.out.print("YES");
        } else if (x2 == y2) {
            System.out.print("YES");
        } else if (Math.abs(y1 - x1) == Math.abs(y2 - x2)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        
        
    }
}
