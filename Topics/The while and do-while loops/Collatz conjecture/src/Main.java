import java.util.*;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums = 1;

        if (n % 2 == 0) {
            nums = (n / 2);
            System.out.print(nums);
        } else if (n % 2 != 0) {
            while (nums != 1) {
                nums = ((n / 2) * 3) + 1;
                System.out.print(nums + " ");
            }
        }

    }
}