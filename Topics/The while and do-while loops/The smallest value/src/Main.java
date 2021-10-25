import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long r = 1;
        int nums = 0;
        while (r <= n) {
            nums++;
            r = r * nums;
     
        }
        System.out.println(nums);
    }
}
