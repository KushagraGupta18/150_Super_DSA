package _6_Recursion_And_Bactracking;

public class _16_Subsequences_of_dice {

	public static void main(String[] args) {
		int item=4;
		subseq(item,"",0);
	}

	public static void subseq(int item, String ans,int n) {
		if(n>item) {
			return;
		}
		if(n==item) {
			System.out.println(ans);
			return;
		}
		subseq(item,ans+'1',n+1);
		subseq(item,ans+'2',n+2);
		subseq(item,ans+'3',n+3);
	}
	

}
