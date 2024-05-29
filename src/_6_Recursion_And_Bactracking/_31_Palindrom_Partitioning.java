package _6_Recursion_And_Bactracking;

public class _31_Palindrom_Partitioning {

	public static void main(String[] args) {
		String str="nitin";
		pal(str,"");
	}

	public static void pal(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String s=ques.substring(0,i);
			if(ispalindrome(s)) {
				pal(ques.substring(i),ans+s+'|');
			}
		}
	}

	public static boolean ispalindrome(String ques) {
		int si=0;
		int ei=ques.length()-1;
		while(si<ei) {
			if(ques.charAt(si)!=ques.charAt(ei)) {
				return false;
			}
			si++;
			ei--;
		}
		return true;
		
	}
}
