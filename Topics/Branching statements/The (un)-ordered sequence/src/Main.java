import java.util.Arrays;
import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int neW = sc.nextInt();
        int olD = neW;

        int asc = 0;  // >>>>>>
        int desc = 0; /// <<<<<<<<
        int countOfNumbers = 0;
        countOfNumbers++;
        asc++;
        desc++;


        while (sc.hasNext()) {
            neW = sc.nextInt();
            if (neW == 0) {
                break;
            }
            if (olD == neW) {
                asc++;
                desc++;
            }

            if (olD > neW) {
                asc++;
            } else if (neW > olD) {
                desc++;
            }
            countOfNumbers++;
            olD = neW;
        }
        System.out.print(countOfNumbers == asc || countOfNumbers == desc);
    }
}