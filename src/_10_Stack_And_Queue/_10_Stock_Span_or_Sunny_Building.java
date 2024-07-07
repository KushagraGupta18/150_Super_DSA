package _10_Stack_And_Queue;
import java.util.*;
public class _10_Stock_Span_or_Sunny_Building {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		int[] arr= {9,11,23,15,38,42,37};
		int[] ans=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i]=i+1;
			}	
			else {
				ans[i]=i-st.peek();
			}
			st.push(i);
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}

}
