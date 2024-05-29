package _6_Recursion_And_Bactracking;

public class _23_Letter_Combination_Of_a_phone_number {
	static String[] key= {"", "abc", "def", "ghi", "jkl", "mno", "pqr", "stuv", "wx", "yz"}; 
	public static void main(String[] args) {
		String str="12";
		letter(str,"");
	}
	public static void letter(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		int num=ch-'0';
		String str=key[num];
		for(int i=0;i<str.length();i++) {
			letter(ques.substring(1),ans+str.charAt(i));
		}
	}

}
