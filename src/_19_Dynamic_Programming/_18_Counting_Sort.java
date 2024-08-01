package _19_Dynamic_Programming;
import java.util.*;
public class _18_Counting_Sort {

	public static void main(String[] args) {
	
		int[] arr= {2,1,1,0,1,2,5,4,0,2,8,7,9,2,6,1,9};
		arr=Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] Sort(int[] arr) {
		int max=Arrays.stream(arr).max().getAsInt();
		int[] freq=new int[max+1];
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]++;
		}
		//System.out.println(Arrays.toString(freq));//direct print the array
		for (int i = 1; i < freq.length; i++) {
			freq[i]=freq[i-1]+freq[i];
		}
		int[] ans=new int[arr.length];
		for (int i = arr.length-1; i >=0; i--) {
			int pos=freq[arr[i]];
			ans[pos-1]=arr[i];
			freq[arr[i]]--;
		}
		return ans;
		
		
	}

}
