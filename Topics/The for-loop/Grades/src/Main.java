import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = {0, 0, 0, 0};
        int tempPoint;
        for (int i = 0; i < n; i++) {
            tempPoint = sc.nextInt();
            if (tempPoint == 2) {
                nums[0]++;
            } else if (tempPoint == 3) {
                nums[1]++;
            } else if (tempPoint == 4) {
                nums[2]++;
            } else if (tempPoint == 5) {
                nums[3]++;
            }
        }
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2] + " " + nums[3]);
    }
}
