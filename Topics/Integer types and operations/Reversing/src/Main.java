import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        int countLeft = 0;
        int lastNum = 0;
        final int ten = 10;
        int sign = num > 0 ? 1 : -1;

        while (num > 0) {
            lastNum = num % ten;
            countLeft = countLeft * ten + lastNum;
            num = num / ten;
        }
        System.out.print(countLeft * sign);
    }
}