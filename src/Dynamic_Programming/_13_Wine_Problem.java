package Dynamic_Programming;

import java.util.Arrays;

public class _13_Wine_Problem {

	public static void main(String[] args) {
		
		int[] wine= {2,3,5,1,4};
		int year=1;
		int[][] dp=new int[wine.length][wine.length];
		for(int [] a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(maxProfit(wine, 0, wine.length-1, year,dp));
		System.out.println(maxProfitBU(wine));
	}
	//top down approach
	public static int maxProfit(int[] wine, int i, int j,int year,int[][] dp) {
		if(i>j) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int first=wine[i]*year+maxProfit(wine,i+1,j,year+1,dp);
		int last=wine[j]*year+maxProfit(wine,i,j-1,year+1,dp);
		return dp[i][j]=Math.max(first, last);
	}
	
	
	//bottom up approach
	public static int maxProfitBU(int[] wine) {
		int[][] dp=new int[wine.length][wine.length];
		int year=wine.length;
		for(int i=0;i<wine.length;i++) {
			dp[i][i]=wine[i]*year;
		}
		year--;
		for(int slide=1;slide<dp.length;slide++) {
			for(int j=slide;j<dp.length;j++) {
				int i=j-slide;
				int first=wine[i]*year+dp[i+1][j];
				int last=wine[j]*year+dp[i][j-1];
				dp[i][j]=Math.max(first, last);
			}
			year--;
		}
		return dp[0][dp[0].length-1];
	}

}
