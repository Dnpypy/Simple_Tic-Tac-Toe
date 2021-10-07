import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim().replaceAll("\\s", "");
        String s2 = sc.nextLine().trim().replaceAll("\\s", "");
        boolean str = s.equals(s2) ? true : false;
        System.out.print(str);
    }
}
