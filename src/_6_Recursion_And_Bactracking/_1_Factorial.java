package _6_Recursion_And_Bactracking;

public class _1_Factorial {

	public static void main(String[] args) {
		int n=5;
		System.out.println(fac(n));
		
	}
	public static int fac(int n) {
		if(n==1) {
			return 1;
		}
		int ans=fac(n-1);
		return ans*n;
	}

}
