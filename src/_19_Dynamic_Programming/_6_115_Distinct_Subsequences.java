//leetcode question number--->115
package _19_Dynamic_Programming;

public class _6_115_Distinct_Subsequences {

	public static void main(String[] args) {
		String s="rabbbit";
		String t="rabbit";
		int[][] dp=new int[t.length()+1][s.length()];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j]=-1;
			}
		}
        System.out.println(Distinct_Subseq(s, t, 0, 0,dp));
        System.out.println(Distinct_SubseqBU(s,t));
	}
	//top down approach
	public static int Distinct_Subseq(String s1, String t1, int i, int j,int[][] dp) {		
		if(j==t1.length()) {
			return 1;
		}
		if(i==s1.length()) {
			return 0;
		}
		if(dp[j][i]!=-1) {
			return dp[j][i];
		}
		int inc=0;
		int exc=0;
		if(s1.charAt(i)==t1.charAt(j)) {
			inc=Distinct_Subseq(s1, t1, i+1, j+1,dp);
		}
		exc=Distinct_Subseq(s1, t1, i+1, j,dp);
		return dp[j][i]= inc+exc;
	}

	//bottom up approach
	public static int Distinct_SubseqBU(String s, String t){
        int dp[][] = new int[t.length()+1][s.length()+1];
        for(int i=0; i<=s.length(); i++){
        	dp[t.length()][i]=1;
        }

        for(int j=t.length()-1; j>=0; j--){
        	for(int i=s.length()-1; i>=0; i--){
                if(s.charAt(i)==t.charAt(j)){
                    dp[j][i] = dp[j+1][i+1]+dp[j][i+1];
                }else{
                    dp[j][i] = dp[j][i+1];
                }
            }
        }
        return dp[0][0];
    }


}