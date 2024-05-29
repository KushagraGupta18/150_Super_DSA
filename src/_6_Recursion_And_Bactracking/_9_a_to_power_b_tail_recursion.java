package _6_Recursion_And_Bactracking;

public class _9_a_to_power_b_tail_recursion {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		System.out.println(fun(a,b,1));
	}

	public static int fun(int a, int b, int ans) {
		if(b==0) {
			return ans;
		}
		return fun(a,b-1,ans*a);
	}
	

}
