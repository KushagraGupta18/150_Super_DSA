package _6_Recursion_And_Bactracking;
import java.util.*;
public class _18_Generate_Paranthesis {

	public static void main(String[] args) {
		int n=3;
		ArrayList<String> list=new ArrayList<>();
		generate(n,list,"",0,0);
		System.out.println(list);
	}

	public static void generate(int n, ArrayList<String> list, String ans,int open, int close) {
		if(open==close && open==n) {
			list.add(ans);
			return;
		}
		if(open<n) {
			generate(n,list,ans+'(',open+1,close);
		}
		if(close<open) {
			generate(n,list,ans+')',open,close+1);
		}
		
	}

}
