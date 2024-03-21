package _1_Arrays;

public class _13_maximum_value_of_x {

	public static void main(String[] args) {
		int n=47;
		int ans=-1;
		int lo=1;
		int hi=n;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(mid*mid<=n) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		System.out.println(ans);
	}	

}
