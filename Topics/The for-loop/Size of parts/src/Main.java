import java.util.*;

class Main {

    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tempProduct = 0;
        int perfectProduct = 0; // 0
        int fixed = 0;  // 1
        int defectPart = 0; // -1

        for (int i = 0; i < n; i++) {
            tempProduct = sc.nextInt();

            if (tempProduct == 1) {
                fixed++;
            } else if (tempProduct == -1) {
                defectPart++;
            } else if (tempProduct == 0) {
                perfectProduct++;
            }
        }

        System.out.print(java.text.MessageFormat.format("{0} {1} {2}", perfectProduct, fixed, defectPart));
    }
}