package _11_Linked_List;

public class _2_Middle_Of_The_Linked_List {

	//876(leetcode)
	public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	class Solution {
	    public ListNode middleNode(ListNode head) {
	    	ListNode slow=head;
	        ListNode fast=head;
	        while(fast!=null && fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        return slow;
	    }
	}
}
