package _2_2D_Array_String;
import java.util.*;
public class _7_Good_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(GoodSubArray(arr));
		}
	}
	public static long GoodSubArray(int[] arr) {
		int n=arr.length;
		long[] freq=new long[n];
		long sum=0;
		freq[0]=1;//aisa subarray jisme ek bhi element na ho vo hmesha divisible hoga n ke
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
			sum=sum%n;
			if(sum<0) {//for negative remainder(make it positive remainder--->(neg rem+n))
				sum=sum+n;
			}
			freq[(int)sum]++;
		}
		long ans=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>=2) {	//ncr
				ans+=(freq[i]*(freq[i]-1))/2;//n(n-1)/2
			}
		}
		return ans;
	}

}
