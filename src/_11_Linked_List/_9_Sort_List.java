package _11_Linked_List;


public class _9_Sort_List {

	//148(leetcode)
	public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	class Solution {
	    public ListNode sortList(ListNode head) {
	        if(head==null || head.next==null){
	            return head;
	        }
	        ListNode mid=middleNode(head);
	        ListNode midnext=mid.next;
	        mid.next=null;
	        ListNode A=sortList(head);
	        ListNode B=sortList(midnext);
	        return mergeTwoLists(A,B);
	    }
	    public ListNode middleNode(ListNode head) {
	        ListNode slow=head;
	        ListNode fast=head;
	        while(fast!=null && fast.next!=null && fast.next.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        return slow;
	    }
	    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode temp=new ListNode();
	        ListNode ans=temp;
	        while(list1!=null && list2!=null){
	            if(list1.val<=list2.val){
	                ListNode n=new ListNode(list1.val);
	                temp.next=n;
	                temp=n;
	                list1=list1.next;
	            }
	            else{
	                ListNode n=new ListNode(list2.val);
	                temp.next=n;
	                temp=n;
	                list2=list2.next;
	            }
	        }
	        if(list1!=null){
	            temp.next=list1;
	        }
	        if(list2!=null){
	            temp.next=list2;
	        }
	        return ans.next;
	    }

	}
}
