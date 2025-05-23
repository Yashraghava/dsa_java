package com.dsa.recursion;

import java.util.Arrays;

public class NQueen {
	public static void printBoard(int n, int board[][]) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean solveNQueen(int n, int[] board[], int i) {
		// base case
		if (i == n) {
			// print the board
			printBoard(n, board);
			return true;
		}
		// rec case
		// try to place queen in every row
		for (int j = 0; j < n; j++) {
			if (canPlace(board, n, i, j)) {
				board[i][j] = 1;
				boolean success = solveNQueen(n, board, i + 1);
				if (success) {
					return true;
				}
				// backtrack
				board[i][j] = 0;
			}
		}
		return false;
	}

	public static boolean canPlace(int[][] board, int n, int x, int y) {
		// Column
		for (int k = 0; k < x; k++) {
			if (board[k][y] == 1) {
				return false;
			}
		}
		// Left Diagonal
		int i = x, j = y;
		while (i >= 0 && j >= 0) {
			if (board[i][j] == 1) {
				return false;
			}
			i--;
			j--;
		}

		// Right Diagonal
		i = x;
		j = y;
		while (i >= 0 && j < n) {
			if (board[i][j] == 1) {
				return false;
			}
			i--;
			j++;
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] board = new int[20][20];
		for (int i = 0; i < 20; i++) {
			Arrays.fill(board[i], 0);
		}
		long a = System.currentTimeMillis();
		solveNQueen(4, board, 0);
		long b = System.currentTimeMillis();
		System.out.println("Time for Execution -> " + (b - a));
	}
}
