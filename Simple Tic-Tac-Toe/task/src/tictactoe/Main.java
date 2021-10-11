package tictactoe;

import java.util.Scanner;

public class Main {

    private static char[] aChr;
    private static final String line = "---------";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter cells:");
        String s = scanner.next().trim();
        ticTable(s);
    }

    static void ticTable(String s) {
        s = s.replace("", " ");
        aChr = s.toCharArray();

        System.out.println(line);
        for(int i = 0; i < aChr.length; i++) {
            if(i == 6 || i == 12 || i == 18) {
                System.out.print(" |");
                System.out.println();
            }
            if(i == 0 || i == 6 || i == 12) {
                System.out.print("|");
            }
            System.out.print(i < aChr.length - 1 ? aChr[i] : "");

        }
        System.out.print(line);
    }
}
