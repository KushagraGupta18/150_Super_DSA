package _10_Stack_And_Queue;
import java.util.*;
public class _9_Next_Greater_Element {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		int[] arr= {11,2,3,23,13,9,15};
		int[] ans=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
				int idx=st.pop();
				ans[idx]=arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			int idx=st.pop();
			ans[idx]=-1;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

}
