package _6_Recursion_And_Bactracking;

public class _7_One_d_array_2 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,2,7};
		int item=2;
		System.out.println(fun(arr,item,arr.length-1));
	}

	public static int fun(int[] arr, int item, int idx) {
		if(idx<0) {
			return -1;
		}
		if(arr[idx]==item) {
			return idx;
		}
		return fun(arr,item,idx-1);
	}
	
}
