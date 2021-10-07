
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase().trim();
        String substring = "burg";

        // array - > ArrayList + delete whitespace
        List<String> l2 = Arrays.asList(s.split(" "));

        // last element array
        String lastS = l2.get(l2.size() - 1);

        boolean tr = lastS.contains(substring) ? true : false;
        System.out.println(tr);
    }
}