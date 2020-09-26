import java.io.*;
import java.util.*;

class TicTacToeGame {

	//method to assign gameboard
	public void assignBoard(char gameBoard[]) {
		for(int i=1;i<gameBoard.length;i++) {
			gameBoard[i]='-';
		}

	}

	public static void main(String args[]) {
		TicTacToeGame ticTacToeGame = new TicTacToeGame();

		//declare gameboard
		char[] gameBoard = new char[10];

		//call method to assign board
		ticTacToeGame.assignBoard(gameBoard);
	}
}

