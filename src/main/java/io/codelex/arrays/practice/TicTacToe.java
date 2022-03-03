package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        initBoard();
        displayBoard();

        System.out.println("Game is started");
        int movesCount = 0;
        boolean isEnd = false;
        boolean noWinner = false;
        do {
            int i = 0;
            int j = 0;
            System.out.println("X turn");
            boolean validationX = false;
            boolean inputValidX = false;
            do {
                do {
                    i = keyboard.nextInt();
                    j = keyboard.nextInt();
                    if (!inputValidation(i) || !inputValidation(j)) {
                        System.out.println("Enter must be 0,1 or 2");
                    } else {
                        inputValidX = true;
                    }
                } while (!inputValidX);

                if (!movesX(i, j)) {
                    System.out.println("Not possible to overwrite");
                    System.out.println("Try again?");
                } else {
                    validationX = true;
                }
            }

            while (!validationX);
            displayBoard();
            movesCount++;
            if (movesCount == 9 || whoWon()) {
                isEnd = true;
                noWinner = false;
                break;
            }
            int o = 0;
            int q = 0;
            boolean validationO = false;
            boolean inputValidO = false;
            System.out.println("O turn");
            do {
                do {
                    o = keyboard.nextInt();
                    q = keyboard.nextInt();
                    if (!inputValidation(o) || !inputValidation(q)) {
                        System.out.println("Enter must be 0,1 or 2");
                    } else {
                        inputValidO = true;
                    }
                } while (!inputValidO);

                if (!movesO(o, q)) {
                    System.out.println("Not possible to overwrite");
                    System.out.println("Try again?");
                } else {
                    validationO = true;
                }
            } while (!validationO);
            displayBoard();
            movesCount++;
            if (movesCount == 9 || whoWon()) {
                isEnd = true;
                noWinner = false;
                break;
            }
        }
        while (!(movesCount > 8));

        System.out.println("Game Over");
        if (noWinner && isEnd) {
            System.out.println("No winner");
        }
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static boolean inputValidation(int i) {
        boolean inputIsValid = false;
        if (i >= 0 && i <= 2) {
            inputIsValid = true;
        }
        return inputIsValid;
    }

    public static boolean movesX(int i, int j) {
        boolean xReturn = false;
        if ((String.valueOf(board[i][j])).equals("X") || (String.valueOf(board[i][j])).equals("O")) {
            xReturn = false;
        } else {
            board[i][j] = 'X';
            xReturn = true;
        }
        return xReturn;
    }

    public static boolean movesO(int o, int q) {
        boolean oReturn = false;
        if ((String.valueOf(board[o][q])).equals("X") || (String.valueOf(board[o][q])).equals("O")) {
            oReturn = false;
        } else {
            board[o][q] = 'O';
            oReturn = true;
        }
        return oReturn;
    }

    public static boolean validationX() {
        boolean xWon = false;
        if ((String.valueOf(board[0][0])).equals("X") && (String.valueOf(board[0][1])).equals("X") && (String.valueOf(board[0][2])).equals("X")) {
            xWon = true;
        } else if ((String.valueOf(board[1][0])).equals("X") && (String.valueOf(board[1][1])).equals("X") && (String.valueOf(board[1][2])).equals("X")) {
            xWon = true;
        } else if ((String.valueOf(board[2][0])).equals("X") && (String.valueOf(board[2][1])).equals("X") && (String.valueOf(board[2][2])).equals("X")) {
            xWon = true;
        } else if ((String.valueOf(board[0][0])).equals("X") && (String.valueOf(board[1][0])).equals("X") && (String.valueOf(board[2][0])).equals("X")) {
            xWon = true;
        } else if ((String.valueOf(board[0][1])).equals("X") && (String.valueOf(board[1][1])).equals("X") && (String.valueOf(board[2][1])).equals("X")) {
            xWon = true;
        } else if ((String.valueOf(board[0][2])).equals("X") && (String.valueOf(board[1][2])).equals("X") && (String.valueOf(board[2][2])).equals("X")) {
            xWon = true;
        } else if ((String.valueOf(board[0][0])).equals("X") && (String.valueOf(board[1][1])).equals("X") && (String.valueOf(board[2][2])).equals("X")) {
            xWon = true;
        } else if ((String.valueOf(board[2][0])).equals("X") && (String.valueOf(board[1][1])).equals("X") && (String.valueOf(board[0][2])).equals("X")) {
            xWon = true;
        }
        return xWon;
    }

    public static boolean validationO() {
        boolean oWon = false;
        if ((String.valueOf(board[0][0])).equals("O") && (String.valueOf(board[0][1])).equals("O") && (String.valueOf(board[0][2])).equals("O")) {
            oWon = true;
        } else if ((String.valueOf(board[1][0])).equals("O") && (String.valueOf(board[1][1])).equals("O") && (String.valueOf(board[1][2])).equals("O")) {
            oWon = true;
        } else if ((String.valueOf(board[2][0])).equals("O") && (String.valueOf(board[2][1])).equals("O") && (String.valueOf(board[2][2])).equals("O")) {
            oWon = true;
        } else if ((String.valueOf(board[0][0])).equals("O") && (String.valueOf(board[1][0])).equals("O") && (String.valueOf(board[2][0])).equals("O")) {
            oWon = true;
        } else if ((String.valueOf(board[0][1])).equals("O") && (String.valueOf(board[1][1])).equals("O") && (String.valueOf(board[2][1])).equals("O")) {
            oWon = true;
        } else if ((String.valueOf(board[0][2])).equals("O") && (String.valueOf(board[1][2])).equals("O") && (String.valueOf(board[2][2])).equals("O")) {
            oWon = true;
        } else if ((String.valueOf(board[0][0])).equals("O") && (String.valueOf(board[1][1])).equals("O") && (String.valueOf(board[2][2])).equals("O")) {
            oWon = true;
        } else if ((String.valueOf(board[2][0])).equals("O") && (String.valueOf(board[1][1])).equals("O") && (String.valueOf(board[0][2])).equals("O")) {
            oWon = true;
        }
        return oWon;
    }

    public static boolean whoWon() {
        boolean whoWon = false;
        if (validationO()) {
            System.out.println("O Won");
            whoWon = true;
        } else if (validationX()) {
            System.out.println("X Won");
            whoWon = true;
        }
        return whoWon;
    }


    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}
