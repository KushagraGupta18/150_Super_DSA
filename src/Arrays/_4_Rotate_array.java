package Arrays;
//leetcode quetion number--->189

public class _4_Rotate_array {
	//Reversal Algo
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int k=3;
		rotate(arr,k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void rotate(int[] arr, int k) {
		k=k%arr.length;
		reverse(arr,arr.length-k,arr.length-1);//last k element
		reverse(arr,0,arr.length-k-1);//All elements except last element
		reverse(arr,0,arr.length-1);//all element
		
	}

	public static void reverse(int[] arr, int i, int j) {
		int si=i;
		int ei=j;
		while(si<ei) {
			int temp=arr[si];
			arr[si]=arr[ei];
			arr[ei]=temp;
			si++;
			ei--;
		}
	}

}
