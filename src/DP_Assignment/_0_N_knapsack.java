package DP_Assignment;
import java.util.*;
public class _0_N_knapsack {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cap=sc.nextInt();
		int[] wt=new int[n];
		int[] val=new int[n];
		for(int i=0;i<wt.length;i++) {
			wt[i]=sc.nextInt();
		}
		for(int i=0;i<val.length;i++) {
			val[i]=sc.nextInt();
		}
		int[][] dp=new int[cap+1][val.length+1];
		for(int [] a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(knapsack(wt,val,cap,0,dp));
	}
	public static int knapsack(int[] wt, int[] val, int cap, int i,int[][] dp) {
		if(i==val.length || cap==0) {
			return 0;
		}
		if(dp[cap][i]!=-1) {
			return dp[cap][i];
		}
		int inc=0;
		if(cap>=wt[i]) {
			inc=val[i]+knapsack(wt,val,cap-wt[i],i,dp);
		}
		int exc=knapsack(wt,val,cap,i+1,dp);
		return dp[cap][i]=Math.max(inc, exc);
	}

}
