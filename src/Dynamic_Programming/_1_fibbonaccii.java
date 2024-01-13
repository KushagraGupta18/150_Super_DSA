package Dynamic_Programming;

public class _1_fibbonaccii {

	public static void main(String[] args) {
		//Fibbonacci
		int n=5;
	    int[] dp=new int[n+1];
	    System.out.println(fibb(n));
		System.out.println(fibbTD(n,dp));
		System.out.println(fibbBU(n));
	}
	
	
	private static int fibb(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int f1=fibb(n-1);
		int f2=fibb(n-2);
		return f1+f2; 
	}


	//top down approach
	public static int fibbTD(int n, int[] dp) {
		if(n==0 || n==1) {					//fibbTD----> fibonacci top down
			return n;
		}
		if(dp[n]!=0) {				//dp ye hai
			return dp[n];
		}
		int f1=fibbTD(n-1,dp);
		int f2=fibbTD(n-2, dp);
		return dp[n]=f1+f2; 		//yaad krna
		
	}
	
	//bottom up approach (bottom up is more optimised than top down approach)
	public static int fibbBU(int n) {			//fibbBU---> fibonacci bottom up
		int[] dp=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<dp.length;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
}