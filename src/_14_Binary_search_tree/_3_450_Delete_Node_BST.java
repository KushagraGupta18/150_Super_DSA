//leetcode question number--->450
package _14_Binary_search_tree;

public class _3_450_Delete_Node_BST {

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
	    	if(root==null) {
	    		return null;
	    	}
	    	if(root.val<key) {
	    		root.right=deleteNode(root.right, key);
	    	}
	    	else if(root.val>key) {
	    		root.left=deleteNode(root.left, key);
	    	}
	    	//element mil gya isse delete krna hai
	    	else {
	    		//1 child and 0 child
	    		if(root.left==null) {
	    			return root.right;
	    		}
	    		else if(root.right==null) {
	    			return root.left;
	    		}
	    		//2 child
	    		//way 1--->deleted node ki jgh left tree ke maximum ko rkhdo
	    		//way 2--->deleted node ki jgh right tree ke minimum ko rkhdo
	    		else {
	    			int lmax=max(root.left);
	    			root.left=deleteNode(root.left,lmax);
	    			root.val=lmax;
	    		}
	    	}
	    	return root;
	   }
	   
	    public int max(TreeNode root) {
	    	if(root==null) {
	    		return Integer.MIN_VALUE;
	    	}
	    	int r=max(root.right);//right ki call se kaam chl jayega kyuki bst hai
	    	return Math.max(root.val, r);
	    }
	    
//	    public int min(TreeNode root) {
//	    	if(root==null) {
//	    		return Integer.MAX_VALUE;
//	    	}
//	    	int r=min(root.left);//left ki call se kaam chl jayega kyuki bst hai
//	    	return Math.max(root.val, r);
//	    }
	}
}
