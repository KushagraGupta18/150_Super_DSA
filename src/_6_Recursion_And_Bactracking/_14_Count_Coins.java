package _6_Recursion_And_Bactracking;

public class _14_Count_Coins {

	public static void main(String[] args) {
		int n=3;
		System.out.println(printcomb(n,""));
	}

	public static int printcomb(int n, String ans) {
		if(n==0) {
			return 1;
		}
		return printcomb(n-1,ans+"H") +printcomb(n-1,ans+"T");
	}

}
