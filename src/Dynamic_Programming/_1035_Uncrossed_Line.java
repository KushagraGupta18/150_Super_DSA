//leetcode question number--->1035
package Dynamic_Programming;

import java.util.Arrays;

public class _1035_Uncrossed_Line {

	public static void main(String[] args) {
		int[] nums1= {1,4,2};
		int[] nums2= {1,2,4};
		int[][] dp=new int[nums1.length+1][nums2.length+1];
		for(int [] a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(LCS(nums1,nums2,0,0,dp));
	}
	public static int LCS(int[] nums1, int[] nums2, int i, int j,int[][] dp) {
		if(i==nums1.length || j==nums2.length) {
			return 0;
		}	
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int ans=0;
		if(nums1[i]==nums2[j]) {
			ans=1+LCS(nums1,nums2,i+1,j+1,dp);//dp[i+1][j+1]
		}	
		else {
			int fs=LCS(nums1,nums2,i+1,j,dp);//dp[i+1][j]
			int ss=LCS(nums1,nums2,i,j+1,dp);//dp[i][j+1]
			ans=Math.max(fs, ss);
		}
		return dp[i][j]=ans;
	}

}
