package Recurssion;

import java.util.*;

public class nQueens {
	
	public static void main (String arg[]) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		List<List<String>> allBoard = solveQueens(n);
		System.out.print(allBoard);
	}

	public static List<List<String>> solveQueens(int n) {
		List<List<String>> allBoard = new ArrayList<>();
		char [][] board = new char[n][n];
		
		helper(allBoard, board, 0);
		
		return allBoard;
		
	}

	private static void helper(List<List<String>> allBoard, char[][] board, int col) {
		
		if(col==board.length) {
			saveBoard(allBoard, board);
			
			return;
		}
		
		for(int row=0 ; row<board.length ; row++) {
			if(isSafe(row,col,board)) {
				board[row][col]='Q';
				helper(allBoard, board, col+1);
				board[row][col]='.';
			}
		}
		
	}

	private static void saveBoard(List<List<String>> allBoard, char[][] board) {
		String row = "";
		List<String> newBoard = new ArrayList<>();
		
		for (int i=0; i<board.length;i++) {
			row="";
			for(int j=0; j<board.length;j++) {
				if (board[i][j]=='Q') {
				row = row + 'Q';
				}else row=row+'.';
			}
			newBoard.add(row);
		}
		
		allBoard.add(newBoard);
		
		
	}

	private static boolean isSafe(int row, int col, char[][] board) {
		
		//vertical check
		for(int i=0; i<board.length;i++) {
			if(board[i][col]=='Q') {
				return false;
			}
			
		}
		
		//horizontal check
		for(int i=0; i<board.length;i++) {
			if(board[row][i]=='Q') {
				return false;
			}
					
		}
		
		//upper left
		int r = row;
		for(int c=col; c>=0 && r>=0; c-- ,r--) {
			if(board[r][c]=='Q') {
				return false;
			}
		}
		
		//lower right
		r = row;
		for(int c=col; c<board.length && r<board.length; c++ ,r++) {
		if(board[r][c]=='Q') {
				return false;
			}
		}
		
		//upper right
		r = row;
		for(int c=col; c<board.length && r>=0; c++ ,r--) {
		if(board[r][c]=='Q') {
				return false;
		}
		}
		
		//lower left
		r = row;
		for(int c=col; r<board.length && c>=0; c-- ,r++) {
			if(board[r][c]=='Q') {
				return false;
					}
		}
		
		return true;
	}
	
	
	
}
