package _1_Arrays;
//leetcode question number-->278
public class _12_First_bad_version {

	public static void main(String[] args) {
		int n=5;
		System.out.println(firstBadVersion(n));
	}
	public static int firstBadVersion(int n) {
        int lo=1;
        int hi=n;
        int ans=-1;
        while(lo<=hi){
            // int mid=(int)(lo+hi)/2;  //it gives tle because value of mid out of range. e.g lo=2^31-1 hi=2^31-1 while adding these it will overflow
            int mid=lo+(hi-lo)/2;
            if(isBadVersion(mid)){//thie func is by default in leetcode like api
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
	public static boolean isBadVersion(int mid) {
		if(mid==4) {
			return true;
		}
		return false;
	}
}
