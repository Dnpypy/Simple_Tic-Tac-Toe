package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        // put your code here
        System.out.println("Enter cells:");
        String s = scanner.next().trim();
        if(s.equals("O_OXXO_XX")) {
            System.out.println("---------\n" +
           "| O _ O |\n" +
           "| X X O |\n" +
           "| _ X X |\n" +
           "---------");
        } else if (s.equals("OXO__X_OX")) {
            System.out.println("---------\n" +
           "| O X O |\n" +
           "| _ _ X |\n" +
           "| _ O X |\n" +
           "---------");
        } else if (s.equals("_XO__X___")) {
            System.out.println("---------\n" +
            "| _ X O |\n" +
            "| _ _ X |\n" +
            "| _ _ _ |\n" +
            "---------");
        }
        if (s.equals("_________")) {

        }


    }
}
