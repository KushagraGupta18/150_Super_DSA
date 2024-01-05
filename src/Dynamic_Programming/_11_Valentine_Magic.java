package Dynamic_Programming;

import java.util.Arrays;

public class _11_Valentine_Magic {

	public static void main(String[] args) {
		int[] boy= {2,11,3};
		int[] girl= {5,7,3,2};
		Arrays.sort(boy);
		Arrays.sort(girl);
		int[][] dp=new int[boy.length+1][girl.length+1];
		for(int [] a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(ValentineMagic(boy, girl, 0, 0,dp));
	}
	public static int ValentineMagic(int[] boys,int[] girls,int i, int j,int[][] dp) {
		if(i==boys.length) {
			return 0;
		}
		if(j==girls.length) {
			return 10000000;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int sel=Math.abs(boys[i]-girls[j])+ValentineMagic(boys, girls, i+1, j+1,dp);
		int rej=ValentineMagic(boys, girls, i, j+1,dp);
		return dp[i][j]=Math.min(sel, rej);
	}
}
