import java.io.*;
import java.util.*;

class TicTacToeGame {

	//method to assign gameboard
	public void assignBoard(char gameBoard[]) {
		for(int i = 1; i<gameBoard.length; i++) {
			gameBoard[i]='-';
		}
	}

	//method to display game board
	public void displayGameBoard(char gameBoard[]) {
		for(int i=1; i<gameBoard.length; i=i+3) {
			System.out.println("--------------");
         System.out.println("| " + gameBoard[i] + " | " + gameBoard[(i+1)] + " | " + gameBoard[(i+2)] + " | " );
      }
		 System.out.println("--------------");
	}

	//Player Turn
	public void placePlayerLetter(Scanner sc, int choosePlayer, char player, char gameBoard[]) {
		 if( choosePlayer == 0) {
         System.out.println("player turn\nEnter cell number from 1 to 9");
         int cellNumber = sc.nextInt();

			if(gameBoard[cellNumber] == '-') {
         	gameBoard[cellNumber]= player;
         	displayGameBoard(gameBoard);
			}
			else {
				System.out.println("Enter valid cell");
			}
      }

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		TicTacToeGame ticTacToeGame = new TicTacToeGame();
		//declare gameboard
		char[] gameBoard = new char[10];

		char player = 'X';
		char computer = 'O';
		int choosePlayer = 0;

		//call method to assign board
		ticTacToeGame.assignBoard(gameBoard);
		ticTacToeGame.displayGameBoard(gameBoard);
		ticTacToeGame.placePlayerLetter(sc,choosePlayer,player,gameBoard);
	}
}

