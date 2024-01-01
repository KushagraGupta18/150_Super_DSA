//leetcode question number--->198
package Dynamic_Programming;

import java.util.Arrays;

public class _198_House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,7,9,3,1};
		int[] dp=new int[arr.length];
//		for(int i=0;i<dp.length;i++) {
//			dp[i]=-1;
//		}
		Arrays.fill(dp, -1);    //fill the dp array by -1
		System.out.println(Robber(arr,0,dp));
		Arrays.fill(dp,-1);
		System.out.println(Robber2(arr,arr.length-1,dp));
		Arrays.fill(dp,-1);
		System.out.println(Robber3(arr));
	}
	
	//(top down approach)
	
	//we start from starting index(forward dp i.e loop starts from forward{i=0})-->so DP table fill from backside. And we will get the answer from starting index
	public static int Robber(int[] arr, int i,int[] dp) {
		if(i>=arr.length) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		int rob = arr[i]+Robber(arr,i+2,dp);
		int Dont_rob=Robber(arr,i+1,dp);
		return dp[i]=Math.max(rob, Dont_rob);
	}
	
	//we start from ending index(Backward dp i.e loop starts from backward{i=arr.length-1})-->so DP table fill from frontside. And we will get the answer from backside index	
	public static int Robber2(int[] arr, int i,int[] dp) {
		if(i<0) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		int rob = arr[i]+Robber2(arr,i-2,dp);
		int Dont_rob=Robber2(arr,i-1,dp);
		return dp[i]=Math.max(rob, Dont_rob);
	}
	
	
	
	
	//Bottom Up approach
	public static int Robber3(int[] arry) {
		if(arry.length==1) {
			return arry[0];
		}
		int[] dp=new int[arry.length];
		dp[0]=arry[0];
		dp[1]=Math.max(arry[1], arry[0]);
		for(int i=2;i<dp.length;i++) {
			int rob=arry[i]+dp[i-2];
			int dont_rob=dp[i-1];
			dp[i]=Math.max(rob, dont_rob);
		}
		return dp[dp.length-1];
	}
	
	
}
