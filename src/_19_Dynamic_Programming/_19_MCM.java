package _19_Dynamic_Programming;

public class _19_MCM {
//same question--->spoj mixture
	public static void main(String[] args) {
		 
		int[] arr= {4,2,3,5,1};
		System.out.println(mcm(arr,0,arr.length-1));
		System.out.println(mcmbu(arr));
	}
	public static int mcm(int[] arr,int i, int j) {
		if(i+1==j) {
			return 0;
		}
		int ans=Integer.MAX_VALUE;
		for (int k = i+1; k < j; k++) {
			int fs=mcm(arr,i,k);
			int ss=mcm(arr,k,j);
			int self=arr[i]*arr[k]*arr[j];
			ans=Math.min(ans, fs+ss+self);
		}
		return ans;
	}

	public static int mcmbu(int[] arr) {
		int[][] dp=new int[arr.length][arr.length];
		for(int slide=2;slide<dp.length;slide++) {
			for(int j=slide;j<dp.length;j++) {
				int i=j-slide;
				int ans=Integer.MAX_VALUE;
				for (int k = i+1; k < j; k++) {
					int fs=dp[i][k];
					int ss=dp[k][j];
					int self=arr[i]*arr[k]*arr[j];
					ans=Math.min(ans, fs+ss+self);
				}
				dp[i][j]=ans;
			}
		}
		
		return dp[0][arr.length-1];
	}
}
