package _1_Arrays;

public class _11_Binary_Search {

	public static void main(String[] args) {
		
		int[] arr= {2,5,8,9,12,14,15,16,17};
		System.out.println(Search(arr, 8));//print idx of item
	}
	public static int Search(int[] arr, int item) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return -1;
	}

}
