package _6_Recursion_And_Bactracking;

public class _40_Sudoku_Solver {

	public static void main(String[] args) {
		int[][] grid= { {5,3,0,0,7,0,0,0,0},
				{6,0,0,1,9,5,0,0,0},
				{0,9,8,0,0,0,0,6,0},
				{8,0,0,0,6,0,0,0,3},
				{4,0,0,8,0,3,0,0,1},
				{7,0,0,0,2,0,0,0,6}, 
				{0,6,0,0,0,0,2,8,0},
				{0,0,0,4,1,9,0,0,5},
				{0,0,0,0,8,0,0,7,9} };
		Sudoku(grid,0,0);
		System.out.println();
	}

	public static void Sudoku(int[][] grid, int row, int col) {
		if(col==9) {
			row++;
			col=0;
		}
		if(row==9) {
			Display(grid);
			return;
		}
		if(grid[row][col]!=0) {
			Sudoku(grid, row, col+1);
		}
		else {
			for (int val = 1; val <=9; val++) {
				if(ispossible(grid,row,col,val)) {
					grid[row][col]=val;
					Sudoku(grid, row, col+1);
					grid[row][col]=0;//undo
				}
			}
		}
	}
	public static boolean ispossible(int[][] grid, int row, int col, int val) {
		//row
		int r=row;
		for(int c=0;c<grid[0].length;c++) {
			if(grid[r][c]==val) {
				return false;
			}
		}
		//col
		int c=col;
		for(r=0;r<grid.length;r++) {
			if(grid[r][c]==val) {
				return false;
			}
		}
		//3*3 matrix
		r=row-row%3;
		c=col-col%3;
		for (int i = r; i < r+3; i++) {
			for (int j = c; j<c+3; j++) {
				if(grid[i][j]==val) {
					return false;
				}
			}
		}
		return true;
	}
	public static void Display(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}	

}
