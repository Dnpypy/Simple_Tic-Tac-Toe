import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        char chJ = 'J';
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        char theFirstChar = s.charAt(0);
        if (chJ == theFirstChar) {
            System.out.print(true);
        } else {
            System.out.print(false); 
        }
    }
}
