package _6_Recursion_And_Bactracking;

public class _8_A_To_Power_B {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		System.out.println(fun(a,b));
	}

	public static int fun(int a, int b) {
		if(b==0) {
			return 1;
		}
		int ans=fun(a,b-1);
		return ans*a;
	}

}
