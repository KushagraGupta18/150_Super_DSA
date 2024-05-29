package _6_Recursion_And_Bactracking;

public class _5_Fibbonacci_Number {

	public static void main(String[] args) {
		int n=5;
		System.out.println(fib(n));
	}

	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int a=fib(n-1);
		int b=fib(n-2);
		return a+b;
	}
}
