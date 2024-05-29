package _6_Recursion_And_Bactracking;

public class _4_Factorial_Tail_recursion {

	public static void main(String[] args) {
		int n=5;
		System.out.println(Fac(n,1));
	}
	public static int Fac(int n, int ans) {
		if(n==1) {
			return ans;
		}
		return Fac(n-1,ans*n);
	}
	

}
