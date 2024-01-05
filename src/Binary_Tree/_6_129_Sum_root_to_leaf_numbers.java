//leetcode question number---> 129

package Binary_Tree;

public class _6_129_Sum_root_to_leaf_numbers {

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
	    public int sumNumbers(TreeNode root) {
	        return level(root,0); 
	    }
	    public int level(TreeNode nn,int sum1){
	        if(nn==null){
	            return 0;
	        }
	        if(nn.left==null && nn.right==null){
	            return sum1*10+nn.val;
	        }
	        int x=level(nn.left,sum1*10+nn.val);
	        int y=level(nn.right,sum1*10+nn.val);
	        return x+y;    
	    }
	}
}
