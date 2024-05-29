package _6_Recursion_And_Bactracking;

public class _10_Subsequences {

	public static void main(String[] args) {
		 String ques="abc";
		 subseq(ques,"");
	}

	public static void subseq(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
			
		}
		subseq(ques.substring(1),ans);
		subseq(ques.substring(1),ans+ques.charAt(0));
		return;
	}

}
