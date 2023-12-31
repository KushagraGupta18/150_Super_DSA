//leetcode question number--->951
package Binary_Tree;

import Binary_Tree._101_Symmetric_Tree.TreeNode;

public class _951_Flip_equivalent {

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
	public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return flipEqui(root1,root2);
    }
    public boolean flipEqui(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        boolean flip=flipEqui(root1.left,root2.right) && flipEqui(root1.right,root2.left);//mirror
        boolean noflip=flipEqui(root1.left,root2.left) && flipEqui(root1.right, root2.right);//no mirror
        return flip || noflip;
    }
	
}
