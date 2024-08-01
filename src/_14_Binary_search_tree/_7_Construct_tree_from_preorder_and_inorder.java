package _14_Binary_search_tree;

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
		//phi-->preorder high
		//ilo-->inorder low
		//ihi-->inorder high
		public TreeNode create(int[] preorder, int plo, int phi, int[] inorder, int ilo, int ihi) {
			if(ilo>ihi || plo> phi) {
				return null;
			}
			TreeNode nn=new TreeNode(preorder[plo]);
			int i=Search(inorder,ilo,ihi,preorder[plo]);
			int net=i-ilo;//no. of element just after root preorder[plo]-->root element
			nn.left=create(preorder,plo+1,plo+net,inorder,ilo,i-1);
			nn.right=create(preorder,plo+net+1,phi,inorder,i+1,ihi);
			return nn;
			
		}
		
		public int Search(int[] inorder,int si,int ei,int item) {
			for(int i=si;i<=ei;i++) {
				if(inorder[i]==item) {
					return i;
				}
			}
			return -1;
		}
	
	
	
	    
	}
}
