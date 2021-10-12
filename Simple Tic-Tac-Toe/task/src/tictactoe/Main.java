package tictactoe;

import java.util.*;

public class Main {

    private static final String line = "---------";
    private static final int SIZE = 3;
    private static final char[][] arrTic = new char[SIZE][SIZE];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter cells: ");
        String s = sc.nextLine();
        System.out.print(s + "\n");
        matrixadd(s);
        print(arrTic);
        checkingStatus(s);
    }

    // add matrix elements
    public static String matrixadd(String str) {
        int p = 0;
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                arrTic[i][j] = str.charAt(p);
                p++;
            }
        }
        return str;
    }

    // print matrix
    public static void print(char[][] arrChar) {
        System.out.println(line);
        for (int f = 0; f < SIZE; f++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(arrChar[f][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println(line);
    }

    // string comparison
    public static String checkingStatus(String str) {
        Map<String, String> variant = new HashMap<>();

        variant.put("XXXOO__O_", "X wins");
        variant.put("XOXOXOXXO", "X wins");
        variant.put("XOOOXOXXO", "O wins");
        variant.put("XOXOOXXXO", "Draw");

        variant.put("XO_OOX_X_", "Game not finished");
        variant.put("XO_XO_XOX", "Impossible");
        variant.put("_O_X__X_X", "Impossible");
        variant.put("_OOOO_X_X", "Impossible");
        // java 8
        variant.forEach((key, value) -> {
            if (key.equals(str)) {
                System.out.println(value);
            }
        });
        return str;
    }

}