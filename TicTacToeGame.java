import java.io.*;
import java.util.*;

class TicTacToeGame {

	//method to assign gameboard
	public void assignBoard(char gameBoard[]) {
		for(int i=1;i<gameBoard.length;i++) {
			gameBoard[i]='-';
		}
	}

	public void displayGameBoard(char gameBoard[]) {
		for(int i=1;i<gameBoard.length;i=i+3) {
			System.out.println("--------------");
         System.out.println("| "+gameBoard[i]+" | "+gameBoard[(i+1)] + " | " + gameBoard[(i+2)]+" | " );
      }
		 System.out.println("--------------");

	}

	public static void main(String args[]) {
		TicTacToeGame ticTacToeGame = new TicTacToeGame();
		Scanner sc= new Scanner(System.in);
		//declare gameboard
		char[] gameBoard = new char[10];

		char player='X';
		char computer='O';

		//call method to assign board
		ticTacToeGame.assignBoard(gameBoard);

		int choosePlayer = 0;
		if( choosePlayer == 0) {
			System.out.println("player turn\nEnter cell number from 1 to 9");
			int cellNumber = sc.nextInt();
			gameBoard[cellNumber]= player;
		}

		ticTacToeGame.displayGameBoard(gameBoard);
	}
}

