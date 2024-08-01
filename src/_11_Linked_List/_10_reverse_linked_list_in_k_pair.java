package _11_Linked_List;
import java.util.*;

public class _10_reverse_linked_list_in_k_pair {


	//25(leetcode)
	public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	//by stack
	class Solution {
	    public ListNode reverseKGroup(ListNode head, int k) {
	        ListNode lim=new ListNode();
	        ListNode ans=lim;
	        ListNode curr=head;
	        Stack<ListNode> st=new Stack<>();
	        ListNode dummy=null;
	        while(curr!=null){
	            if(dummy==null){
	                dummy=curr;
	            }
	            st.add(curr);
	            curr=curr.next;
	            if(st.size()==k){
	                ListNode temp=new ListNode();
	                dummy=null;
	                reverse(st,temp);
	                lim.next=temp.next;
	                while(lim.next!=null){
	                    lim=lim.next;
	                }
	            }
	        }
	        lim.next=dummy;
	        return ans.next;
	    }
	    public void reverse(Stack<ListNode> st, ListNode temp){
	        while(!st.isEmpty()){
	            temp.next=st.pop();
	            temp=temp.next;
	        }
	        temp.next=null;
	    }
	}
	
	
	

}
