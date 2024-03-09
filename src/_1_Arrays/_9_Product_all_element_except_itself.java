package _1_Arrays;

//Prefix Algorithm
//leetcode question no--->238(Product of array except itself)
public class _9_Product_all_element_except_itself {

	public static void main(String[] args) {
		
		int[] arr= {2,5,7,4};
		
		int[] left=new int[arr.length];
		int[] right=new int[arr.length];
		left[0]=1;
		for(int i=1;i<arr.length;i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		right[arr.length-1]=1;
		for(int i=arr.length-2;i>=0;i--) {
			right[i]=right[i+1]*arr[i+1];
		}
		for(int i=0;i<arr.length;i++) {
			left[i]=left[i]*right[i];
		}
		for(int i=0;i<left.length;i++) {
			System.out.print(left[i]+" ");
		}
	}

}
