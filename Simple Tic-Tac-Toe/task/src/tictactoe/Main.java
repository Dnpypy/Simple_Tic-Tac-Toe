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

        String s = sc.nextLine();  // "X_X_O____"
        matrixAdd (s);   // <----"X_X_O____"
        printMatrix(arrTic);  // <---- | "X_X_O____"\n|
        //currentBoard(s);
        System.out.print("Enter the coordinates: ");
        //String n = sc.next();
        //String m = sc.next();

        checkInNumbers(n, m);
        moveFirst(n, m);
        printMatrix(arrTic);
        lastCheckingStatus(s);
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

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
                } else if (arrTic[p - 1][f - 1] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    swiTch = false; // while close
                }

            } else {
                System.out.println("You should enter numbers!");
                //System.out.print(false);
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
        //System.out.println(Arrays.deepToString(arrChar)); [[X, _, X], [_, O, _], [_, _, _]]
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
        // a = 3, b = 1;
        int d = Integer.parseInt(a);
        int c = Integer.parseInt(b);
        d = d - 1; // 2
        c = c - 1; // 0
        int p = 0;
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                //arrTic[i][j] = str.charAt(p);
                // char replacing _ with spaces
                if (arrTic[i][j] == arrTic[d][c]){ // 2 0
                    //  System.out.println(arrTic[i][j] + " arrTic[i][j] ");
                    // if (arrTic[i][j] == 'X') {
                    //     System.out.print("This cell is occupied! Choose another one!");
                    // }
                    arrTic[d][c] = 'X';
                    break;
                }
                p++;
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
        //
        variant.forEach((key, value) -> {
            if (key.equals(str)) {
                System.out.println(value);
            }
        });
        return str;
    }

}