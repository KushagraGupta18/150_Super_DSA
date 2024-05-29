package _6_Recursion_And_Bactracking;

public class _11_Count_Subsequences_1 {

	static int count=0;
	public static void main(String[] args) {
		String ques="abc";
		subseq(ques,"");
		System.out.println(count);
	}
	public static void subseq(String ques, String ans) {
		if(ques.length()==0) {
			count++;
			return;
		}
		subseq(ques.substring(1),ans);
		subseq(ques.substring(1),ans+ques.charAt(0));
	}

}
