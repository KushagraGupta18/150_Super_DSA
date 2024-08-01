//leetcode question number--->746
package _19_Dynamic_Programming;

import java.util.Arrays;

public class _4_746_min_cost_climbing_stairs {

	public static void main(String[] args) {
		int[] arr= {1,100,1,1,1,100,1,1,100,1};
		int[] dp=new int[arr.length];
		Arrays.fill(dp, -1);
		int zeroth=minCost(arr, 0,dp);
		Arrays.fill(dp, -1);
		int first=minCost(arr, 1,dp);
		System.out.println(Math.min(zeroth, first));
		System.out.println(mincostBU(arr,dp));
	}
	//top down approach
	public static int minCost(int[] arr, int i,int[] dp) {
		if(i>=arr.length) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		int first=minCost(arr,i+1,dp);
		int second=minCost(arr,i+2,dp);
		return dp[i]=Math.min(first, second)+arr[i];
		
	}
	//bottom up approach
	public static int mincostBU(int[] arr, int [] dp) {
		Arrays.fill(dp, -1);
		dp[0]=arr[0];
		dp[1]=arr[1];
		for(int i=2;i<dp.length;i++) {
			dp[i]=arr[i]+Math.min(dp[i-1], dp[i-2]);
		}
		return Math.min(dp[dp.length-1],dp[dp.length-2]);
	}
}
