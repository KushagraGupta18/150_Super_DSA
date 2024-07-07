package _9_Prime_Sieve;

public class _4_palindromic_substring {

	public static void main(String[] args) {
		//Axis Orbit Concept
		
		String str="nitin";
		System.out.println(countPalindromic(str));
	}
	public static int countPalindromic(String str) {
		//for odd palindrome substring
		int count=0;
		for(int axis=0;axis<str.length();axis++) {
			for(int orbit=0;axis-orbit>=0 && axis+orbit<str.length();orbit++) {
				if(str.charAt(axis-orbit)==str.charAt(axis+orbit)) {
					count++;
				}
				else {
					break;
				}
			}
		}
		
		//for even palindromic substring
		int count1=0;
		for(double axis=0.5;axis<str.length();axis++) {
			for(double orbit=0.5;axis-orbit>=0 && axis+orbit<str.length() ;orbit++) {
				if(str.charAt((int)(axis-orbit))==str.charAt((int)(axis+orbit))) {
					count1++;
				}
				else {
					break;
				}
			}
		}
		return count+count1;
	}

}
