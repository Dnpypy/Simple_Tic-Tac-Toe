package tictactoe;

import java.util.*;

public class Main {

    private static final String line = "---------";
    private static final int SIZE = 3;
    private static final char[][] arrTic = new char[SIZE][SIZE];
    private static final Scanner sc = new Scanner(System.in);
    private static String n;
    private static String m;
    private static boolean condiGlobal = true;
    private static char play = 'X';
    private static boolean isWinBool;

    public static void main(String[] args) {


        matrixAdd();
        printMatrix(arrTic);

        while (condiGlobal) {
            checkInNumbers(n, m);
            movePlayer(n, m);
            printMatrix(arrTic);
            play = 'X';
            isWinBool = isWin();
            if (!condiGlobal) break;

            // check full board
            if (isBoardFull(arrTic)) {
                condiGlobal = false;
                break;
            }

            checkInNumbers(n, m);
            moveAl(n, m);
            printMatrix(arrTic);
            play = 'O';
            isWinBool = isWin();
            if (!condiGlobal) break;
        }
        winner();


    }

    private static void winner() {
         if (play == 'X' && isWinBool) {
             System.out.println("X wins");
         } else if (play == 'O' && isWinBool) {
             System.out.println("O wins");
         } else {
             System.out.println("Draw");
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

                if ((p > 3 | f > 3) | (p < 1 | f < 1)) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else if (arrTic[p - 1][f - 1] == 'X' || arrTic[p - 1][f - 1] == 'O') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    swiTch = false; // while close
                }

            } else {
                System.out.println("You should enter numbers!");
            }

        } while (swiTch); // while end
    }


    // add matrix elements ' '
    public static void matrixAdd() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
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

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arrTic[i][j] == arrTic[d][c]) {
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

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arrTic[i][j] == arrTic[d][c]) {
                    arrTic[d][c] = 'O';
                    break;
                }
            }
        }
        return arrTic;
    }

    public static boolean isBoardFull(char[][] arrChar) {
        boolean isFull = true;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arrChar[i][j] == ' ') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    // checkingStatus
    private static boolean isWin() {
        if (checkRow()) return true;
        if (checkColumn()) return true;
        if (checkDiagonal()) return true;
        return false;
    }

    private static boolean checkDiagonal() {
        if ((arrTic[1][1] == arrTic[0][0] && arrTic[1][1] == arrTic[2][2]) ||
                (arrTic[1][1] == arrTic[0][2] && arrTic[1][1] == arrTic[2][0])) {
            if (arrTic[1][1] != ' ') {
                condiGlobal = false;
                return true;
            }
        }
        return false;
    }

    private static boolean checkColumn() {
        for (int i = 0; i < SIZE; i++) {
            if (arrTic[0][i] == arrTic[1][i] && arrTic[0][i] == arrTic[2][i]) {
                if (arrTic[0][i] != ' ') {
                    condiGlobal = false;
                    return true;
                }
            }
        }
        return false;
    }


    private static boolean checkRow() {
        for (int i = 0; i < SIZE; i++) {
            if (arrTic[i][0] == arrTic[i][1] && arrTic[i][0] == arrTic[i][2]) {
                if (arrTic[i][0] != ' ') {
                    condiGlobal = false;
                    return true; //because char ' ' is empty
                }
            }

        }
        return false;
    }
}

