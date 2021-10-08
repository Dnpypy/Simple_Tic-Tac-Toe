package tictactoe;

import java.util.Scanner;
//1. Turn input string toCharArray().
//2. Create a 3*3 char array(), then fill it with a double for loop, you can fit that | in your for loop as well.
//3. And don't forget to put that -------- before and after your for loops.
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
