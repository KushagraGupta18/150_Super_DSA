package _6_Recursion_And_Bactracking;

public class _39_N_Queens {

	public static void main(String[] args) {
		int n=4;
		boolean[][] board=new boolean[n][n];
		queens(n,board,0);
	}

	public static void queens(int tq, boolean[][] board, int row) {
		if(tq==0) {
			Display(board);
			return;
		}
		if(row==board.length) {
			return;
		}
		for(int col=0;col<board[0].length;col++) {
			if(isPossible(board,row,col)) {
				board[row][col]=true;
				queens(tq-1, board, row+1);
				board[row][col]=false;
			}
		}
	}
	
	public static boolean isPossible(boolean[][] board, int row, int col) {
		//upper case
		for(int i=row;i>=0;i--) {
			if(board[i][col]==true) {
				return false;
			}
		}
		
		//side diagonal left
		int rr=row;
		int cc=col;
		while(rr>=0 && cc>=0) {
			if(board[rr][cc]==true) {
				return false;
			}
			rr--;
			cc--;
		}
		
		//side diagonal right
		rr=row;
		cc=col;
		while(rr>=0 && cc<board[0].length) {
			if(board[rr][cc]==true) {
				return false;
			}
			rr--;
			cc++;
		}
		return true;
	}
	
	public static void Display(boolean[][] board) {
		for(int i=0;i<board.length;i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("************************************");
	}


}
