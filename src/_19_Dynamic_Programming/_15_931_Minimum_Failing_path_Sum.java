//leetcode question number--->931
package _19_Dynamic_Programming;

import java.util.Arrays;

public class _15_931_Minimum_Failing_path_Sum {

	public static void main(String[] args) {
		
		int[][] grid= {{2,1,3},{6,5,4},{7,8,9}};
		
		int[][] dp=new int[grid.length][grid[0].length];
		for(int[] a:dp) {
			Arrays.fill(a, Integer.MAX_VALUE);
		}
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<grid[0].length;i++) {
			ans=Math.min(ans,minPath(grid, 0, i,dp));
		}
		System.out.println(ans);
	}
	public static int minPath(int[][] grid,int i,int j,int[][] dp) {
		if(i==grid.length || j==grid[0].length || j==-1) {
			return 10000000;
		}
		if(i==grid.length-1 ) {
			return grid[i][j];
		}
		if(dp[i][j]!=Integer.MAX_VALUE) {
			return dp[i][j];
		}
		int down=minPath(grid, i+1, j,dp);
		int rightdown=minPath(grid, i+1, j+1,dp);
		int leftdown=minPath(grid, i+1, j-1,dp);
		return dp[i][j]=grid[i][j]+Math.min(down, Math.min(rightdown, leftdown));
	}

}
