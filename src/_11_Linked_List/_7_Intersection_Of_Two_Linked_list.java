package _11_Linked_List;

public class _7_Intersection_Of_Two_Linked_list {

	//160(leetcode)
	public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        ListNode temp1=headA;
	        ListNode temp2=headB;
	        boolean flag1=false;
	        boolean flag2=false;
	        while(true){
	            if(temp1==temp2){
	                return temp1;
	            }
	            if(temp1!=null){
	                temp1=temp1.next;
	            }
	            else if(flag1==false){
	                flag1=true;
	                temp1=headB;
	            }
	            else{
	                break;
	            }
	            if(temp2!=null){
	                temp2=temp2.next;
	            }
	            else if(flag2==false){
	                flag2=true;
	                temp2=headA;
	            }
	            else{
	                break;
	            }
	            
	        }
	        return null;
	        
	    }
	}
}
