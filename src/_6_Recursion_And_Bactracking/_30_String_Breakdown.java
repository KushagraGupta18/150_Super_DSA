package _6_Recursion_And_Bactracking;

public class _30_String_Breakdown {

	public static void main(String[] args) {
		String str="nitin";
		fun(str,"");
	}

	public static void fun(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String s=ques.substring(0,i);
			fun(ques.substring(i),ans+s+'|');
		}
	}
	

}
