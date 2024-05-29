package _6_Recursion_And_Bactracking;

public class _12_Count_Subsequences_2 {

	public static void main(String[] args) {
		String ques="abc";
		int ans=subseq(ques,"");
		System.out.println(ans);
	}
	public static int subseq(String ques, String ans) {
		if(ques.length()==0) {
			return 1;
		}
		int exc=subseq(ques.substring(1),ans);
		int inc=subseq(ques.substring(1),ans+ques.charAt(0));
		return inc+exc;
	}

}
