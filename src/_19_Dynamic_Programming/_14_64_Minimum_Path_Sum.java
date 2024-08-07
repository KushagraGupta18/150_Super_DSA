//leetcode question number--->64
package _19_Dynamic_Programming;

import java.util.Arrays;

public class _14_64_Minimum_Path_Sum {

	public static void main(String[] args) {
		
		int[][] grid= {{1,3,1},{1,5,1},{4,2,1}};
		int[][] dp=new int[grid.length][grid[0].length];
		for(int[] a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(minPath(grid, 0, 0,dp));
	}
	//top down approach
	public static int minPath(int[][] grid,int i,int j,int[][] dp) {
		if(i==grid.length || j==grid[0].length) {
			return 10000000;
		}
		if(i==grid.length-1 && j==grid[0].length-1) {
			return grid[i][j];
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int down=minPath(grid, i+1, j,dp);
		int right=minPath(grid, i, j+1,dp);
		return dp[i][j]=grid[i][j]+Math.min(down, right);
		
	}

}
