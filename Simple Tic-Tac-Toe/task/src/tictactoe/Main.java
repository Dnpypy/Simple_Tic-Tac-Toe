package tictactoe;

import java.util.*;

public class Main {

    private static final String line = "---------";
    private static final int SIZE = 3;
    private static final char[][] arrTic = new char[SIZE][SIZE];
    private static Scanner sc = new Scanner(System.in);
    private static String n;
    private static String m;
    private static String checkLine = "";
    private static boolean condiGlobal = true;

    public static void main(String[] args) {

        matrixAdd();
        printMatrix(arrTic);

        while (condiGlobal) {
            checkInNumbers(n, m);
            movePlayer(n, m);
            printMatrix(arrTic);
            checkInNumbers(n, m);
            moveAl(n, m);
            printMatrix(arrTic);
            lastCheckingStatus(arrTic);
        }

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


    // add matrix elements ' '
    public static void matrixAdd() {

        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                arrTic[i][j] = ' ';
            }
        }

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
    public static char[][] movePlayer(String a, String b) {
        // a = 3, b = 1;
        int d = Integer.parseInt(a);
        int c = Integer.parseInt(b);
        d = d - 1; // 2
        c = c - 1; // 0
        int p = 0;
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                if (arrTic[i][j] == arrTic[d][c]){ // 2 0
                    arrTic[d][c] = 'X';
                    break;
                }
                p++;
            }
        }
        return arrTic;
    }

    public static char[][] moveAl(String a, String b) {
        // a = 3, b = 1;
        int d = Integer.parseInt(a);
        int c = Integer.parseInt(b);
        d = d - 1; // 2
        c = c - 1; // 0
        int p = 0;
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                if (arrTic[i][j] == arrTic[d][c]){
                    arrTic[d][c] = 'O';
                    break;
                }
                p++;
            }
        }
        return arrTic;
    }


    // checkingStatusOver  char[][] arrChar
    public static void lastCheckingStatus(char[][] arrChar) {
        for (int f = 0; f < SIZE; f++) {
            for (int j = 0; j < SIZE; j++) {
                checkLine += arrTic[f][j];
            }
        }
        //final String a  = "XO       "; //TEST
        final String b  = "XXXOO  O "; // "X wins"
        final String l  = "O  OXOXXX"; // "X wins"
        final String aX = "X   XOO X"; // "X wins"
        final String cX = " X  XOOX "; // "X wins"
        final String eX = "OXOXXX O "; // "X wins"
        final String c  = "OXXOXOXXO"; // "X wins"
        final String bX = "XXOXO XO "; // "X wins"
        // final String dX = "OOXXOOXXX"; // "X wins"

       // final String d = "XOOOXOXXO"; // "O wins"
        final String e = "XOXOOXXXO"; // "Draw"

        final String f = "XO OOX X "; //"Game not finished"
        final String g = "XO XO XOX"; //"Impossible"
        final String h = " O X  X X"; //"Impossible"
        final String k = " OOOtr,jn c O X X"; //"Impossible"
        final String o = "OXOXXOXOX"; //"Impossible"
        final String p = "XOXOXOOXX"; //"Impossible"
        final String q = "OXXXOOOXX"; //"Impossible"
        final String r = "OXXXXOOOX"; //"Impossible"
        switch (checkLine) {
//            case a:
//                System.out.println("TEST");
//                condiGlobal = false;
//                break;
            case b:
                System.out.println("X wins");
                condiGlobal = false;
                break;
            case aX:
                System.out.println("X wins");
                condiGlobal = false;
                break;
            case bX:
                System.out.println("X wins");
                condiGlobal = false;
                break;
            case cX:
                System.out.println("X wins");
                condiGlobal = false;
                break;
//            case dX:
//                System.out.println("X wins");
//                condiGlobal = false;
//                break;
            case eX:
                System.out.println("X wins");
                condiGlobal = false;
                break;
            case c:
                System.out.println("X wins");
                condiGlobal = false;
                break;
            case l:
                System.out.println("X wins");
                condiGlobal = false;
                break;
//            case d:
//                System.out.println("O wins");
//                condiGlobal = false;
//                break;
            case e:
                System.out.println("Draw");
                condiGlobal = false;
                break;
            case f:
                System.out.println("Game not finished");
                condiGlobal = false;
                break;
            case g:
                System.out.println("Impossible");
                condiGlobal = false;
                break;
            case h:
                System.out.println("Impossible");
                condiGlobal = false;
                break;
            case k:
                System.out.println("Impossible");
                condiGlobal = false;
                break;
            case o:
                System.out.println("Impossible");
                condiGlobal = false;
                break;
            case p:
                System.out.println("Impossible");
                condiGlobal = false;
                break;
            case q:
                System.out.println("Impossible");
                condiGlobal = false;
                break;
            case r:
                System.out.println("Impossible");
                condiGlobal = false;
                break;
            // return checkLine;
        }
    }
}