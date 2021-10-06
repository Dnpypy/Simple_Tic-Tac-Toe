import java.util.*;


class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aa = sc.nextInt();
        int bb = sc.nextInt();
        int hh = sc.nextInt();
        
        if (hh < aa) {
            System.out.print("Deficiency");  
        } else if (hh > bb) {
            System.out.print("Excess");
        } else {
            System.out.print("Normal");
        }
        
        
    }
}
