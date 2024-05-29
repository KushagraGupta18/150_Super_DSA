package _6_Recursion_And_Bactracking;

import java.util.*;

public class _20_Count_Main_Path_of_2d_Array {

	public static void main(String[] args) {
		int n=3;
		int m=3;
		ArrayList<String> list=new ArrayList<>();
		System.out.println(path(n,m,0,0,"",list));
		System.out.println(list);
	}

	public static int path(int n, int m, int cr, int cc, String ans,ArrayList<String> list) {
		if(cc>=m || cr>=n) {
			return 0;
		}
		if(cr==n-1 && cc==m-1) {
			list.add(ans);
			return 1;
		}
		
		return path(n,m,cr+1,cc,ans+'V',list)+path(n,m,cr,cc+1,ans+'H',list);
	}
}
