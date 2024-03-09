package _1_Arrays;

public class _8_Insertion_Sort {

	public static void main(String[] args) {
		
		int[] arr= {2,5,7,1,4,3};
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int item=arr[i];
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			j++;
			arr[j]=item;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
