//Aggressive Cows
//Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1,…,xN (0 <= xi <= 1,000,000,000).
//
//His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?
//
//Input Format
//First line contains N and C, separated by a single space, representing the total number of stalls and number of cows respectively. The next line contains N integers containing the indexes of stalls.
//
//Constraints
//2 <= N <= 100,000
//0 <= xi <= 1,000,000,000
//2 <= C <= N
//
//Output Format
//Print one integer: the largest minimum distance.
//
//Sample Input
//5 3
//1 2 8 4 9
//Sample Output
//3
//Explanation
//Problem Credits - (Spoj)[http://www.spoj.com/problems/AGGRCOW/]




package Advanced_binary_search;

import java.util.*;

public class _1_Aggressive_Cows {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nos=sc.nextInt();//no of stalls
		int noc=sc.nextInt();//no of cows
		int[] stalls=new int[nos];
		for(int i=0;i<stalls.length;i++) {
			stalls[i]=sc.nextInt();
		}
		Arrays.sort(stalls);
		System.out.println(findlarmindist(stalls,noc));
	}

	public static int findlarmindist(int[] stalls, int noc) {
		int lo=0;
		int hi=stalls[stalls.length-1]-stalls[0];
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(ispossible(stalls,noc,mid)) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}

	public static boolean ispossible(int[] stalls, int noc, int mid) {
		int cow=1;
		int pos=stalls[0];
		int i=1;
		while(i<stalls.length) {
			if(stalls[i]-pos>=mid) {
				cow++;
				pos=stalls[i];
			}
			i++;
			if(cow==noc) {
				return true;
			}
		}
		return false;
	}

}
