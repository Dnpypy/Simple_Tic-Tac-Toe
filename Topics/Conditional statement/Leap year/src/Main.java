import java.util.*;

class Main {

    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        final int year = sc.nextInt();
        final int four = 4;
        final int oneHundred = 100;
        final int fourHundred = 400;

        if (year % four == 0 && year % oneHundred != 0) {
            System.out.println("Leap");
        } else if (year % fourHundred == 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}