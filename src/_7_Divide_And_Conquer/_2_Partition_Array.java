package _7_Divide_And_Conquer;

public class _2_Partition_Array {

	public static void main(String[] args) {
		int[] arr= {9,1,56,-9,56,5,2,68,5,62,3,2,1,3,7};
		int idx=index(arr,0,arr.length-1);
		System.out.println(idx);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int index(int[] arr, int lo ,int hi) {
		
		int lastElem=arr[hi];
		int idx=lo;
		for(int i=lo;i<hi;i++) {
			if(arr[i]<=lastElem) {
				//swap(i,idx)
				int temp=arr[i];
				arr[i]=arr[idx];
				arr[idx]=temp;
				idx++;
			}
		}
		//swap(hi,idx)
		int temp=arr[hi];
		arr[hi]=arr[idx];
		arr[idx]=temp;
		return idx;//position(index) in which our last element is put.
	}
}
