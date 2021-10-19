import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int neW = sc.nextInt();
        int n = 0;
        int second = 0;
//        boolean t = false;
//        if (neW > 9 && neW < 100) {
//            n = neW / 10;   // 61 / 10 = 6
//            neW = n;
//            second = neW % 10;  // 61 % 10 = 1
//            t = true;
//        }

        int[] arr = new int[neW];
        int count;
        int j = 0;

        //while (j != neW) {
        while (sc.hasNext()) {
//            if (j < 1 && t == true) {
//                arr[j] = second;
//                j++;
//            }

            count = sc.nextInt();
            arr[j] = count;
            j++;
        }

        int asc = 0;
        int triple = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != arr[arr.length - 1]) {
                if (arr[i] < arr[i + 1] && arr[i + 1] == arr[i] + 1 ) {
                    asc++;
                    if (asc % 2 == 0) {
                        triple++;
                    }
                }
            }
        }
        System.out.print(triple);
    }
}