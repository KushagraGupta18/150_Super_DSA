package _6_Recursion_And_Bactracking;

public class _26_Print_Permutation_Of_Queen {

	public static void main(String[] args) {
		int n=4;
		int q=2;
		boolean [] board=new boolean[n];
		perm(n,q,board,"",0);
	}

	public static void perm(int n, int q,boolean[] board, String ans, int cq) {
		if(cq>=q) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				perm(n,q,board,ans+'b'+i+'q'+cq,cq+1);
				board[i]=false;
			}
		}
		
	}

}
