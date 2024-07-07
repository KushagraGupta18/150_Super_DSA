package _10_Stack_And_Queue;
import java.util.*;
public class _13_Celebrity_Problem {

	public static void main(String[] args) {
		int[][] arr= {{0,0,1,0},{0,0,1,0},{0,0,0,0},{0,0,1,0}};
		cel(arr);
	}

	public static void cel(int[][] arr) {
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			st.push(i);
		}
		while(st.size()>1) {
			int x=st.pop();
			int y=st.pop();
			if(arr[x][y]==1) {
				st.push(y);
			}
			else {
				st.push(x);
			}
		}
		int x=st.pop();
		int c=0;
		for(int j=0;j<arr[0].length;j++) {
			if(arr[x][j]==1) {
				c=1;
				System.out.println("NO CELEBRITY");
				break;
			}
		}
		if(c==0) {
			System.out.println(x);
		}
	}
	
	

}
