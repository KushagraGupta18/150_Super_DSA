package _11_Linked_List;

public class _6_Reverse_linked_list_2 {

	//92(leetcode)
	public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	class Solution {
	    public ListNode reverseBetween(ListNode head, int left, int right) {
	        if(head==null || head.next==null){
	            return head;
	        }
	        if(left==right){
	            return head;
	        }
	        ListNode prev=null;
	        ListNode curr=head;
	        ListNode next=curr.next;
	        int idx=1;
	        ListNode left_1=null;
	        ListNode right_1=null;
	        ListNode left1=null;
	        ListNode right1=null;
	        while(curr!=null){
	            if(idx>=left && idx<=right){
	                curr.next=prev;
	            }
	            if(idx==left){
	                left1=curr;
	            }
	            if(idx==right){
	                right1=curr;
	            }
	            if(idx+1==left){
	                left_1=curr;
	            }
	            if(idx-1==right){
	                right_1=curr;
	            }
	            prev=curr;
	            curr=next;
	            if(next!=null){
	                next=next.next;
	            }
	            idx++;   
	        }
	        if(left_1!=null){
	            left_1.next=right1;
	        }
	        else{
	            head=right1;
	        }
	        left1.next=right_1;
	        return head;
	    }
	}
}
