package Binary_search_tree;

import java.util.*;
public class _7_Construct_tree_from_preorder_and_inorder {

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
	    public TreeNode buildTree(int[] preorder, int[] inorder) {
	        return create(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
	    }

	    //plo-->preorder low
		//phi-->preordr high
		//ilo-->inorder low
		//ihi-->inordr high
		private TreeNode create(int[] preorder, int plo, int phi, int[] inorder, int ilo, int ihi) {
			
			
		}
	
	
	
	    
	}
}
