package _1_Arrays;

public class _14_Kadans_algo {
	//maximum sum in subarray
	public static void main(String[] args) {
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int ans=Integer.MIN_VALUE;
		int prevsum=0;
		for (int i = 0; i < arr.length; i++) {
			prevsum=prevsum+arr[i];
			ans=Math.max(ans, prevsum);
			if(prevsum<0) {
				prevsum=0;
			}
		}
		System.out.println(ans);
		
	}

}
