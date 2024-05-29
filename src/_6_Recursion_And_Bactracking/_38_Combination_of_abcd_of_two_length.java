package _6_Recursion_And_Bactracking;

public class _38_Combination_of_abcd_of_two_length {
	
	public static void main(String[] args) {
		int n=2;
		String str="abcd";
		Permutation(n,str,"",0);
		
	}

	private static void Permutation(int n, String str, String ans,int idx) {
		if(ans.length()==n){
			System.out.println(ans);
			return;
		}
		if(idx>=str.length()) {
			return;
		}
		for(int i=idx;i<str.length();i++) {
			Permutation(n, str, ans+str.charAt(i),i+1);
		}
		
	}
}
