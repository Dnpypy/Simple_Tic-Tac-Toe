import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        int day = sc.nextInt();
        int foodDay = sc.nextInt();
        int flightCost = sc.nextInt();  // one-way
        int costNight = sc.nextInt();
        
        int totalAmount = (foodDay * day + flightCost * 2 + costNight * day - costNight);
        System.out.print(totalAmount);
    }
}
