package Dynamic_Programming;

import java.util.Arrays;

public class _10_Edit_Distance_SPOJ {

	public static void main(String[] args) {
		String s1="food";
		String s2="money";
		int[][] dp=new int[s1.length()+1][s2.length()+1];
		for(int [] a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(editdist(s1, s2, 0, 0,dp));
		System.out.println(editdistBU(s1, s2));
	}
	//top down approach
	public static int editdist(String s1, String s2, int i, int j,int[][] dp) {
		if(i==s1.length()) {
			return s2.length()-j;
		}
		if(j==s2.length()) {
			return s1.length()-i;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int ans=0;
		if(s1.charAt(i)==s2.charAt(j)) {
			ans=editdist(s1, s2, i+1, j+1, dp);//dp[i+1][j+1]
		}
		else {
			int delete=editdist(s1, s2, i+1, j, dp);//dp[i+1][j]
			int insert=editdist(s1, s2, i, j+1, dp);//dp[i][j+1]
			int replace=editdist(s1, s2, i+1, j+1, dp);//dp[i+1][j+1]
			ans=Math.min(delete, Math.min(insert, replace))+1;
		}
		return dp[i][j]=ans;
	}

	
	//bottum up approach
	public static int editdistBU(String s1, String s2) {
		int[][] dp=new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<dp.length;i++) {
			dp[i][0]=i;
		}
		for(int i=0;i<dp[0].length;i++) {
			dp[0][i]=i;
		}
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				int ans=0;
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					ans=dp[i-1][j-1];
				}
				else {
					int delete=dp[i-1][j];
					int insert=dp[i][j-1];
					int replace=dp[i-1][j-1];
					ans=Math.min(delete, Math.min(insert, replace))+1;
				}
				dp[i][j]=ans;
			}
		}
		return dp[dp.length-1][dp[0].length-1];
	}
}