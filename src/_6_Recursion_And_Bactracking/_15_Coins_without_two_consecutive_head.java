package _6_Recursion_And_Bactracking;

public class _15_Coins_without_two_consecutive_head {

	public static void main(String[] args) {
		int n=3;
		printcomb(n,"");
	}

	public static void printcomb(int n, String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
			printcomb(n-1,ans+"H");
		}
		printcomb(n-1,ans+"T");
	}

}
