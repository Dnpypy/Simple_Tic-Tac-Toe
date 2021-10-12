package tictactoe;

import java.util.Scanner;

public class Main {

    private static final String line = "---------";
    private static final int SIZE = 3;
    private static final char[][] arrTic = new char[SIZE][SIZE];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter cells:");
        String s = sc.nextLine();
        matrixadd(s);
        print(arrTic);

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

}