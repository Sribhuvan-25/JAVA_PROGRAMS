//Name: Sribhuvan Reddy Yellu
//Date: 02/12/2021
//Title: Tic Tac Toe

// This program allows a two users to play the tic tac toe game.

import java.util.*;
public class TicTac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to play TicTacToe game! We have the following 3x3 empty board.");
        System.out.println("-------------"); // Basic structure of the game board
        char[][] board = {{':', ' ', '-', ' ', ':', ' ', '-', ' ', ':', ' ', '-', ' ', ':'},
                {':', ' ', '-', ' ', ':', ' ', '-', ' ', ':', ' ', '-', ' ', ':'},
                {':', ' ', '-', ' ', ':', ' ', '-', ' ', ':', ' ', '-', ' ', ':'}};
        board_print(board); // Calling the method to print the game board
        System.out.println("-------------");
// Put a case for draw
        int counter = 0;
        while (counter<9) { // This loop calls the grameplay method and checks for the win combination
            gameplay(board, "Player 1"); // Calling the gameplay method for player 1
            // All these are the winning conditions for player 1
            if (board[0][2] == 'x' && board[0][6] == 'x' && board[0][10] == 'x') break;
            else if (board[1][2] == 'x' && board[1][6] == 'x' && board[1][10] == 'x') break;
            else if (board[2][2] == 'x' && board[2][6] == 'x' && board[2][10] == 'x') break;
            else if (board[0][2] == 'x' && board[1][2] == 'x' && board[2][2]  == 'x') break;
            else if (board[0][6] == 'x' && board[1][6] == 'x' && board[2][6]  == 'x') break;
            else if (board[0][10] =='x' && board[1][10] =='x' && board[2][10] == 'x') break;
            else if (board[0][2] == 'x' && board[1][6] == 'x' && board[2][10] == 'x') break;
            else if (board[2][2] == 'x' && board[1][6] == 'x' && board[0][10] == 'x') break;
            counter++;

            // All these are the winning conditions of player 2
            gameplay(board, "Player 2"); // Calling the gameplay method for player 2
            if (board[0][2] == 'O' && board[0][6] == 'O' && board[0][10] =='O') break;
            else if (board[1][2] == 'O' && board[1][6] == 'O' && board[1][10] =='O') break;
            else if (board[2][2] == 'O' && board[2][6] == 'O' && board[2][10] =='O') break;
            else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2]  =='O') break;
            else if (board[0][6] == 'O' && board[1][6] == 'O' && board[2][6]  =='O') break;
            else if (board[0][10] =='O' && board[1][10]== 'O' && board[2][10] =='O') break;
            else if (board[0][2] == 'O' && board[1][6] == 'O' && board[2][10] =='O') break;
            else if (board[2][2] == 'O' && board[1][6] == 'O' && board[0][10] =='O') break;
            counter++;
        }
        
        if(counter<9) {
            System.out.print("We have a winner ! Congrats!");
        }
        else{
            System.out.print("It is tie game");
        }
    }
    // Method to draw the initial game board
    public static void board_print(char[][] board) { // Method for printing out the game board template
        for (char[] row : board) {
            for (char p : row) {
                System.out.print(p);
            }
            System.out.println();
        }
    }
    // This method is for asking the player for the placement of x and O and placing it
    public static void gameplay(char[][] board, String player) {
        Scanner in = new Scanner(System.in);

        char symbol = ' ';
        if (player.equals("Player 1")) {
            symbol = 'x';
        } else {
            symbol = 'O';
        }
        System.out.print("Enter the row index: ");
        int r_i = in.nextInt();
        System.out.print("Enter the column index: ");
        int c_i = in.nextInt();
        if(c_i==0)  // These if and else if conditions are for the column coordinates where 0->2, 1->6, 2->10
            c_i=2;
        else if(c_i==1)
            c_i=6;
        else if(c_i==2)
            c_i=10;
        board[r_i][c_i] = symbol;
        board_print(board);
    }
}

    









