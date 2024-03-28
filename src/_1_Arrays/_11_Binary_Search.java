package _1_Arrays;

public class _11_Binary_Search {

	//why binary search is of log n base 2 time complexity
	//formulaes of gp--->
	//	An=a*r^(k-1)	//where An=last term , a=first term , r=common ratio , k=no. of terms
	// Sn=a*(r^n -1)/(r-1)	//where Sn=sum of all terms , n=no. of terms
	
	// n + n/2 + n/4 + -------- 2 + 1---->
	//1+2+4+  --------- n/4 +n/2 + n ---->k=total no. of terms ,n=last term
	
	//derive--->
	// so,   n=a*r^(k-1)
	//		 n=1*2^(k-1)
	//		 taking log base 2 both side
	//		 log2n=log2(2)^(k-1)
	//		 log2n =(k-1)*1
	//		 log2n+1=k
	//		 k=log2n(Hence Proved)
		
	
	
	public static void main(String[] args) {
		
		int[] arr= {2,5,8,9,12,14,15,16,17};
		System.out.println(Search(arr, 8));//print idx of item
	}
	public static int Search(int[] arr, int item) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return -1;
	}

}
