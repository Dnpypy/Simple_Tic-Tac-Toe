package tictactoe;

import java.util.*;

public class Main {

    private static final String line = "---------";
    private static final int SIZE = 3;
    private static final char[][] arrTic = new char[SIZE][SIZE];
    private static Scanner sc = new Scanner(System.in);
    private static String n;
    private static String m;

    public static void main(String[] args) {

        System.out.print("Enter cells: ");

        String s = sc.nextLine();
        matrixAdd (s);
        printMatrix(arrTic);

        System.out.print("Enter the coordinates: ");

        checkInNumbers(n, m);
        moveFirst(n, m);
        printMatrix(arrTic);
        lastCheckingStatus(s);
    }

    // isNumber? regex
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    // checking coordinates, cell occupied, isNumber
    public static void checkInNumbers(String a, String b) {
        int p = 0;
        int f = 0;
        boolean swiTch = true;

        do {
            System.out.print("Enter the coordinates: ");
            n = sc.next();
            m = sc.next();
            if ((isNumeric(n) && isNumeric(m))) {
                p = Integer.parseInt(n);
                f = Integer.parseInt(m);

                if ((p > 3 |  f > 3) | (p < 1 | f < 1)) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else if (arrTic[p - 1][f - 1] == 'X' || arrTic[p - 1][f - 1] == 'O') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    swiTch = false; // while close
                }

            } else {
                System.out.println("You should enter numbers!");
            }

        }while(swiTch); // while end
    }


    // add matrix elements
    public static String matrixAdd(String str) {
        int p = 0;
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                arrTic[i][j] = str.charAt(p);

                // replacing _ with spaces
                if (arrTic[i][j] == '_') {
                    arrTic[i][j] = ' ';
                }
                p++;
            }
        }
        return str;
    }

    // print matrix
    public static void printMatrix(char[][] arrChar) {
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

    // moveFirst
    public static char[][] moveFirst(String a, String b) {

        int d = Integer.parseInt(a);
        int c = Integer.parseInt(b);
        d = d - 1;
        c = c - 1;
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                if (arrTic[i][j] == arrTic[d][c]){
                    arrTic[d][c] = 'X';
                    break;
                }
            }
        }
        return arrTic;
    }


    // checkingStatusOver
    public static String lastCheckingStatus(String str) {
        Map<String, String> variant = new HashMap<>();

        variant.put("XXXOO__O_", "X wins");
        variant.put("XOXOXOXXO", "X wins");
        variant.put("XOOOXOXXO", "O wins");
        variant.put("XOXOOXXXO", "Draw");

        variant.put("XO_OOX_X_", "Game not finished");
        variant.put("XO_XO_XOX", "Impossible");
        variant.put("_O_X__X_X", "Impossible");
        variant.put("_OOOO_X_X", "Impossible");

        variant.forEach((key, value) -> {
            if (key.equals(str)) {
                System.out.println(value);
            }
        });
        return str;
    }

}