package _6_Recursion_And_Bactracking;
import java.util.*;
public class _32_Combination {

	public static void main(String[] args) {
		int n=4;
		int k=2;
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		ArrayList<Integer> temp=new ArrayList<>();
		comb(n,k,list,temp,0,1);
		System.out.println(list);
	}
	public static void comb(int n, int k, ArrayList<ArrayList<Integer>> list,ArrayList<Integer> temp,int ck, int idx) {
		if(ck>k) {
			return;
		}
		if(ck==k) {
			list.add(new ArrayList<>(temp));
			return;
		}
		for(int i=idx;i<=n;i++) {
			temp.add(i);
			comb(n, k, list,temp, ck+1, i+1);
			temp.remove(temp.size()-1);
		}
		
	}

}
