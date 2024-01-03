package Dynamic_Programming;

public class _0_1_Knapsack {

	public static void main(String[] args) {
		
		int n=5;
		int cap=4;
		int[] size= {1,2,3,2,2};
		int[] value= {8,4,0,5,3};
		int[][] dp=new int[cap+1][size.length+1];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j]=-1;
			}
		}
		System.out.println(knapsack(size, value, cap, 0,dp));
		System.out.println(knapsackBU(size,value,cap));
	}

//	top down approach
	public static int knapsack(int []size, int[] value,int cap, int i,int[][] dp) {
		if(i==size.length ||cap==0) {
			return 0;
		}
		if(dp[cap][i]!=-1) {
			return dp[cap][i];
		}
		int inc=0,exc=0;
		if(cap>=size[i]) {
			inc=value[i]+knapsack(size, value, cap-size[i], i+1,dp);//dp[cap-size[i]][i+1]
		}
		exc=knapsack(size, value, cap,i+1,dp);//dp[cap][i+1]
		return dp[cap][i]=Math.max(inc, exc);
	}

	//bottom up approach
	public static int knapsackBU(int[] size, int [] value, int cap) {
		
		int[][] dp=new int[cap+1][size.length+1];
		for(int c=1;c<size.length;c++) {
			for(int i=1;i<value.length;i++) {
				int inc=0,exc=0;
				if(c>=size[i-1]) {
					inc=value[i-1]+dp[c-size[i-1]][i-1];
				}
				exc=dp[c][i-1];
				dp[c][i]=Math.max(inc,exc);
			}
		}
		return dp[size.length-1][value.length-1];
	}
	
}
