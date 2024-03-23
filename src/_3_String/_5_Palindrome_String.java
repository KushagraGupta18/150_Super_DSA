package _3_String;

public class _5_Palindrome_String {

	public static void main(String[] args) {
		
		String str="nitin";
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++){
				if(check(str,i,j)) {
					System.out.println(str.substring(i,j));
				}
			}
		}
	}

	public static boolean check(String str, int i, int j) {
		int si=i;
		int ei=j-1;
		while(si<ei) {
			if(str.charAt(si)!=str.charAt(ei)) {
				return false;
			}
			si++;
			ei--;
		}
		return true;
	}

}
