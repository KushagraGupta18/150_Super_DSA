package _10_Stack_And_Queue;

import java.util.Stack;

public class _12_Maximal_Rectangle {

	public static void main(String[] args) {
		int[][] matrix={{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
		int[][] arry=new int[matrix.length][matrix[0].length];
		int ans=0;
		for(int i=matrix.length-1;i>=0;i--) {
			for(int j=0;j<matrix[0].length;j++) {
				if(i==matrix.length-1) {
					arry[i][j]=matrix[i][j];
				}
				else {
					arry[i][j]=matrix[i][j]==1?arry[i+1][j]+1 : 0;
				}
			}
			ans=Math.max(ans, hist(arry[i]));
		}
		System.out.println(ans);
	}
	public static int hist(int[] arr) {
		Stack<Integer> st=new Stack<>();
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int r=i;
				int h=arr[st.pop()];
				if(st.isEmpty()) {
					ans=Math.max(ans, h*r);
				}
				else {
					int l=st.peek();
					ans=Math.max(ans, h*(r-l-1));
				}
			}
			st.push(i);
		}
		int r=arr.length;
		while(!st.isEmpty()) {
			int h=arr[st.pop()];
			if(st.isEmpty()) {
				ans=Math.max(ans, h*r);
			}
			else {
				int l=st.peek();
				ans=Math.max(ans, h*(r-l-1));
			}
		}
		return ans;
	}

}
