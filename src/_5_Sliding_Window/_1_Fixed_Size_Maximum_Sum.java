package _5_Sliding_Window;

public class _1_Fixed_Size_Maximum_Sum {

	public static void main(String[] args) {
		
		int[] arr= {1,2,7,5,11,3,2,1};
		int k=3;
		int max=0;
		int ans=0;
		//1st window
		for(int i=0;i<k;i++) {
			max+=arr[i];
		}
		ans=Math.max(ans, max);
		int si=0;
		int ei=k;
		while(ei<arr.length) {
			 //window grow 
			 max=max+arr[ei];
			 //window shrink
			 max=max-arr[si];
			 ans=Math.max(ans, max);
			 si++;
			 ei++;
		}
		System.out.println(ans);
	}

}
