package _11_Linked_List;


public class _4_Floyd_Cycle_Removal_Algorithm {

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
	        ListNode meet=null;
	        ListNode prev=slow;
	        while(fast!=null && fast.next!=null){
	            prev=slow;
	            slow=slow.next;
	            fast=fast.next.next;
	            if(slow==fast){
	                meet=slow;		//meet point
	                break;
	                // return true;
	            }
	        }
	        
	      //Floyd cycle removal algo
	        if(meet==slow){
	            ListNode temp=head;
	            while(temp!=slow){			
	                prev=slow;
	                slow=slow.next;
	                temp=temp.next;
	            }
	            System.out.println(slow.val);	//starting point of loop(if loop/cycle is present)
	            prev.next=null;	//give null to prev.next so that cycle can remove
	        }
	        while(head!=null){		//print linkedlist after removing cycle
	            System.out.println(head.val);
	            head=head.next;
	        }
	        
	        return false;
	    }
	}
}
