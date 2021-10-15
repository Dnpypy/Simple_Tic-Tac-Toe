import java.util.*;

class Main {

    public static Scanner sc = new Scanner(System.in);
    public static double[] arrN;
    public static double[] taxes;
    public static int count = 0;     // count company
    public static double incYear = 0.0;   // contains the yearly incomes of each company
    public static double percent = 0.0;  // individual taxes for each company in percent of the company's income

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

    public static double[] yearIncome() {
        arrN = new double[count];
        for (int i = 0; i < count; i++) {
            incYear = sc.nextDouble();
            arrN[i] = incYear;
        }
        return Arrays.copyOf(arrN, arrN.length);
    }

    public static double[] percentTaxes() {
        taxes = new double[count];
        for (int i = 0; i < count; i++) {
            percent = sc.nextDouble();
            taxes[i] = percent;
        }
        return Arrays.copyOf(taxes, taxes.length);
    }
    // for the calculation this may help: (income * tax) / 100
    public static int countingPercent(double[] arr, double[] percent) {
        double[] itog = new double[count];
        double max = -9999.0;
        double hundred = 100.0;

        int odd = 0;
        for(int i = 0; i < count; i++){
            if (percent[i] == 0.0) {
                percent[i] = 0.01;
                itog[i] = arr[i] /  hundred * percent[i];
            } else {
                itog[i] = arr[i] /  hundred * percent[i];
            }
        }

        for(int i = 0; i < count; i++){
                if (max < itog[i]) {
                    max = itog[i];
                    odd = i + 1;
                }
        }
        return odd;
    }

}