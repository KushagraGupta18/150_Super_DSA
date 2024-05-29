package _6_Recursion_And_Bactracking;

public class _3_Pointer_Increase {

	public static void main(String[] args) {
		int n=5;
		PI(n);
	}
	
	public static void PI(int n) {
		if(n==0) {
			return;
		}
		PI(n-1);
		System.out.println(n);
	}
	

}
