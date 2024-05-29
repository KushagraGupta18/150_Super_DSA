package _6_Recursion_And_Bactracking;
import java.util.*;
public class _19_Main_Path_of_2d_array {

	public static void main(String[] args) {
		int n=3;
		int m=3;
		ArrayList<String> list=new ArrayList<>();
		path(n,m,0,0,"",list);
		System.out.println(list);
	}

	public static void path(int n, int m, int cr, int cc, String ans,ArrayList<String> list) {
		if(cc>=m || cr>=n) {
			return;
		}
		if(cr==n-1 && cc==m-1) {
			list.add(ans);
			return;
		}
		
		path(n,m,cr+1,cc,ans+'V',list);
		path(n,m,cr,cc+1,ans+'H',list);
	}
	

}
