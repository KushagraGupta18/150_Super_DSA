package _3_String;

public class _6_Longest_Good_Substring {

	public static void main(String[] args) {
		String str="cbaeide";
		int len=0;
		int ans=0;
		String an="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
				len++;
				if(len>ans) {
					an=str.substring(i+1-len,i+1);
					ans=len;
				}
			}
			else {
				len=0;
			}
		}
		System.out.println(an);
	}

}
