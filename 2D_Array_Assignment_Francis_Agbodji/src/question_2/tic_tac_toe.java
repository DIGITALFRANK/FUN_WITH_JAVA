package question_2;

import java.util.Scanner;

public class tic_tac_toe {
	
	static Character[][] board = new Character[3][3];
	static Scanner keyboard = new Scanner(System.in);
	static int row;
	static int column;
	static int turnCounter = 1;
	
	// I will use underscores instead of spaces for better visualization
	public static void initiateBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '_';
			}	
		}
	}
	
	// invokes markBoard()
	public static void takeTurn() {
		// turnCount +=1 => get user input row:, column: => save into pre-defined variables
		System.out.println("Select a row between 1 and 3 (both inclusive):");
		row = keyboard.nextInt();
		System.out.println("Select a column between 1 and 3 (both inclusive):");
		column = keyboard.nextInt();
		turnCounter += 1;
		markBoard();
	}
	
	// invokes showState() if completes, else invokes takeTurn()
	public static void markBoard() {
		// get user input from takeTurn() => markBoard() @ location
		// if turnCount is odd, mark with X
		// if turnCount is even, mark with O
		
		if (!between(row, 1, 3) || !between(column, 1, 3)) { // invalid input
			System.out.println("*** PLEASE ENTER A VALID ROW AND COLUMN ***");
			takeTurn();
		} else if (board[row -1][column -1] != '_') { // if spot is already marked
			// set counter back to previous
			turnCounter -= 1;
			// try again
			System.out.println("*** OOOPS! SPOT ALREADY MARKED, TRY AGAIN... ***");
			takeTurn();
		} else if (turnCounter % 2 != 0) { // if odd turn
			board[row -1][column -1] = 'X';
			showState();
		} else if (turnCounter % 2 == 0) { // if even turn
			board[row -1][column -1] = 'Y';
			showState();
		} else {
			// all other scenarios => invalid input (are there even any other scenarios?? this could just be an ending else)
			System.out.println("*** PLEASE ENTER A VALID ROW AND COLUMN ***");
			takeTurn();
		}
	}
	
	// invokes takeTurn()
	public static void showState() {
		// print board
		System.out.println("__`_________TIC___TAC___TOE________`__");
		System.out.println();
		System.out.println();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		// if board full => "game over" , else => nextTurn()
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != '_') {
					continue;
				} else {
					takeTurn();
				}
			}
		}
		System.out.println("******  GAME OVER  ******");
	}
	
//	else if (i == 2 && j == 2) { // this conditional isn't working!  what's wrong with it???
//		System.out.println("******  GAME OVER  ******");
//		break;
//	
	// range checker function for input validity
	public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
	    return (i >= minValueInclusive && i <= maxValueInclusive);
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		initiateBoard();
		showState();
		//takeTurn();
	}

}
