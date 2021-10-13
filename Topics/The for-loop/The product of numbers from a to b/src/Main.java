import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        // 100 101 102 103 104
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long multi = 1;
        for (int i = a; i < b; i++) {
            multi = multi * i;
        }
        System.out.println(multi);
    }
}