package _6_Recursion_And_Bactracking;

public class _29_Print_all_Combination_of_Coins {

	public static void main(String[] args) {
		int[] arr= {2,3,5};
		int item=10;
		comb(arr,item,0,"",0);
	}

	public static void comb(int[] arr, int item, int sum, String ans,int idx) {
		if(sum>item) {
			return;
		}
		if(sum==item) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<arr.length;i++){
			comb(arr, item, sum+arr[i], ans+arr[i],i);
		}
	}
}
