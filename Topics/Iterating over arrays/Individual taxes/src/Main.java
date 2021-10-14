import java.util.*;

class Main {
    // 100 000 × 4,8% / 365 = 13,15 Р
    // 50 * 10% / 365 =
    // 100 * 10% / 365 =
    //50 * (10*100/10) / 365 =
    public static Scanner sc = new Scanner(System.in);
    public static int[] arrN;
    public static int[] taxes;
    public static int count = 0;     // count company
    public static int incYear = 0;   // contains the yearly incomes of each company
    public static int percent = 0;  // individual taxes for each company in percent of the company's income

    //All numbers are integers from 0 to 100 inclusive.

    public static void main(String[] args) {
        // write your code here
        count = sc.nextInt();
        if (count == 1) {
            System.out.println(1);
        } else {
            //Maybe you forgot about zeros as incomes or zeros as percents?
            arrN = yearIncome();
            taxes = percentTaxes();
            System.out.println(countingPercent(arrN, taxes));
        }
    }

    public static int[] yearIncome() {
        arrN = new int[count];
        for (int i = 0; i < count; i++) {
            incYear = sc.nextInt();
            arrN[i] = incYear;
        }
        return Arrays.copyOf(arrN, arrN.length);
    }
    // второй метод можно не писать заполнить одним методом все массивы ! попробовать
    public static int[] percentTaxes() {
        taxes = new int[count];
        for (int i = 0; i < count; i++) {
            percent = sc.nextInt();
            taxes[i] = percent;
        }
        return Arrays.copyOf(taxes, taxes.length);
    }

    public static int countingPercent(int[] arr, int[] percent) {
        int[] itog = new int[count];
        int max = 0;
        int hundred = 100;
        int year = 365;
        for(int i = 0; i < count; i++){
            itog[i] = (int) arr[i] * (percent[i] * hundred / percent[i]) / year;
        }
        for(int i = 0; i < count; i++){
            if(i < count - 1 ) {
                if (itog[i] > itog[i + 1]){
                    max = itog[i];
                } else {
                    max = itog[i + 1];
                }
            }
        }
        return max;
    }

}