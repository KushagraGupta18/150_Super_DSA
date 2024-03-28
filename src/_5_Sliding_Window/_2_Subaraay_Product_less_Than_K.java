package _5_Sliding_Window;
//leetcode question number--->713
public class _2_Subaraay_Product_less_Than_K {
	//variable size window
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4};
		int k=10;
		
		int si=0;
		int ei=0;
		int ans=0;
		int prod=1;
		while(ei<arr.length) {
			//window grow
			prod=prod*arr[ei];
			//window shrink
			while(si<=ei && prod>=k) {
				prod=prod/arr[si];
				si++;
			}
			//answer calculate
			if(prod<k) {
				ans=ans+(ei-si+1);
			}
			ei++;
		}
		System.out.println(ans);
	}

}
