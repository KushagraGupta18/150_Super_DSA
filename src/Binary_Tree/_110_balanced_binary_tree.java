//leetcode question number--->110

package Binary_Tree;

public class _110_balanced_binary_tree {

	public class TreeNode {

		int val;
		TreeNode left;
		TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
        	this.val = val;
        	this.left = left;
        	this.right = right;
        }	
	}
	
	
	class Solution {
		public boolean isBalanced1(TreeNode root) {
	        return isBalanced(root).isbalance;
	    }
	    public diapair isBalanced(TreeNode root) {
	        if(root==null) {
	        	return new diapair();
	        }
	    	diapair ldp=isBalanced(root.left);
	    	diapair rdp=isBalanced(root.right);
	    	diapair sdp=new diapair();
	    	sdp.height=Math.max(ldp.height, rdp.height)+1;
	    	boolean flag=false;
	    	if(Math.abs(ldp.height-rdp.height)<=1) {
	    		flag=true;
	    	}
	    	sdp.isbalance=ldp.isbalance==true && rdp.isbalance==true && flag==true;
	    	return sdp;
	    }
	}
	class diapair{
		int height=-1;
		boolean isbalance=true;
	}
	
}
