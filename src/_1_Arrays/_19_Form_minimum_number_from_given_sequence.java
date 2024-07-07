package _1_Arrays;

public class _19_Form_minimum_number_from_given_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="DIDIID";
		int[] arr=new int[str.length()+1];
		int c=1;
		for(int i=0;i<=str.length();i++) {
			if(i==str.length() || str.charAt(i)=='I') {
				arr[i]=c;
				c++;
				for(int j=i-1;j>=0;j--) {
					if(str.charAt(j)=='D') {
						arr[j]=c;
						c++;
					}
					else {
						break;
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
