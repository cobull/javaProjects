import java.util.*;

public class Checkers {
	
	public static void printBoard(String[][] board, String black, String white) {
		int i;
		int j;
		int k;
		System.out.print("  ");
		for (k = 1; k < 66; ++k) {
			System.out.print("-");
		}
		System.out.println("");
		for (i = board.length - 1; i > 0; --i) {
			System.out.print("  ");
			for (j = 1; j <board[i].length; ++j) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						if (j != 8) {
							if (board[i][j].equals("")) {
								System.out.print(black);
							}
							else {
								System.out.print("|++" + board[i][j] + board[i][j] + 
									board[i][j] + "++");
							}
						}
						else {
							if (board[i][j].equals("")) {
								System.out.print(black + "|");
							}
							else {
								System.out.print("|++" + board[i][j] + board[i][j] + 
									board[i][j] + "++|");
							}
						}
					}
					else {
						if (j != 8) {
							System.out.print(white);
						}
						else {
							System.out.print(white + "|");
						}
					}
				}
				else {
					if (j % 2 != 0) {
						if (j != 8) {
							if (board[i][j].equals("")) {
								System.out.print(black);
							}
							else {
								System.out.print("|++" + board[i][j] + board[i][j] + 
									board[i][j] + "++");
							}
						}
						else {
							if (board[i][j].equals("")) {
								System.out.print(black + "|");
							}
							else {
								System.out.print("|++" + board[i][j] + board[i][j] + 
									board[i][j] + "++|");
							}
						}
					}
					else {
						if (j != 8) {
							System.out.print(white);
						}
						else {
							System.out.print(white + "|");
						}
					}
				}
			}
			System.out.println("");
			System.out.print(i + " ");
			for (j = 1; j < board[i].length; ++j) {
				if (i % 2 != 0) {
					if (j % 2 == 0) {
						if (j != 8) {
							if (board[i][j].equals("")) {
								System.out.print(white);
							}
						}
						else {
							if (board[i][j].equals("")) {
								System.out.print(white + "|");
							}
						}
					}
					else {
						if (j != 8) {
							if (board[i][j].equals("")) {
								System.out.print(black);
							}
							else {
								System.out.print("|+" + board[i][j] + board[i][j] + 
									board[i][j] + board[i][j] + board[i][j] + "+");
							}
						}
						else {
							if (board[i][j].equals("")) {
								System.out.print(black + "|");
							}
							else {
								System.out.print("|+" + board[i][j] + board[i][j] + 
									board[i][j] + board[i][j] + board[i][j] + "+|");
							}
						}
					}
				}
				else {
					if (j % 2 != 0) {
						if (j != 8) {
							if (board[i][j].equals("")) {
								System.out.print(white);
							}
							else {
								System.out.print("|+" + board[i][j] + board[i][j] + 
									board[i][j] + board[i][j] + board[i][j] + "+");
							}
						}
						else {
							if (board[i][j].equals("")) {
								System.out.print(white + "|");
							}
							else {
								System.out.print("|+" + board[i][j] + board[i][j] + 
									board[i][j] + board[i][j] + board[i][j] + "+|");
							}
						}
					}
					else {
						if (j != 8) {
							if (board[i][j].equals("")) {
								System.out.print(black);
							}
							else {
								System.out.print("|+" + board[i][j] + board[i][j] + 
									board[i][j] + board[i][j] + board[i][j] + "+");
							}
						}
						else {
							if (board[i][j].equals("")) {
								System.out.print(black + "|");
							}
							else {
								System.out.print("|+" + board[i][j] + board[i][j] + 
									board[i][j] + board[i][j] + board[i][j] + "+|");
							}
						}
					}
				}
			}
			System.out.println("");
			System.out.print("  ");
			for (j = 1; j <board[i].length; ++j) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						if (j != 8) {
							if (board[i][j].equals("")) {
								System.out.print(black);
							}
							else {
								System.out.print("|++" + board[i][j] + board[i][j] + 
									board[i][j] + "++");
							}
						}
						else {
							if (board[i][j].equals("")) {
								System.out.print(black + "|");
							}
							else {
								System.out.print("|++" + board[i][j] + board[i][j] + 
									board[i][j] + "++|");
							}
						}
					}
					else {
						if (j != 8) {
							System.out.print(white);
						}
						else {
							System.out.print(white + "|");
						}
					}
				}
				else {
					if (j % 2 != 0) {
						if (j != 8) {
							if (board[i][j].equals("")) {
								System.out.print(black);
							}
							else {
								System.out.print("|++" + board[i][j] + board[i][j] + 
									board[i][j] + "++");
							}
						}
						else {
							if (board[i][j].equals("")) {
								System.out.print(black + "|");
							}
							else {
								System.out.print("|++" + board[i][j] + board[i][j] + 
									board[i][j] + "++|");
							}
						}
					}
					else {
						if (j != 8) {
							System.out.print(white);
						}
						else {
							System.out.print(white + "|");
						}
					}
				}
			}
			System.out.println("");
			System.out.print("  ");
			for (k = 1; k < 66; ++k) {
				System.out.print("-");
			}
			System.out.println("");
		}
		char column = 'A';
		for (j = 1; j < board[i].length; ++j) {
			System.out.print("      " + column + " ");
			++column;
		}
		System.out.println("");
	}
	
	public static String promptPieceToMove(Scanner scnr) {
		String pieceToMove;
		System.out.print("\nWhat piece (ColumnRow ex. G3) would you like to move? ");
		pieceToMove = scnr.next();
		return pieceToMove;
	}
	
	public static String promptDestinationSquare(Scanner scnr) {
		String destinationSquare;
		System.out.print("Where would you like to move it (ColumnRow ex. F4)? ");
		destinationSquare = scnr.next();
		return destinationSquare;
	}
	
	public static int getUserPieceColumn(String userPiece) {
		int userColumn = 1;
		char col = 'A';
		for (int i = 0; i < 9; ++i) {
			if (userPiece.charAt(0) != col) {
				++userColumn;
				++col;
			}
		}
		return userColumn;
	}
	
	public static int getUserPieceRow(String userPiece) {
		int userRow = 1;
		char row = '1';
		for (int i = 0; i < 9; ++i) {
			if (userPiece.charAt(1) != row) {
				++userRow;
				++row;
			}
		}
		return userRow;
	}
	
	public static int getDestinationColumn(String square) {
		int squareColumn = 1;
		char col = 'A';
		for (int i = 0; i < 9; ++i) {
			if (square.charAt(0) != col) {
				++squareColumn;
				++col;
			}
		}
		return squareColumn;
	}
	
	public static int getDestinationRow(String square) {
		int squareRow = 1;
		char row = '1';
		for (int i = 0; i < 9; ++i) {
			if (square.charAt(1) != row) {
				++squareRow;
				++row;
			}
		}
		return squareRow;
	}
	
	public static void updateBoard(String[][] board, int pieceRow, int pieceCol, int destRow, int destCol) {
		board[destRow][destCol] = "W";
		board[pieceRow][pieceCol] = "";
	}
	
	public static boolean checkSingleLegality(String[][] board, int pieceRow, int pieceCol, int destRow, int destCol) {
		boolean isLegal = true;
		
		if (destRow <= pieceRow) {
			isLegal = false;
		}
		if (destCol > pieceCol + 1 || destCol < pieceCol - 1) {
			isLegal = false;
		}
		if (board[destRow][destCol] != "") {
			isLegal = false;
		}
		if (destCol == pieceCol) {
			isLegal = false;
		}
		return isLegal;
	}
	
	public static boolean ifIsJumping(String[][] board, int pieceRow, int pieceCol, int destRow, int destCol) {
		boolean isJumping = false;
		if (destRow > pieceRow + 1) {
			isJumping = true;
		}
		return isJumping;
	}
	
	public static boolean checkJumpLegality(String[][] board, int pieceRow, int pieceCol, int destRow, int destCol) {
		boolean isLegalJump = false;
		if (pieceCol < 7 && pieceCol > 2 && destCol < pieceCol) {
			if (destRow == pieceRow + 2 && board[destRow][destCol] == "" && (board[destRow - 1][destCol + 1] == "B"
				|| board[destRow - 1][destCol + 1] == "Q")) {
				isLegalJump = true;
			}
		}
		else if (pieceCol < 7 && pieceCol > 2 && destCol > pieceCol) {
			if (destRow == pieceRow + 2 && board[destRow][destCol] == "" && (board[destRow - 1][destCol - 1] == "B"
				|| board[destRow - 1][destCol - 1] == "Q")) {
				isLegalJump = true;
			}
		}
		else if (pieceCol < 3 && destRow == pieceRow + 2 && board[destRow][destCol] == "" 
			     && (board[destRow - 1][destCol - 1] == "B" || board[destRow - 1][destCol - 1] == "Q")) {
				isLegalJump = true;
		}
		else if (pieceCol > 6 && destRow == pieceRow + 2 && board[destRow][destCol] == "" 
			     && (board[destRow - 1][destCol + 1] == "B" || board[destRow - 1][destCol + 1] == "Q")) {
				 isLegalJump = true;
		}
		return isLegalJump;
	}
	
	public static void updateBoardAfterWhiteJump(String[][] board, int pieceRow, int pieceCol, int destRow, int destCol) {
		board[destRow][destCol] = "W";
		board[pieceRow][pieceCol] = "";
		if (destCol > pieceCol) {
			board[destRow - 1][destCol - 1] = "";
		}
		else if (destCol < pieceCol) {
			board[destRow - 1][destCol + 1] = "";
		}
	}
	
	public static void errorMessage() {
		System.out.println("\nThat is not a legal move. Please make a different move.");
	}
	
	public static int[] findBlackPiece(String[][] board) {
		int[] blackPiece = new int[2];
		Random rand = new Random();
		boolean isBlackPiece = false;
		int blackCol = 0;
		int blackRow = 0;
		while (!isBlackPiece) {
			blackCol = rand.nextInt(8) + 1;
			blackRow = rand.nextInt(8) + 1;
			if (board[blackRow][blackCol] == "B" || board[blackRow][blackCol] == "Q") {
				isBlackPiece = true;
			}
		}
		blackPiece[0] = blackRow;
		blackPiece[1] = blackCol;
		return blackPiece;
	}
	
	public static void makeBlackJump(String[][] board, int[] blackPiece, int[] white, int[] destination) {
		board[white[0]][white[1]] = "";
		board[destination[0]][destination[1]] = "B";
		board[blackPiece[0]][blackPiece[1]] = "";
	}
	
	public static boolean isBlackJumpAvailable(String[][] board, int[] blackPiece) {
		boolean blackJumpAvailable = false;
		if (blackPiece[0] > 2) {
			if (blackPiece[1] < 7 && blackPiece[1] > 2) {
				if (board[blackPiece[0] - 1][blackPiece[1] - 1] == "W"
					&& board[blackPiece[0] - 2][blackPiece[1] - 2] == "" ) {
					blackJumpAvailable = true;
				}
				else if (board[blackPiece[0] - 1][blackPiece[1] + 1] == "W"
					&& board[blackPiece[0] - 2][blackPiece[1] + 2] == "" ) {
					blackJumpAvailable = true;
				}
			}
			else if (blackPiece[1] <= 2) {
				if (board[blackPiece[0] - 1][blackPiece[1] + 1] == "W"
					&& board[blackPiece[0] - 2][blackPiece[1] + 2] == "" ) {
					blackJumpAvailable = true;
				}
			}
			else {
				if (board[blackPiece[0] - 1][blackPiece[1] - 1] == "W"
					&& board[blackPiece[0] - 2][blackPiece[1] - 2] == "" ) {
					blackJumpAvailable = true;
				}
			}
		}
		return blackJumpAvailable;
	}
		
			
	public static int[] findWhitePieceToJump(String[][] board, int[] blackPiece) {
		int[] whitePieceToJump = new int[2];
		Random rand = new Random();
		int num = rand.nextInt(2);
		if (blackPiece[1] < 7 && blackPiece[1] > 2) {
			if (num == 0) {
				if (board[blackPiece[0] - 1][blackPiece[1] + 1] == "W"
					&& board[blackPiece[0] - 2][blackPiece[1] + 2] == "") {
					whitePieceToJump[0] = blackPiece[0] - 1;
					whitePieceToJump[1] = blackPiece[1] + 1;
				} 
				else if (board[blackPiece[0] - 1][blackPiece[1] - 1] == "W"
						 && board[blackPiece[0] - 2][blackPiece[1] - 2] == "") {
						whitePieceToJump[0] = blackPiece[0] - 1;
						whitePieceToJump[1] = blackPiece[1] - 1;
				}
			}
			else {
				if (board[blackPiece[0] - 1][blackPiece[1] - 1] == "W"
					&& board[blackPiece[0] - 2][blackPiece[1] - 2] == "") {
					whitePieceToJump[0] = blackPiece[0] - 1;
					whitePieceToJump[1] = blackPiece[1] - 1;
				}
				else if (board[blackPiece[0] - 1][blackPiece[1] + 1] == "W"
						 && board[blackPiece[0] - 2][blackPiece[1] + 2] == "") {
						whitePieceToJump[0] = blackPiece[0] - 1;
						whitePieceToJump[1] = blackPiece[1] + 1;
				}
			}
		}
		else if (blackPiece[1] <= 2) {
			if (board[blackPiece[0] - 1][blackPiece[1] + 1] == "W"
				&& board[blackPiece[0] - 2][blackPiece[1] + 2] == "") {
					whitePieceToJump[0] = blackPiece[0] - 1;
					whitePieceToJump[1] = blackPiece[1] + 1;
			}
		}
		else {
			if (board[blackPiece[0] - 1][blackPiece[1] - 1] == "W"
				&& board[blackPiece[0] - 2][blackPiece[1] - 2] == "") {
					whitePieceToJump[0] = blackPiece[0] - 1;
					whitePieceToJump[1] = blackPiece[1] - 1;
			}
		}
			
		return whitePieceToJump;
	}
	
	public static int[] findDestinationSquareForBlackJump(String[][] board, int[] blackPiece, int[] white) {
		int[] destinationSquare = new int[2];
		if (blackPiece[1] < 7 && blackPiece[1] > 2) {
			if (blackPiece[1] < white[1]) {
				destinationSquare[1] = white[1] + 1;
			}
			else {
				destinationSquare[1] = white[1] - 1;
			}
		}
		else if (blackPiece[1] <= 2) {
			destinationSquare[1] = white[1] + 1;
		}
		else {
			destinationSquare[1] = white[1] - 1;
		}
		destinationSquare[0] = white[0] - 1;
		return destinationSquare;
	}
			
	public static boolean canBlackPieceMove(String[][] board, int[] blackP) {
		boolean canMove = false;
		if (board[blackP[0]][blackP[1]] == "B") {
			if (blackP[1] > 1 && blackP[1] < 8) {
				if (board[blackP[0] - 1][blackP[1] - 1] == "" || board[blackP[0] - 1][blackP[1] + 1] == "") {
					canMove = true;
				}
			}
			else if (blackP[1] == 1) {
				if (board[blackP[0] - 1][blackP[1] + 1] == "") {
					canMove = true;
				}
			}
			else {
				if (board[blackP[0] - 1][blackP[1] - 1] == "") {
					canMove = true;
				}
			}
		}
		return canMove;
	}
	
	public static boolean canBlackKingMove(String[][] board, int[] blackP) {
		boolean blackKingCanMove = false;
		int row = blackP[0];
		int col = blackP[1];
		if (board[row][col] == "Q") {
		if (row > 1 && row < 8 && col > 1 && col < 8) {
			if (board[row - 1][col - 1] == "" || board[row + 1][col - 1] == "" || board[row + 1][col + 1] == "" 
				|| board[row - 1][col + 1] == "") {
				blackKingCanMove = true;
			}
		}
		else if (col == 1 && row < 8 && row > 1) {
			if (board[row + 1][col + 1] == "" || board[row - 1][col + 1] == "") {
				blackKingCanMove = true;
			}
		}
		else if (col == 8 && row < 8 && row > 1) {
			if (board[row - 1][col - 1] == "" || board[row + 1][col - 1] == "") {
				blackKingCanMove = true;
			}
		}
		else if (row == 1 && col > 1 && col < 8) {
			if (board[row + 1][col - 1] == "" || board[row + 1][col + 1] == "") {
				blackKingCanMove = true;
			}
		}
		else if (row == 8 && col > 1 && col < 8) {
			if (board[row - 1][col - 1] == "" || board[row - 1][col + 1] == "") {
				blackKingCanMove = true;
			}
		}
		else if (row == 1 && col == 1) {
			if (board[row + 1][col + 1] == "") {
				blackKingCanMove = true;
			}
		}
		else if (row == 1 && col == 8) {
			if (board[row + 1][col - 1] == "") {
				blackKingCanMove = true;
			}
		}
		else if (row == 8 && col == 1) {
			if (board[row - 1][col + 1] == "") {
				blackKingCanMove = true;
			}
		}
		else if (row == 8 && col == 8) {
			if (board[row - 1][col - 1] == "") {
				blackKingCanMove = true;
			}
		}
		}
		return blackKingCanMove;
	}
	
	public static int[] findEmptySquareForBlackKing(String[][] board, int[] blackP) {
		int [] destForBlackKing = new int[2];
		int row = blackP[0];
		int col = blackP[1];
		Random rand = new Random();
		int random = rand.nextInt(2);
		
		int i;
		int j;
		if (board[row][col] == "Q") {
		if (row > 1 && row < 8 && col > 1 && col < 8) {
			if (random == 0) {
				for (j = row - 1; j <= row + 1; j = j + 2) {
					for (i = col - 1; i <= col + 1; i = i + 2) {
						if (board[j][i] == "") {
							destForBlackKing[0] = j;
							destForBlackKing[1] = i;
						}
					}
				}
			}
			else {
				for (j = row + 1; j >= row - 1; j = j - 2) {
					for (i = col + 1; i >= col - 1; i = i - 2) {
						if (board[j][i] == "") {
							destForBlackKing[0] = j;
							destForBlackKing[1] = i;
						}
					}
				}
			}
		}
		else if (col == 1 && row < 8 && row > 1) {
			if (random == 0) {
				for (j = row - 1; j <= row + 1; j = j + 2) {
					if (board[j][col + 1] == "") {
						destForBlackKing[0] = j;
						destForBlackKing[1] = col + 1;
					}
				}
			}
			else {
				for (j = row + 1; j >= row - 1; j = j - 2) {
					if (board[j][col + 1] == "") {
						destForBlackKing[0] = j;
						destForBlackKing[1] = col + 1;
					}
				}
			}
		}
		else if (col == 8 && row < 8 && row > 1) {
			if (random == 0) {
				for (j = row - 1; j <= row + 1; j = j + 2) {
					if (board[j][col - 1] == "") {
						destForBlackKing[0] = j;
						destForBlackKing[1] = col - 1;
					}
				}
			}
			else {
				for (j = row + 1; j >= row - 1; j = j - 2) {
					if (board[j][col - 1] == "") {
						destForBlackKing[0] = j;
						destForBlackKing[1] = col - 1;
					}
				}
			}
		}
		else if (row == 1 && col > 1 && col < 8) {
			if (random == 0) {
				for (i = col - 1; i <= col + 1; i = i + 2) {
					if (board[row + 1][i] == "") {
						destForBlackKing[0] = row + 1;
						destForBlackKing[1] = i;
					}
				}
			}
			else {
				for (i = col + 1; i >= col + 1; i = i - 2) {
					if (board[row + 1][i] == "") {
						destForBlackKing[0] = row + 1;
						destForBlackKing[1] = i;
					}
				}
			}
		}
		else if (row == 8 && col > 1 && col < 8) {
			if (random == 0) {
				for (i = col - 1; i <= col + 1; i = i + 2) {
					if (board[row - 1][i] == "") {
						destForBlackKing[0] = row - 1;
						destForBlackKing[1] = i;
					}
				}
			}
			else {
				for (i = col + 1; i >= col + 1; i = i - 2) {
					if (board[row - 1][i] == "") {
						destForBlackKing[0] = row - 1;
						destForBlackKing[1] = i;
					}
				}
			}
		}
		else if (row == 8 && col == 8) {
			destForBlackKing[0] = row - 1;
			destForBlackKing[1] = col - 1;
		}
		else if (row == 8 && col == 1) {
			destForBlackKing[0] = row - 1;
			destForBlackKing[1] = col + 1;
		}
		else if (row == 1 && col == 8) {
			destForBlackKing[0] = row + 1;
			destForBlackKing[1] = col - 1;
		}
		else if (row == 1 && col == 1) {
			destForBlackKing[0] = row + 1;
			destForBlackKing[1] = col + 1;
		}
		}
		return destForBlackKing;
	}
			
	public static void moveBlackKing(String[][] board, int[] blackP, int[] destForBlackKing) {
		int pieceRow = blackP[0];
		int pieceCol = blackP[1];
		int destRow = destForBlackKing[0];
		int destCol = destForBlackKing[1];
		board[pieceRow][pieceCol] = "";
		board[destRow][destCol] = "Q";
	}
	
	public static boolean isBlackKingJumpAvailable(String[][] board, int[] blackP) {
		boolean blackKingJumpIsAvailable = false;
		int row = blackP[0];
		int col = blackP[1];
		if (board[row][col] == "Q") {
		if (row > 2 && row < 7 && col > 2 && col < 7) {
			if ((board[row - 2][col - 2] == "" && board[row - 1][col - 1] == "W") || (board[row - 2][col + 2] == "" 
				&& board[row - 1][col + 1] == "W")) {
				blackKingJumpIsAvailable = true;
			}
			else if((board[row + 2][col - 2] == "" && board[row + 1][col - 1] == "W") || (board[row + 2][col + 2] == "" 
				&& board[row + 1][col + 1] == "W")) {
				blackKingJumpIsAvailable = true;
			}
		}
		else if (col < 3 && row < 7 && row > 2 ) {
			if ((board[row + 2][col + 2] == "" && board[row + 1][col + 1] == "W") 
				|| (board[row - 2][col + 2] == "" && board[row - 1][col + 1] == "W")) {
				blackKingJumpIsAvailable = true;
			}
		}
		else if (col > 6 && row < 7 && row > 2) {
			if ((board[row + 2][col - 2] == "" && board[row + 1][col - 1] == "W") 
				|| (board[row - 2][col - 2] == "" && board[row - 1][col - 1] == "W")) {
				blackKingJumpIsAvailable = true;
			}
		}
		else if (col > 2 && col > 7 && row < 3) {
			if ((board[row + 2][col - 2] == "" && board[row + 1][col - 1] == "W") 
				|| (board[row + 2][col + 2] == "" && board[row + 1][col + 1] == "W")) {
				blackKingJumpIsAvailable = true;
			}
		}
		else if (col > 2 && col > 7 && row > 6) {
			if ((board[row - 2][col - 2] == "" && board[row - 1][col - 1] == "W") 
				|| (board[row - 2][col + 2] == "" && board[row - 1][col + 1] == "W")) {
				blackKingJumpIsAvailable = true;
			}
		}
		else if (row < 2 && col < 3) {
			if (board[row + 2][col + 2] == "" && board[row + 1][col + 1] == "W") {
				blackKingJumpIsAvailable = true;
			}
		}
		else if (row < 2 && col > 6) {
			if (board[row + 2][col - 2] == "" && board[row + 1][col - 1] == "W") {
				blackKingJumpIsAvailable = true;
			}
		}
		else if (row > 6 && col < 3) {
			if (board[row - 2][col + 2] == "" && board[row - 1][col + 1] == "W") {
				blackKingJumpIsAvailable = true;
			}
		}
		else if (row > 6 && col > 6) {
			if (board[row - 2][col - 2] == "" && board[row - 1][col - 1] == "W") {
				blackKingJumpIsAvailable = true;
			}
		}
		}
		return blackKingJumpIsAvailable;
	}
	
	public static int[] findDestSquareForBlackKingJump(String[][] board, int[] blackP) {
		int[] destSquareForBlackKingJump = new int[2];
		int row = blackP[0];
		int col = blackP[1];
		
		
		if (row > 2 && row < 7 && col > 2 && col < 7) {
			if (board[row - 2][col - 2] == "" && board[row - 1][col - 1] == "W") {
				destSquareForBlackKingJump[0] = row - 2;
				destSquareForBlackKingJump[1] = col - 2;
			}
			else if (board[row - 2][col + 2] == "" && board[row - 1][col + 1] == "W") {
				destSquareForBlackKingJump[0] = row - 2;
				destSquareForBlackKingJump[1] = col + 2;
			}
			else if (board[row + 2][col - 2] == "" && board[row + 1][col - 1] == "W") {
				destSquareForBlackKingJump[0] = row + 2;
				destSquareForBlackKingJump[1] = col - 2;
			}
			else if (board[row + 2][col + 2] == "" && board[row + 1][col + 1] == "W") {
				destSquareForBlackKingJump[0] = row + 2;
				destSquareForBlackKingJump[1] = col + 2;
			}
		}
		else if (col < 3 && row < 7 && row > 2 ) {
			if (board[row + 2][col + 2] == "" && board[row + 1][col + 1] == "W") {
				destSquareForBlackKingJump[0] = row + 2;
				destSquareForBlackKingJump[1] = col + 2;
			}
			else if (board[row - 2][col + 2] == "" && board[row - 1][col + 1] == "W") {
				destSquareForBlackKingJump[0] = row - 2;
				destSquareForBlackKingJump[1] = col + 2;
			}
		}
		else if (col > 6 && row < 7 && row > 2) {
			if (board[row + 2][col - 2] == "" && board[row + 1][col - 1] == "W") {
				destSquareForBlackKingJump[0] = row + 2;
				destSquareForBlackKingJump[1] = col - 2;
			}
			else if (board[row - 2][col - 2] == "" && board[row - 1][col - 1] == "W") {
				destSquareForBlackKingJump[0] = row - 2;
				destSquareForBlackKingJump[1] = col - 2;
			}
		}
		else if (col > 2 && col > 7 && row < 3) {
			if (board[row + 2][col - 2] == "" && board[row + 1][col - 1] == "W") {
				destSquareForBlackKingJump[0] = row + 2;
				destSquareForBlackKingJump[1] = col - 2;
			}
			else if(board[row + 2][col + 2] == "" && board[row + 1][col + 1] == "W") {
				destSquareForBlackKingJump[0] = row + 2;
				destSquareForBlackKingJump[1] = col + 2;
			}
		}
		else if (col > 2 && col > 7 && row > 6) {
			if (board[row - 2][col - 2] == "" && board[row - 1][col - 1] == "W") {
				destSquareForBlackKingJump[0] = row - 2;
				destSquareForBlackKingJump[1] = col - 2;
			}
			else if (board[row - 2][col + 2] == "" && board[row - 1][col + 1] == "W") {
				destSquareForBlackKingJump[0] = row - 2;
				destSquareForBlackKingJump[1] = col + 2;
			}
		}
		else if (row < 2 && col < 3) {
			if (board[row + 2][col + 2] == "" && board[row + 1][col + 1] == "W") {
				destSquareForBlackKingJump[0] = row + 2;
				destSquareForBlackKingJump[1] = col + 2;
			}
		}
		else if (row < 2 && col > 6) {
			if (board[row + 2][col - 2] == "" && board[row + 1][col - 1] == "W") {
				destSquareForBlackKingJump[0] = row + 2;
				destSquareForBlackKingJump[1] = col - 2;
			}
		}
		else if (row > 6 && col < 3) {
			if (board[row - 2][col + 2] == "" && board[row - 1][col + 1] == "W") {
				destSquareForBlackKingJump[0] = row - 2;
				destSquareForBlackKingJump[1] = col + 2;
			}
		}
		else if (row > 6 && col > 6) {
			if (board[row - 2][col - 2] == "" && board[row - 1][col - 1] == "W") {
				destSquareForBlackKingJump[0] = row - 2;
				destSquareForBlackKingJump[1] = col - 2;
			}
		}
		return destSquareForBlackKingJump;
	}
	
	public static void makeBlackKingJump(String[][] board, int[] blackP, int[] destSquare) {
		int userRow = blackP[0];
		int userCol = blackP[1];
		int destRow = destSquare[0];
		int destCol = destSquare[1];
		
		if (destRow == userRow + 2 && destCol == userCol + 2) {
			board[userRow][userCol] = "";
			board[destRow][destCol] = "Q";
			board[userRow + 1][userCol + 1] = "";
		}
		else if (destRow == userRow + 2 && destCol == userCol - 2) {
			board[userRow][userCol] = "";
			board[destRow][destCol] = "Q";
			board[userRow + 1][userCol - 1] = "";
		}	
		else if (destRow == userRow - 2 && destCol == userCol - 2) {
			board[userRow][userCol] = "";
			board[destRow][destCol] = "Q";
			board[userRow - 1][userCol - 1] = "";
		}
		else if (destRow == userRow - 2 && destCol == userCol + 2) {
			board[userRow][userCol] = "";
			board[destRow][destCol] = "Q";
			board[userRow - 1][userCol + 1] = "";
		}
	}
				
	public static void moveComputer(String[][] board, int[] blackP) {
		Random rand = new Random();
		int random = rand.nextInt(2);
			
		if (blackP[1] > 1 && blackP[1] < 8) {
			if (board[blackP[0] - 1][blackP[1] + 1] == "W" || board[blackP[0] - 1][blackP[1] + 1] == "B"
				|| board[blackP[0] - 1][blackP[1] + 1] == "Q") {
				board[blackP[0] - 1][blackP[1] - 1] = "B";
				board[blackP[0]][blackP[1]] = "";
			}
			else if (board[blackP[0] - 1][blackP[1] - 1] == "W" || board[blackP[0] - 1][blackP[1] - 1] == "B"
				|| board[blackP[0] - 1][blackP[1] - 1] == "Q") {
				board[blackP[0] - 1][blackP[1] + 1] = "B";
				board[blackP[0]][blackP[1]] = "";
			}
			else {
				if (random == 0) {
					board[blackP[0] - 1][blackP[1] + 1] = "B";
					board[blackP[0]][blackP[1]] = "";
				}
				else {
					board[blackP[0] - 1][blackP[1] - 1] = "B";
					board[blackP[0]][blackP[1]] = "";
				}
			}
		}
		else if (blackP[1] == 1) {
			board[blackP[0] - 1][blackP[1] + 1] = "B";
			board[blackP[0]][blackP[1]] = "";
		}
		else {
			board[blackP[0] - 1][blackP[1] - 1] = "B";
			board[blackP[0]][blackP[1]] = "";
		}
	}
	
	public static void checkForBlackKings(String[][] board) {
		int i;
		for (i = 0; i < board[1].length; ++i) {
			if (board[1][i] == "B") {
				board[1][i] = "Q";
			}
		}
	}
	
	public static boolean checkIfGameWon(String[][] board) {
		boolean gameOver = false;
		int i;
		int j;
		int numWhitePieces = 0;
		int numBlackPieces = 0;
		for (i = 1; i < board.length; ++i) {
			for (j = 1; j < board[i].length; ++j) {
				if (board[i][j] == "W" || board[i][j] == "K") {
					++numWhitePieces;
				}
				else if (board[i][j] == "B" || board[i][j] == "Q") {
					++numBlackPieces;
				}
			}
		}
		if (numWhitePieces == 0) {
			gameOver = true;
			System.out.println("~~~~~~~~~~GAME OVER~~~~~~~~~~");
			System.out.println("~~~~~~~~~~You have lost! Try again.~~~~~~~~~~");
		}
		if (numBlackPieces == 0) {
			gameOver = true;
			System.out.println("~~~~~~~~~~Congratulations, you have won!~~~~~~~~~~");
		}
				
		
		return gameOver;
	}
	
	public static boolean checkIfWhiteKinged(String[][] board, int pieceRow, int pieceCol, int destRow, int destCol) {
		boolean isKinged = false;
		if (destRow == 8) {
			isKinged = true;
		}
		return isKinged;
	}
	
	public static void kingWhite(String[][] board, int destRow, int destCol) {
		board[destRow][destCol] = "K";
	}
		
	public static boolean checkForKingSingleLegality(String[][] board, int pieceRow, int pieceCol, int destRow, int destCol) {
		boolean isLegalKingSingle = false;
		
		if (destCol > 1 || destCol < 8) {
			if ((destCol == pieceCol + 1 || destCol == pieceCol - 1) && (destRow == pieceRow + 1 || destRow == pieceRow - 1) 
				&& board[destRow][destCol] == "") {
				isLegalKingSingle = true;
			}
		}
		else if (destCol == 1) {
			if (destCol > pieceCol && (destRow == pieceRow + 1 || destRow == pieceRow - 1) && board[destRow][destCol] == "") {
				isLegalKingSingle = true;
			}
		}
		else {
			if (destCol < pieceCol && (destRow == pieceRow + 1 || destRow == pieceRow - 1) && board[destRow][destCol] == "") {
				isLegalKingSingle = true;
			}
		}
		return isLegalKingSingle;
	}
	
	public static void moveWhiteKingSingle(String[][] board, int pieceRow, int pieceCol, int destRow, int destCol) {
		board[destRow][destCol] = "K";
		board[pieceRow][pieceCol] = "";
	}
	
	public static boolean checkIfWhiteKingJumping(int pieceRow, int destRow) {
		boolean whiteKingIsJumping = false;
		if (destRow == pieceRow + 2 || destRow == pieceRow - 2) {
			whiteKingIsJumping = true;
		}
		return whiteKingIsJumping;
	}
	
	public static boolean checkIfWhiteKingJumpIsLegal(String[][] board, int pieceRow, int pieceCol, int destRow, int destCol) {
		boolean isLegalKingJump = false;
		
		if (pieceCol > 2 || pieceCol < 7) {
			if (destRow == pieceRow + 2 && destCol == pieceCol + 2 && board[pieceRow + 1][pieceCol + 1] == "B" 
				&& board[destRow][destCol] == "") {
				isLegalKingJump = true;
			}
			else if (destRow == pieceRow + 2 && destCol == pieceCol - 2 && board[pieceRow + 1][pieceCol - 1] == "B" 
				&& board[destRow][destCol] == "") {
				isLegalKingJump = true;
			}
			else if (destRow == pieceRow - 2 && destCol == pieceCol - 2 && board[pieceRow - 1][pieceCol - 1] == "B" 
				&& board[destRow][destCol] == "") {
				isLegalKingJump = true;
			}
			else if (destRow == pieceRow - 2 && destCol == pieceCol + 2 && board[pieceRow - 1][pieceCol + 1] == "B" 
				&& board[destRow][destCol] == "") {
				isLegalKingJump = true;
			}
		}
		else if (pieceCol < 2) {
			if (destRow == pieceRow + 2 && destCol == pieceCol + 2 && board[pieceRow + 1][pieceCol + 1] == "B" 
				&& board[destRow][destCol] == "") {
				isLegalKingJump = true;
			}
			else if (destRow == pieceRow - 2 && destCol == pieceCol + 2 && board[pieceRow - 1][pieceCol + 1] == "B" 
				&& board[destRow][destCol] == "") {
				isLegalKingJump = true;
			}
		}
		else {
			if (destRow == pieceRow + 2 && destCol == pieceCol - 2 && board[pieceRow + 1][pieceCol - 1] == "B" 
				&& board[destRow][destCol] == "") {
				isLegalKingJump = true;
			}
			else if (destRow == pieceRow - 2 && destCol == pieceCol - 2 && board[pieceRow - 1][pieceCol - 1] == "B" 
				&& board[destRow][destCol] == "") {
				isLegalKingJump = true;
			}
		}
		return isLegalKingJump;
	}
	
	public static boolean isMovingKing(String[][] board, int pieceRow, int pieceCol) {
		boolean isKingMove = false;
		if (board[pieceRow][pieceCol] == "K") {
			isKingMove = true;
		}
		return isKingMove;
	}
	
	public static void updateBoardAfterWhiteKingJump(String[][] board, int pieceRow, int pieceCol, int destRow, int destCol) {
		board[destRow][destCol] = "K";
		board[pieceRow][pieceCol] = "";
		if (destRow > pieceRow && destCol > pieceCol) {
			board[pieceRow + 1][pieceCol + 1] = "";
		}
	    else if (destRow > pieceRow && destCol < pieceCol) {
	    	board[pieceRow + 1][pieceCol - 1] = "";
	    }
	    else if (destRow < pieceRow && destCol < pieceCol) {
	    	board[pieceRow - 1][pieceCol - 1] = "";
	    }
	    else if (destRow < pieceRow && destCol > pieceCol) {
	    	board[pieceRow - 1][pieceCol + 1] = "";
	    }
	}
			
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int i;
		int j;
		int k;
		boolean legal = false;
		String emptyBlack = "|+++++++";
		String emptyWhite = "|       ";
		boolean isJumpMove = false;
		boolean jumpAvailability = false;
		boolean isLegalJ = false;
		boolean isLegalKingSingle = false;
		boolean isLegalKingJump = false;
		
		
		//-------------------------Initialize Board-----------------------------
		String[][] board = new String[9][9];
		
		//initialize all squares
		for (i = 1; i < board.length; ++i) {
			for (j = 1; j < board[i].length; ++j) {
				board[i][j] = "";
			}
		}
		//initialize squares with black pieces 
		for (i = 6; i <= 8; ++i) {
			for (j = 1; j < board[i].length; ++j) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						board[i][j] = "B";
					}
				}
				else {
					if (j % 2 != 0) {
						board[i][j] = "B";
					}
				}
			}
		}
		
		//initialize squares with white pieces
		for (i = 1; i <= 3; ++i) {
			for (j = 1; j < board[i].length; ++j) {
				if (i % 2 != 0) {
					if (j % 2 != 0) {
						board[i][j] = "W";
					}
				}
				else {
					if (j % 2 == 0) {
						board[i][j] = "W";
					}
				}
			}
		}
		//----------------------End of Board Initialization---------------------
		
		
		//---------------------------Welcome Message----------------------------
		System.out.println("");
		System.out.println("\t     ~~~~~~~~ Welcome to Java Checkers ~~~~~~~~");
		System.out.println("~~~~ Do you have what it takes to capture all the Black pieces? ~~~~\n");
		System.out.println("~~~~~~~~~~ Note: This is a simplified version of Checkers ~~~~~~~~~~");
		System.out.println("~~~~~~~~~ Multi jump moves aren't allowed, one jump a turn ~~~~~~~~~");
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~ B = Black pieces, Q = Black king pieces ~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~ W = White pieces, K = White kings pieces ~~~~~~~~~~~~~\n");
		
		printBoard(board, emptyBlack, emptyWhite);
		//------------------------End of Welcome Message------------------------
		
		
		//----------------------------Main Game Loop----------------------------
		while (!checkIfGameWon(board)) {
		while (!legal || !isLegalJ || !isLegalKingSingle || !isLegalKingJump) {
			String pieceToMove = promptPieceToMove(scnr);
			String destinationSquare = promptDestinationSquare(scnr);
			int userPieceCol = getUserPieceColumn(pieceToMove);
			int userPieceRow = getUserPieceRow(pieceToMove);
			int destSquareCol = getDestinationColumn(destinationSquare);
			int destSquareRow = getDestinationRow(destinationSquare);
			if (ifIsJumping(board, userPieceRow, userPieceCol, destSquareRow, destSquareCol)) {
				isLegalJ = checkJumpLegality(board, userPieceRow, userPieceCol, destSquareRow, destSquareCol);
				if (isLegalJ) {
					updateBoardAfterWhiteJump(board,userPieceRow, userPieceCol, destSquareRow, destSquareCol);
					if (checkIfWhiteKinged(board, userPieceRow, userPieceCol, destSquareRow, destSquareCol)) {
						kingWhite(board, destSquareRow, destSquareCol);
					}
					// printBoard(board, emptyBlack, emptyWhite);
					break;
				}
				else {
					errorMessage();
				}
			}
			else if (isMovingKing(board, userPieceRow, userPieceCol)) {
				if (checkIfWhiteKingJumping(userPieceRow, destSquareRow)) {
					isLegalKingJump = checkIfWhiteKingJumpIsLegal(board, userPieceRow, userPieceCol, destSquareRow, destSquareCol);
					if (isLegalKingJump) {
						updateBoardAfterWhiteKingJump(board, userPieceRow, userPieceCol, destSquareRow, destSquareCol);
						//printBoard(board, emptyBlack, emptyWhite);
						break;
					}
					else {
						errorMessage();
					}
				}
				else {
					isLegalKingSingle = checkForKingSingleLegality(board, userPieceRow, userPieceCol, destSquareRow, destSquareCol);
					if (isLegalKingSingle) {
						moveWhiteKingSingle(board, userPieceRow, userPieceCol, destSquareRow, destSquareCol);
						//printBoard(board, emptyBlack, emptyWhite);
						break;
					}
					else {
						errorMessage();
					}
				}
			}
			else {
				legal = checkSingleLegality(board, userPieceRow, userPieceCol, destSquareRow, destSquareCol);
				if (legal) {
					updateBoard(board, userPieceRow, userPieceCol, destSquareRow, destSquareCol);
					if (checkIfWhiteKinged(board, userPieceRow, userPieceCol, destSquareRow, destSquareCol)) {
						kingWhite(board, destSquareRow, destSquareCol);
					}
					//printBoard(board, emptyBlack, emptyWhite);
					break;
				}
				else {
					errorMessage();
				}
			}
		}
		int[] black = findBlackPiece(board);
		while (!canBlackPieceMove(board, black) && !isBlackJumpAvailable(board, black)
			   && !canBlackKingMove(board, black) && !isBlackKingJumpAvailable(board, black)) {
			black = findBlackPiece(board);
		}
		int[] whiteJumped = new int[2];
		int[] destForBlackJump = new int[2];
		int[] destForBlackKingJump = new int[2];
		int[] emptySquareForBlackKing = new int[2];
		if (isBlackKingJumpAvailable(board, black)) {
			destForBlackKingJump = findDestSquareForBlackKingJump(board, black);
			makeBlackKingJump(board, black, destForBlackKingJump);
		}
		else if (isBlackJumpAvailable(board, black)) {
			whiteJumped = findWhitePieceToJump(board, black);
			destForBlackJump = findDestinationSquareForBlackJump(board, black, whiteJumped);
			makeBlackJump(board, black, whiteJumped, destForBlackJump);
		}
		else if (canBlackKingMove(board, black)) {
			emptySquareForBlackKing = findEmptySquareForBlackKing(board, black);
			moveBlackKing(board, black, emptySquareForBlackKing);
		}
		else if (canBlackPieceMove(board, black)) {
			moveComputer(board, black);
		}
		checkForBlackKings(board);
		printBoard(board, emptyBlack, emptyWhite);
		}
	}
}