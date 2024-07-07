package _11_Linked_List;

import _11_Linked_List._2_Middle_Of_The_Linked_List.ListNode;

public class _3_Floyd_Cycle_Detection_Algorithm {

	public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	
	public class Solution {
	    public boolean hasCycle(ListNode head) {
	    	ListNode slow=head;
	        ListNode fast=head;
	        while(fast!=null && fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	            if(slow==fast){
	                return true;
	            }
	        }
	        return false;
	    }
	}
	
}
