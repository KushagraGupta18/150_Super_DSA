package _6_Recursion_And_Bactracking;

public class _28_Print_All_Permutation_Of_Coins {

	public static void main(String[] args) {
		int[] arr= {2,3,5};
		int item=10;
		perm(arr,item,0,"");
	}

	public static void perm(int[] arr, int item, int sum, String ans) {
		if(sum>item) {
			return;
		}
		if(sum==item) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<arr.length;i++) {
			perm(arr, item, sum+arr[i], ans+arr[i]);
		}
	}
	

}
