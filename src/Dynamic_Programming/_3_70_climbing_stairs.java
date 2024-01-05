//leetcode question number--->70
package Dynamic_Programming;

public class _3_70_climbing_stairs {

	public static void main(String[] args) {
		
		int n=3;
		int[] dp=new int[n+1];
		System.out.println(climb(n,dp));
	}
	public static int climb(int n,int[] dp){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int step1=climb(n-1,dp);
        int step2=climb(n-2,dp);
        return dp[n]=step1+step2;
    }

}
