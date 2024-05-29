package _6_Recursion_And_Bactracking;

public class _6_One_D_Array {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int item=5;
		System.out.println(fun(arr,item,0));
	}

	public static int fun(int[] arr, int item,int idx) {
		if(idx>=arr.length) {
			return -1;
		}
		if(arr[idx]==item) {
			return idx;
		}
		return fun(arr,item,idx+1);
	}
	
}
