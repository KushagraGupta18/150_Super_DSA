//Leetcode question number --->101
package Binary_Tree;

import Binary_Tree._112_Path_Sum.TreeNode;

public class _101_Symmetric_Tree {
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
	//symmetric means mirror
	class Solution {
	    public boolean isSymmetric(TreeNode root) {
	    	return Mirror(root.left , root.right);
	    	
	    }

		public boolean Mirror(TreeNode root1, TreeNode root2) {
			if(root1==null && root2==null) {
				return true;
			}
			if(root1==null || root2==null) {
				return false;
			}
			if(root1.val!=root2.val) {
				return false;
			}
			boolean left=Mirror(root1.left, root2.right);
			boolean right=Mirror(root1.right, root2.left);
			return left && right;
		}
	}
}
