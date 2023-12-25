//Book Allocation Problem:---->
//
//You are given number of pages in n different books and m students. The books are arranged in ascending order of number of pages. Every student is assigned to read some consecutive books. The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.
//
//Input Format
//First line contains integer t as number of test cases. Next t lines contains two lines. For each test case, 1st line contains two integers n and m which represents the number of books and students and 2nd line contains n space separated integers which represents the number of pages of n books in ascending order.
//
//Constraints
//1 < t < 50
//1< n < 100
//1< m <= 50
//1 <= Ai <= 1000
//
//Output Format
//Print the maximum number of pages that can be assigned to students.
//
//Sample Input
//1
//4 2
//12 34 67 90
//Sample Output
//113 
//Explanation
//1st students : 12 , 34, 67 (total = 113)
//2nd students : 90 (total = 90)
//Print max(113, 90)

package Advanced_binary_search;
import java.util.*;
public class Book_allocation_problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int nob=sc.nextInt();//no. of books
			int nos=sc.nextInt();//no of students
			int[] books=new int[nob];
			for(int i=0;i<books.length;i++) {
				books[i]=sc.nextInt();
			}
			System.out.println(maximum_pages_minimum(books,nos));
		}
	}

	public static int maximum_pages_minimum(int[] books, int nos) {
		int lo=0;
		int hi=0;
		for(int i=0;i<books.length;i++) {
			hi+=books[i];
		}
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(ispossible(books,nos,mid)) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}

	public static boolean ispossible(int[] books, int nos, int mid) {
		int count_nos=0;
		int page_read=0;
		int i=0;
		while(i<books.length) {
			if(books[i]+page_read<=mid) {
				page_read+=books[i];
				i++;
			}
			else {
				count_nos++;
				page_read=0;
			}
			if(count_nos>=nos) {
				return false;
			}
		}
		return true;
	}
}
