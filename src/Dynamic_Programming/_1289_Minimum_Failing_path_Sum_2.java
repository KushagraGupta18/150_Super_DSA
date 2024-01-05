package Dynamic_Programming;

import java.util.Arrays;

public class _1289_Minimum_Failing_path_Sum_2 {

	public static void main(String[] args) {
		
		int[][] grid= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] dp=new int[grid.length][grid[0].length];
		for(int[] a:dp) {
			Arrays.fill(a, -1);
		}
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<grid[0].length;i++) {
			ans=Math.min(ans,minPath(grid, 0, i,dp));
		}
		System.out.println(ans);
	}
	
	public static int minPath(int[][] grid,int row,int col,int[][] dp) {
		if(row==grid.length || col==grid[0].length || col==-1) {
			return 10000000;
		}
		if(row==grid.length-1 ) {
			return grid[row][col];
		}
		if(dp[row][col]!=-1) {
			return dp[row][col];
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<grid[0].length;i++) {
			if(i!=col) {
				min=Math.min(min, minPath(grid, row+1, i, dp));
			}
		}
		return dp[row][col]=grid[row][col]+min;
	}
	

}
