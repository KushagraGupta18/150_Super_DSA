//leetcode question number--->450
package Binary_search_tree;

import Binary_search_tree._701_insert_into_a_binary_search_tree.TreeNode;

public class _450_Delete_Node_BST {

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
	    public TreeNode deleteNode(TreeNode root, int key) {
	    	
	    	if(root.val<key) {
	    		root.right=deleteNode(root.right, key);
	    	}
	    	else if(root.val>key) {
	    		root.left=deleteNode(root.left, key);
	    	}
	    	//element mil gya isse delete krna hai
	    	else {
	    		
	    	}
	   }
	    
	}
}
