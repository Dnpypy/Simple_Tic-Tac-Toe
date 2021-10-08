import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[4];
        int count = 0;
        while (sc.hasNext()) {
            arr[count] = sc.next();
            count++;
        }
        
        for (String s2: arr) {
            System.out.println(s2);
        }
    }
}
