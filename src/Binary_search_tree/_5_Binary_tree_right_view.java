package Binary_search_tree;
import java.util.*;
public class _5_Binary_tree_right_view {

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
	    int max=Integer.MIN_VALUE;
	    public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> ll=new ArrayList<>();
	        right(root,ll,0);
	        return ll;
	    }
	    public void right(TreeNode root, List<Integer> ll, int height){
	        if(root==null){
	            return;
	        }
	        if(height>max){
	            ll.add(root.val);
	            max=height;    
	        }
	        right(root.right,ll,height+1);
	        right(root.left,ll,height+1);
	    }
	}
	
}
