package Arrays;

public class _7_Selection_Sort {

	public static void main(String[] args) {

		
		int[] arr= {2,5,7,1,1,10,9};
		for(int i=0;i<arr.length-1;i++) {
			int min_idx=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_idx];
			arr[min_idx]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
