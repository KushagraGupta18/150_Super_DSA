package _6_Recursion_And_Bactracking;

public class _24_Lexographical_Number {

	public static void main(String[] args) {
		int n=10;
		lex(0,n);
	}

	public static void lex(int curr, int n) {
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		int k=0;
		if(curr==0) {
			k=1;
		}
		for(int i=k;i<=9;i++) {
			lex(curr*10+i,n);
		}
	}
	

}
