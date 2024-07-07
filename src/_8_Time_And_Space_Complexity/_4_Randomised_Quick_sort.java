package _8_Time_And_Space_Complexity;

import java.util.Random;

public class _4_Randomised_Quick_sort {

	public static void main(String[] args) {
		
		int[] arr= {9,1,56,-9,56,5,2,68,5,62,3,2,1,3,7};
		Random_number(arr, 0, arr.length-1);
		quickSort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void Random_number(int[] arr,int si, int ei) {

		Random rand = new Random();
		int lo = si;
		int hi = ei;
		int ri = rand.nextInt(hi - lo +1)+lo;
		int temp=arr[ei];//swapping with last number
		arr[ei]=arr[ri];
		arr[ri]=temp;
	}
	
	public static void quickSort(int[] arr, int lo, int hi) {
		if(lo>=hi) {
			return; 
		}
		int idx=partition(arr,lo,hi);
		quickSort(arr,lo,idx-1);
		quickSort(arr,idx+1,hi);
	}

	
	public static int partition(int[] arr, int lo ,int hi) {
		int pivot=arr[hi];
		int idx=lo;
		for(int i=lo;i<hi;i++) {
			if(arr[i]<=pivot) {
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
