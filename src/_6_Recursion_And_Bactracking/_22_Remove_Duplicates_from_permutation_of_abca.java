package _6_Recursion_And_Bactracking;

public class _22_Remove_Duplicates_from_permutation_of_abca {

	public static void main(String[] args) {
		String str="abca";
		perm(str,"");
	}

	public static void perm(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			boolean flag=true;
			for(int j=i+1;j<ques.length();j++) {
				if(ch==ques.charAt(j)) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				perm(ques.substring(0,i)+ques.substring(i+1),ans+ch);
			}
			
		}
	}
}
