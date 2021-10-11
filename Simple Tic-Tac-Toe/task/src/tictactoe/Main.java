package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells:");
        String s = scanner.next().trim();
        s = s.replace("", " ");

        final String line = "---------";
        char[] aChr = s.toCharArray();

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
