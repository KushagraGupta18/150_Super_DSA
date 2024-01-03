package Dynamic_Programming;

import java.util.Arrays;

public class _518_Coin_Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] coin= {1,2,5};
		int amount=5;
		int[][] dp=new int[amount+1][coin.length+1];
		for(int[] a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(CoinChange(coin, amount, 0,dp));
	}
	public static int CoinChange(int[] coin, int amount, int i,int[][] dp) {
		if(amount==0) {
			return 1;
		}
		if(i==coin.length) {
			return 0;
		}
		if(dp[amount][i]!=-1) {
			return dp[amount][i];
		}
		int inc=0;
		int exc=0;
		if(amount>=coin[i]) {
			inc=CoinChange(coin, amount-coin[i], i,dp);//dp[amount-coin[i]][i]
		}
		exc=CoinChange(coin,amount,i+1,dp);//dp[amount][i+1]
		return dp[amount][i]=inc+exc;
	}

}
