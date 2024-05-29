package _6_Recursion_And_Bactracking;

public class _2_Pointer_Decrease {

	public static void main(String[] args) {
		int n=5;
		PD(n);
	}

	public static void PD(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		PD(n-1);
	}
	

}
