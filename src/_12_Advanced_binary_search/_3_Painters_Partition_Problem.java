//Painter's Partition Problem Java:---->
//Given K painters to paint N boards where each painter takes 1 unit of time to paint 1 unit of boards i.e. if the length of a particular board is 5, it will take 5 units of time to paint the board. Compute the minimum amount of time to paint all the boards.
//
//Note that:
//
//Every painter can paint only contiguous segments of boards.
//A board can only be painted by 1 painter at maximum.
//Input Format
//First line contains K which is the number of painters. Second line contains N which indicates the number of boards. Third line contains N space separated integers representing the length of each board.
//
//Constraints
//1 <= K <= 10
//1 <= N <= 10
//1<= Length of each Board <= 10^8
//
//Output Format
//Output the minimum time required to paint the board.
//
//Sample Input
//2
//2
//1 10
//Sample Output
//10

package _12_Advanced_binary_search;
import java.util.*;
public class _3_Painters_Partition_Problem {
	//siliar to book allocation problem
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nop=sc.nextInt();//no. of painters
		int nob=sc.nextInt();//no of boards
		int[] boards=new int[nob];
		for(int i=0;i<boards.length;i++) {
			boards[i]=sc.nextInt();
		}
		System.out.println(minimum_time(boards,nop));
	}

	public static int minimum_time(int[] boards, int nop) {
		int lo=0;
		int hi=0;
		for(int i=0;i<boards.length;i++) {
			hi+=boards[i];
		}
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isPossible(boards,nop,mid)) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}

	public static boolean isPossible(int[] boards, int nop, int mid) {
		int count_nop=1;
		int paint_board=0;
		int i=0;
		while(i<boards.length) {
			if(boards[i]+paint_board<=mid) {
				paint_board+=boards[i];
				i++;
			}
			else {
				count_nop++;
				paint_board=0;
			}
			if(count_nop>nop) {
				return false;
			}
		}
		return true;
	}
	
	

}
