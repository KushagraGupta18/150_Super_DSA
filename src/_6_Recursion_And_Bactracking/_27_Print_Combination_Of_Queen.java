package _6_Recursion_And_Bactracking;

public class _27_Print_Combination_Of_Queen {

	public static void main(String[] args) {
		int n=4;
		int q=2;
		boolean [] board=new boolean[n];
		comb(n,q,board,"",0,0);
	}

	public static void comb(int n, int q,boolean[] board, String ans, int cq,int idx) {
		if(cq>=q) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				comb(n,q,board,ans+'b'+i+'q'+cq,cq+1,i+1);
				board[i]=false;
			}
		}
		
	}

}
