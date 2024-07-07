package _10_Stack_And_Queue;
import java.util.*;
public class _5_Stack_Reverse {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		System.out.println("********************");
		reverse(st);
		System.out.println(st);
	}

	public static void reverse(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		int x=st.pop();
		reverse(st);
		insertDown(st,x);
	}

	public static void insertDown(Stack<Integer> st, int x) {
		if(st.isEmpty()) {
			st.push(x);
			return;
		}
		int y=st.pop();
		insertDown(st,x);
		st.push(y);
		
	}

}
