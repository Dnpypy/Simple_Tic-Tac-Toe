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
    private final static cross = 'X';
    private final static zero = 'O';
    private static boolean condiGlobal = true;

    public static void main(String[] args) {

        int player1 = 0;
        int player2 = 0;
        matrixAdd();
        printMatrix(arrTic);

        while (condiGlobal) {
            checkInNumbers(n, m);
            movePlayer(n, m);
            printMatrix(arrTic);
            checkInNumbers(n, m);
            moveAl(n, m);
            printMatrix(arrTic);
            // можно добавить проверку доски на заполненость
            if (isBoardFull(arrTic) && true) break;
        }
        // iswin?
        //winner
        lastCheckingStatus(arrTic);

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

    public static char[][] moveAl(String a, String b) {

        int d = Integer.parseInt(a);
        int c = Integer.parseInt(b);
        d = d - 1;
        c = c - 1;

        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                if (arrTic[i][j] == arrTic[d][c]){
                    arrTic[d][c] = 'O';
                    break;
                }

            }
        }
        return arrTic;
    }

    // еще не проверен метод.....
    public static boolean isBoardFull(char[][] arrChar) {
        boolean isFull = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arrChar[i][j] == ' ') {
                    isFull = false;
                }
            }
        }

        return isFull;
    }
    // checkingStatusOver  char[][] arrChar
    public static void lastCheckingStatus(char[][] arrChar) {
        for (int f = 0; f < SIZE; f++) {
            for (int j = 0; j < SIZE; j++) {
                checkLine += arrChar[f][j];
            }
        }
        final String a  = "OXXXOXOOX"; // x wins
        final String b  = "XXXOO  O "; // "X wins"
        final String l  = "O  OXOXXX"; // "X wins"
        final String aX = "X   XOO X"; // "X wins"
        final String cX = " X  XOOX "; // "X wins"
        final String eX = "OXOXXX O "; // "X wins"
        final String c  = "OXXOXOXXO"; // "X wins"
        final String bX = "XXOXO XO "; // "X wins"
        //final String dX = "OXXXOXOOX"; // "X wins"
        //==final String e = "XOXOOXXXO"; // "X wins"


       // final String d = "XOOOXOXXO"; // "O wins"


        final String f = "XO OOX X "; //"Game not finished"
        final String g = "XO XO XOX"; //"Impossible"
        final String h = " O X  X X"; //"Impossible"
        final String k = " OOOO X X"; //"Impossible"
        final String o = "OXOXXOXOX"; //"Impossible"
        final String p = "XOXOXOOXX"; //"Impossible"
        final String q = "OXXXOOOXX"; //"Impossible"
        final String r = "OXXXXOOOX"; //"Impossible"
        final String aO = "OXOOXXO X"; //"Impossible"
        switch (checkLine) {
            case a:
                System.out.println("TEST");
                condiGlobal = false;
                break;
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
     //           break;
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
            case aO:
                System.out.println("O wins");
                condiGlobal = false;
                break;
//            case e:
//                System.out.println("Draw");
//                condiGlobal = false;
//                break;
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