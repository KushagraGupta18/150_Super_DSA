package _10_Stack_And_Queue;
import java.util.*;
public class _11_Histogram {

	public static void main(String[] args) {
		int[] arr= {1,2,3,2,1};
		int ans=Integer.MIN_VALUE;
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int r=i;
				int h=arr[st.pop()];
				if(st.isEmpty()) {
					ans=Math.max(ans, r*h);
				}
				else {
					int l=st.peek();
					ans=Math.max(ans, (r-l-1)*h);
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
				ans=Math.max(ans, (r-l-1)*h);
			}
		}
		System.out.println(ans);
		
	}

}
