package _6_Recursion_And_Bactracking;

import java.util.ArrayList;

public class _33_Combination_Sum {

	public static void main(String[] args) {
		int[] arr= {2,3,6,7};
		int item=7;
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		ArrayList<Integer> temp=new ArrayList<>();
		comb(arr,item,list,temp,0,0);
		System.out.println(list);
	}
	public static void comb(int [] arr, int item, ArrayList<ArrayList<Integer>> list,ArrayList<Integer> temp,int sum, int idx) {
		if(sum>item) {
			return;
		}
		if(sum==item) {
			list.add(new ArrayList<>(temp));
			return;
		}
		for(int i=idx;i<arr.length;i++) {
			temp.add(arr[i]);
			comb(arr, item, list,temp, sum+arr[i], i);
			temp.remove(temp.size()-1);
		}
	}
}
