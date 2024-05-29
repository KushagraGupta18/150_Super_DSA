package _6_Recursion_And_Bactracking;

public class _21_Permutation_Of_abc {

	public static void main(String[] args) {
		String str="abc";
		perm(str,"");
	}

	public static void perm(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length();i++) {
			perm(ques.substring(0,i)+ques.substring(i+1),ans+ques.charAt(i));
		}
	}
	

}
