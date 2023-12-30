//leetcode question number --->112
package Binary_Tree;

public class _112_Path_Sum {

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
	    public boolean hasPathSum(TreeNode root, int targetSum) {
	        if(root==null) {
	        	return false;
	        }
	    	if(root.left==null && root.right==null && targetSum-root.val==0){
	    		return true;	
	    	}
	    	
	    	return hasPathSum(root.left, targetSum-root.val) ||hasPathSum(root.right, targetSum-root.val);
	    }
	}
	
}
