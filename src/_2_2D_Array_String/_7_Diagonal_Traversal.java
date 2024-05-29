package _2_2D_Array_String;
//leetcode question number---> 498
import java.util.*;
public class _7_Diagonal_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
		
		int n=mat.length;
		int m=mat[0].length;
		int[] ans=new int[n*m];//total no of blocks--->n*m
		int i=0;
		for(int diag=0;diag<= n+m-1;diag++) {//no of diagonal--->n+m-1
			int r=0;
			int c=0;
			if(diag<m) {//m-->col 
				r=0;
				c=diag;
			}
			else {
				r=diag-m+1;
				c=m-1;
			}
			ArrayList<Integer> list=new ArrayList<>();
			while(r<n && c>=0) {
				list.add(mat[r][c]);
				r++;
				c--;
			}
			if(diag%2==0) {
				Collections.reverse(list);
			}
			for(int item:list) {
				ans[i]=item;
				i++;
			}
			
		}
		for(int var=0;var<ans.length;var++) {
			System.out.print(ans[var]+" ");
		}
		
		
	}

}
