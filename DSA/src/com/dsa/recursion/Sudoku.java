package com.dsa.recursion;

public class Sudoku {
	static boolean isSafe(int[][] mat,int i,int j,int no,int n) {
		
		//Check for row and col
		for(int k=0;k<n;k++) {
			if(mat[k][j] == no || mat[i][k] == no) {
				return false;
			}
		}
		
		//check for subgrid
		int sx = (i/3)*3;
		int sy = (j/3)*3;
		
		for(int x=sx;x<sx+3;x++) {
			for(int y=sy;y<sy+3;y++) {
				if(mat[x][y] == no) {
					return false;
				}
			}
		}
		return true;
	}
	static boolean solveSudoku(int[][] mat,int i,int j,int n) {
		//base case
		if(i == n) {
			//print the solution later
			for(int m1=0;m1<9;m1++) {
				for(int m2=0;m2<9;m2++) {
					System.out.print(mat[m1][m2]+" ");
				}
				System.out.println();
			}
			return true;
		}
		//rec case
		if(j==n) {
			return solveSudoku(mat, i+1, 0, n);
		}
		//skip the prefilled cell
		if(mat[i][j] !=0) {
			return solveSudoku(mat, i, j+1, n);
		}
		
		//cell to be filled
		//try out all possibilities
		for(int no=1;no<=n;no++) {
			//whether it is safe to place the no or not
			if(isSafe(mat,i,j,no,n)) {
				mat[i][j] = no;
				boolean solveSubProblem = solveSudoku(mat, i, j+1, n);
				if(solveSubProblem == true) {
					return true;
				}
			}
		}
		mat[i][j]=0;
		return false;
	}

	public static void main(String[] args) {
		int n=9;
//		int [][] mat = 
//			{{5,3,0,0,7,0,0,0,0},
//			{6,0,0,1,9,5,0,0,0},
//			{0,9,8,0,0,0,0,6,0},
//			{8,0,0,0,6,0,0,0,3},
//			{4,0,0,8,0,3,0,0,1},
//			{7,0,0,0,2,0,0,0,6},
//			{0,6,0,0,0,0,2,8,0},
//			{0,0,0,4,1,9,0,0,5},
//			{0,0,0,0,8,0,0,7,9}};
//		int [][] mat = 
//			{{9,6,0,0,0,0,1,4,0},
//			{0,0,7,0,2,4,0,0,0},
//			{0,0,0,0,0,0,0,0,9},
//			{0,0,0,0,5,3,0,9,0},
//			{0,9,0,6,0,7,0,2,5},
//			{0,8,0,1,9,0,0,0,0},
//			{6,0,0,0,0,0,0,0,0},
//			{0,0,0,4,1,0,2,0,0},
//			{0,2,5,0,0,0,0,1,8}};
//		int [][] mat = 
//			{{0,0,0,0,0,0,0,1,4},
//			{0,0,0,0,0,0,2,0,3},
//			{8,0,0,0,5,0,0,0,0},
//			{0,0,0,2,0,7,0,0,0},
//			{0,3,1,0,0,0,0,0,0},
//			{0,0,0,0,0,0,6,5,0},
//			{6,0,0,0,0,0,7,0,0},
//			{0,0,0,1,4,0,0,0,0},
//			{0,0,0,3,0,0,0,0,0}};

		int [][] mat = 
			{{8,0,0,0,0,0,0,0,0},
			{0,0,3,6,0,0,0,0,0},
			{0,7,0,0,9,0,2,0,0},
			{0,5,0,0,0,7,0,0,0},
			{0,0,0,0,4,5,7,0,0},
			{0,0,0,1,0,0,0,3,0},
			{0,0,1,0,0,0,0,6,8},
			{0,0,8,5,0,0,0,1,0},
			{0,9,0,0,0,0,4,0,0}};
		long a = System.currentTimeMillis();
		if(!solveSudoku(mat,0,0,n)) {
			System.out.println("No Solution Exists!");
		}
		long b = System.currentTimeMillis();
		System.out.println("Time taken to execute the Sudoko Algo Function -> "+(b-a));
	}
}
