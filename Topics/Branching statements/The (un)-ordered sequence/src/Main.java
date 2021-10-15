import java.util.Arrays;
import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int one = 0;
        int two = 0;
        boolean tt = true;
        int i = 0;
        int count = 0;
        int countTwo = 0;
        int s = 0;
        while (sc.hasNext()) {
            arr.add(sc.nextInt());
        }

        while (tt) {

            if (arr.get(i) == arr.get(arr.size() - 1) | arr.get(i + 1) == 0) {
                break;
            } else {
                one = arr.get(i);
                two = arr.get(i + 1);
            }
            //System.out.println(two + " two ");

            if (one > two) {
                //System.out.println(one + " 1 cycle one > ");
                if (one >= two) {
                    countTwo++;
                } else {
                    countTwo--;
                }
            } else if (two > one){
                //System.out.println(two + " 2 cycle two > ");
                if (two >= one) {
                    count++;
                } else {
                    count--;
                }
            }
            s++;
            i++;
        }
        boolean t = s == count | s == countTwo ? true : false;
        System.out.println(t);
    }
}