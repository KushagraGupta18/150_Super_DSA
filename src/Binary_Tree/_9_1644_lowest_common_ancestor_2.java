////Leetcode question number---> 1644

package Binary_Tree;

public class _9_1644_lowest_common_ancestor_2 {

	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
	class Solution {
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(find(root,p)==false || find(root,q)==false) {
	        	return null;
	        }
	        return LCA(root,p,q);
	    }
	    public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){
	    	if(root==null){
	            return null;
	        }
	        if(root==p || root==q){
	            return root;
	        }
	        TreeNode left=LCA(root.left, p, q);
	        TreeNode right=LCA(root.right, p, q);
	        if(left!=null && right!=null){
	            return root;
	        }
	        else if(right==null){
	            return left;
	        }
	        else{
	            return right;
	        }
	    }
	    public boolean find(TreeNode root, TreeNode ele) {
	    	if(root==null) {
	    		return false;
	    	}
	    	if(root==ele) {
	    		return true;
	    	}    	
	    	return find(root.left,ele) || find(root.right, ele);
	    }
	}
}
