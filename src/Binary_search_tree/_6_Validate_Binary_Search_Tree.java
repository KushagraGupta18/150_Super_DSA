package Binary_search_tree;

public class _6_Validate_Binary_Search_Tree {

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
	    public boolean isValidBST(TreeNode root) {
	        return isbst(root).isBST;
	    }
	    public isBST isbst(TreeNode root){
	        if(root==null){
	            return new isBST();
	        }
	        isBST left=isbst(root.left);
	        isBST right=isbst(root.right);
	        isBST self=new isBST();
	        self.min=Math.min(left.min,Math.min(right.min,root.val));
	        self.max=Math.max(left.max,Math.max(right.max,root.val));
	        if(left.isBST==true && right.isBST==true && left.max<root.val && right.min>root.val){
	            self.isBST=true;
	        }
	        else{
	            self.isBST=false;
	        }
	        return self;
	    }
	}
	public class isBST{
	    boolean isBST=true;
	    long max=Long.MIN_VALUE;
	    long min=Long.MAX_VALUE;
	}
}
